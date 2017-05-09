/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.unice.polytech.si3.reseaux.prog_reseaux;

import fr.unice.polytech.si3.reseaux.prog_reseaux.protocol.*;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class Client {


    public static void main(String[] s){
        new Client().start(s[0], Integer.valueOf(s[1]),s[2]);
    }
    public Client(){

    }

    public void start(String server, int port, String type){
        Scanner sc  = new Scanner(System.in);
        Object object = null;
        switch (type.toLowerCase()){
            case "add" :
                System.out.println("nom etudian et l'email\n");
                Etudiant etudiant = new Etudiant(sc.next(),sc.next());
                System.out.println("libelle de l'idee\n");
                String libelle = sc.next();
                System.out.println("description de l'idee\n");
                String description = sc.next();
                object= new Idee(etudiant,libelle,description);
                break;
            case "list":
                object = null;
                break;


        }
        try{
            Requete requete = new Requete(type,object );

            Socket socketConnection = new Socket(server, port);

            ObjectOutputStream clientOutputStream =
                    new ObjectOutputStream(socketConnection.getOutputStream());

            ObjectInputStream clientInputStream = new
                    ObjectInputStream(socketConnection.getInputStream());

            clientOutputStream.writeObject(requete);

            Requete reponse = (Requete)clientInputStream.readObject();
            System.out.println(reponse.toString());
            clientInputStream.close();
            clientOutputStream.close();
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
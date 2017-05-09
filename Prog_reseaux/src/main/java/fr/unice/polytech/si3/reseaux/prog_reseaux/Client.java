/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.unice.polytech.si3.reseaux.prog_reseaux;

import fr.unice.polytech.si3.reseaux.prog_reseaux.protocol.Protocol;
import fr.unice.polytech.si3.reseaux.prog_reseaux.protocol.Requete;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

/**
 *
 * @author user
 */
public class Client {

    public Client(){

    }

    public void start(String server, int port){
        try{
            Requete requete = new Requete(Protocol.ADD, null);

            Socket socketConnection = new Socket(server, port);
            ObjectOutputStream clientOutputStream =
                    new ObjectOutputStream(socketConnection.getOutputStream());
            ObjectInputStream clientInputStream = new
                    ObjectInputStream(socketConnection.getInputStream());

            clientOutputStream.writeObject(requete);

            Requete reponse = (Requete)clientInputStream.readObject();

            clientInputStream.close();
            clientOutputStream.close();
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
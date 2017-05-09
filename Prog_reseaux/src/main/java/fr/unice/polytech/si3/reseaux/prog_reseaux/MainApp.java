/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.unice.polytech.si3.reseaux.prog_reseaux;

import fr.unice.polytech.si3.reseaux.prog_reseaux.protocol.Etudiant;
import fr.unice.polytech.si3.reseaux.prog_reseaux.protocol.Idee;

/**
 *
 * @author rash
 */
public class MainApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Idee idee = new Idee(new Etudiant("Baroghel", "ab.gmail.com"), "Super idée", "c'est une super idée");
        idee.addParticipant(new Etudiant("rachida", "princesse06@gmail.com"));
        idee.addParticipant(new Etudiant("aghiles", "larabedu06@mekness.algez"));

        System.out.println(idee.toString());
        /*
        if(args[0].equals("server")){
            new Serveur().start(Integer.parseInt(args[1]));
        }else if(args[0].equals("client")){
            new Client().start(args[1], Integer.parseInt(args[2]));
        }else {
            System.out.println("gegeg");
        }*/
    }
    
}

package fr.unice.polytech.si3.reseaux.prog_reseaux;

import java.util.Scanner;

/**
 * @author 
 */
public class MainApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	String a = sc.nextLine();
        if(a.equals("a"))
        	new Serveur();
        else
        	new Client();
    }
    
}

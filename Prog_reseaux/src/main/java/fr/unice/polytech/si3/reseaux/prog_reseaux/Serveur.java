package fr.unice.polytech.si3.reseaux.prog_reseaux;

import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.UnknownHostException;

/**
 * @author Azu-Chan
 */
public class Serveur {
	private static Integer port;
	private static ServerSocket servSoc;
    
    public static void main(String args[]){
    	if(args.length != 1){
    		usage();
    		System.exit(1);
    	}
    	
    	Serveur serv = new Serveur();
    	
    	try{
    		port = new Integer(args[0]);
    		
    		servSoc = new ServerSocket(port.intValue());
    		
    		msgBienvenue();
    		
    		while(true){
    			new ServerThread(servSoc.accept(), serv);
    		}
    	}
    	catch(Exception e){
    		e.printStackTrace();
    	}
    }
    
    private static void usage(){
    	System.out.println("Le programme se lance avec 1 argument (le port).");
    }
    
    private static void msgBienvenue() throws UnknownHostException{
    	System.out.println("----------");
    	System.out.println("Serveur : Par Aghiles Dziri et Dylan Ritrovato");
    	System.out.println("Copyright : 2017 - https://nepnep.000webhostapp.com/");
    	System.out.println("Derniere version : 09/05/2016");
    	System.out.println("----------");
    	System.out.println("Adresse ip : "+ InetAddress.getLocalHost().getHostAddress().toString());
        System.out.println("Demarre sur le port : "+ port.toString());
        System.out.println("----------");
    }
}

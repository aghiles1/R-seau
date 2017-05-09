package fr.unice.polytech.si3.reseaux.prog_reseaux;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author Azu-Chan
 */
public class Serveur {
    ServerSocket serv;
    Socket client;
    
    public Serveur(){
    	try {
			serv = new ServerSocket(Configuration.NUM_PORT);
		
			client = serv.accept();
			
			System.out.println("co ok");
			serv.close();
			client.close();
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
    }
}

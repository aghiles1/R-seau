package fr.unice.polytech.si3.reseaux.prog_reseaux;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * @author 
 */
public class Client {
	Socket client;
	
	public Client(){
		try {
			client = new Socket(Configuration.NOM_MACHINE, Configuration.NUM_PORT);
			
			client.close();
		} catch (UnknownHostException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		
	}
    
}

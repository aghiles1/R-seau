package fr.unice.polytech.si3.reseaux.prog_reseaux;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

import fr.unice.polytech.si3.reseaux.prog_reseaux.protocol.Requete;

public class ServerThread implements Runnable{
	ObjectInputStream servIn;
    ObjectOutputStream servOut;
    Thread t;
    
    Serveur serv;
    Socket socCli;
	
	public ServerThread(Socket socCli, Serveur serv){
		this.serv = serv;
		this.socCli = socCli;
		
		System.out.println("Un client s'est connecté : " + this.socCli.getInetAddress());
		
		t = new Thread(this);
		t.start();
	}

	@Override
	public void run() {
		Requete r;
		try{
			while(true){
				System.out.println("En attente d'une requête de : " + this.socCli.getInetAddress());
				
				servIn = new ObjectInputStream(socCli.getInputStream());
				servOut = new ObjectOutputStream(socCli.getOutputStream());
				
				r = (Requete) servIn.readObject();

                System.out.println("Reçu chez " + this.socCli.getInetAddress() + " : " + r.toString());

                Requete reponse = new Requete(r.getType(), null);

                servOut.writeObject(reponse);

                servIn.close();
                servOut.close();
                
				System.out.println("Réponse envoyée à : " + this.socCli.getInetAddress());
			}
		}
		catch(Exception e){
			e.printStackTrace();
		}
		
	}
}

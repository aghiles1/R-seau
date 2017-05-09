package fr.unice.polytech.si3.reseaux.prog_reseaux;

import fr.unice.polytech.si3.reseaux.prog_reseaux.protocol.Protocol;
import fr.unice.polytech.si3.reseaux.prog_reseaux.protocol.Requete;

import java.io.*;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketAddress;
import java.net.UnknownHostException;

/**
 * @author 
 */
public class Client {
	Socket client;

	public static void main(String[] s){
        new Client().start(s[1],Integer.valueOf(s[2]));
    }
	
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
            socketConnection.close();
        }catch (Exception e){
            System.out.println(e);
        }
    }


}

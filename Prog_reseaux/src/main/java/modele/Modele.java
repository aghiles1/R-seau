package modele;

import fr.unice.polytech.si3.reseaux.prog_reseaux.protocol.Idee;

import java.util.ArrayList;
import java.util.List;

public abstract class Modele {
	private static List<Idee> i;
	
	public static void init(){
		i = new ArrayList<>();
	}
	
	public static void addIdee(Idee a){
		i.add(a);
	}
	
	public static List<Idee> getList(){
		return i;
	}
}

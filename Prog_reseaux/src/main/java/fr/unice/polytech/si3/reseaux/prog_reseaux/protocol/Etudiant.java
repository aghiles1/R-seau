package fr.unice.polytech.si3.reseaux.prog_reseaux.protocol;

/**
 * @author Rachida Zongo
 */
public class Etudiant {
    private String nom;
    private String email;
    
    public Etudiant(String nom, String email){
        this.nom = nom;
        this.email = email;
    }
    
    public String getNom(){
        return this.nom;
    }
    public String getEmail(){
        return this.email;
    }
}

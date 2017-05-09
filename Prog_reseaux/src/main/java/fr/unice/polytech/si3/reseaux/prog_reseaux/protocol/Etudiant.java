package fr.unice.polytech.si3.reseaux.prog_reseaux.protocol;

/**
 *
 * Classe qui contient les informations d'un étudiant.
 *
 * @author Rachida, Elie
 */
public class Etudiant {
    private String nom;
    private String email;

    /**
     * Constructeur.
     * @param nom nom de l'étudiant
     * @param email adresse email de l'étudiant
     */
    public Etudiant(String nom, String email){
        this.nom = nom;
        this.email = email;
    }

    /**
     * @return nom de l'étudiant
     */
    public String getNom(){
        return this.nom;
    }

    /**
     * @return adresse email de l'étudiant
     */
    public String getEmail(){
        return this.email;
    }

    @Override
    public String toString() {
        return "Etudiant{" +
                "nom='" + nom + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}

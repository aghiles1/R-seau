package fr.unice.polytech.si3.reseaux.prog_reseaux.protocol;

/**
 * @author Rachida Zongo
 */
public class Erreur {
    private String nom;
    private String desc;

    public Erreur(String nom, String desc) {
        this.nom = nom;
        this.desc = desc;
    }

    public String getNom() {
        return nom;
    }

    public String getDesc() {
        return desc;
    }
}

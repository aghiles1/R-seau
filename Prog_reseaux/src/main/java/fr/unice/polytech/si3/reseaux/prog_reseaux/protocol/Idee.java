package fr.unice.polytech.si3.reseaux.prog_reseaux.protocol;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Rachida Zongo
 */
public class Idee {
    private Etudiant proprio;
    private String libelle;
    private List<Etudiant> participants;

    public Idee(String libelle) {
        this.libelle = libelle;
        this.participants = new ArrayList<>();
    }

    public Idee(Etudiant proprio, String libelle) {
        this.proprio = proprio;
        this.libelle = libelle;
        this.participants = new ArrayList<>();
    }

    public Etudiant getProprio() {
        return proprio;
    }

    public String getLibelle() {
        return libelle;
    }

    public List<Etudiant> getParticipants() {
        return participants;
    }

    public void addParticipant(Etudiant etudiant){
        participants.add(etudiant);
    }
}

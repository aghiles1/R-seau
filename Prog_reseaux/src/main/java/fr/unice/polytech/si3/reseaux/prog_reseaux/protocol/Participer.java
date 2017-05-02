package fr.unice.polytech.si3.reseaux.prog_reseaux.protocol;

/**
 * @author Rachida Zongo
 */
public class Participer {
    private Idee idee;
    private Etudiant participant;

    public Participer(Idee idee, Etudiant participant) {
        this.idee = idee;
        this.participant = participant;
    }

    public Idee getIdee() {
        return idee;
    }

    public Etudiant getParticipant() {
        return participant;
    }
}

package fr.unice.polytech.si3.reseaux.prog_reseaux.protocol;

/**
 * Classe servant à la communication.
 * Utilisée lorsque l'on souhaite ajouter un participant à une idée.
 * Contient l'étudiant participant et l'idée.
 *
 * @author Rachida, Elie
 */
public class Participer {
    private Idee idee;
    private Etudiant participant;

    /**
     * Constructeur
     * @param idee idée concernée
     * @param participant participant à ajouter
     */
    public Participer(Idee idee, Etudiant participant) {
        this.idee = idee;
        this.participant = participant;
    }

    /**
     * @return idée concernée
     */
    public Idee getIdee() {
        return idee;
    }

    /**
     * @return participant à ajouter
     */
    public Etudiant getParticipant() {
        return participant;
    }

    @Override
    public String toString() {
        return "Participer{" +
                "idee=" + idee +
                ", participant=" + participant +
                '}';
    }
}

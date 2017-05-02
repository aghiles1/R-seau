/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.unice.polytech.si3.reseaux.prog_reseaux.protocol;

/**
 *
 * @author user
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

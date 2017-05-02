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

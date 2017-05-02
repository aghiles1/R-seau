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

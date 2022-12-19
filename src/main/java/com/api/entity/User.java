/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.api.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

/**
 *
 * @author succes
 */
@Entity
@Table(name = "Utilisateur")
public class User {
    @Id
    @Column(name = "id")
    private int user_id;
    @Column(name = "nom")
    private String user_nom;
    @Column(name = "prenom")
    private String user_prenom;
    @Column(name = "role")
    private String user_role;
    
    //constructeur

    public User() {
    }

    public User(int user_id, String user_nom, String user_prenom, String user_role) {
        this.user_id = user_id;
        this.user_nom = user_nom;
        this.user_prenom = user_prenom;
        this.user_role = user_role;
    }
    
    // getter & setter 

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public String getUser_nom() {
        return user_nom;
    }

    public void setUser_nom(String user_nom) {
        this.user_nom = user_nom;
    }

    public String getUser_prenom() {
        return user_prenom;
    }

    public void setUser_prenom(String user_prenom) {
        this.user_prenom = user_prenom;
    }

    public String getUser_role() {
        return user_role;
    }

    public void setUser_role(String user_role) {
        this.user_role = user_role;
    }
    
    //tostring

    @Override
    public String toString() {
        return "Utilisateur{" + "identifiant :" + user_id + ", nom: " + user_nom + ", prenom: " + user_prenom + ", role:" + user_role + '}';
    }

    
    
    
}

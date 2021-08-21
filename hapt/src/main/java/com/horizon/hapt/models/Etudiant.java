package com.horizon.hapt.models;

import java.util.Date;

public class Etudiant {
    private String nom;
    private String prenom;
    private String addrese;
    private int tel;
    private String password;
    private Date dateN;

    public Etudiant(String nom, String prenom, String addrese, int tel, String password, Date dateN) {
        this.setNom(nom);
        this.setPrenom(prenom);
        this.setAddrese(addrese);
        this.setTel(tel);
        this.setPassword(password);
        this.setDateN(dateN);
    }

    public Date getDateN() {
        return dateN;
    }

    public void setDateN(Date dateN) {
        this.dateN = dateN;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getTel() {
        return tel;
    }

    public void setTel(int tel) {
        this.tel = tel;
    }

    public String getAddrese() {
        return addrese;
    }

    public void setAddrese(String addrese) {
        this.addrese = addrese;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
}

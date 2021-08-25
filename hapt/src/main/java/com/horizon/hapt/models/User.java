package com.horizon.hapt.models;

import java.util.Date;
import java.util.List;

public class User {
    private String mail;
    private String password;
    private String nom;
    private String prenom;
    private String addrese;
    private int tel;
    private Date dateN;
    private int cin;
    private String niveau;
    private Long id;
    private List<Role> listeRole;
    private List<Etudiant> listeetudiant;
    private List<Entreprise> listeentreprise;

    public User(String nom, String prenom, String addrese, int tel, String contact, Date dateN, int cin, String niveau,
            String mail, String password, Long id) {
        this.setNom(nom);
        this.setPrenom(prenom);
        this.setAddrese(addrese);
        this.setTel(tel);
        this.setMail(mail);
        this.setPassword(password);
        this.setDateN(dateN);
        this.setCin(cin);
        this.setNiveau(niveau);
        this.setId(id);

    }

    public List<Entreprise> getListeentreprise() {
        return listeentreprise;
    }

    public void setListeentreprise(List<Entreprise> listeentreprise) {
        this.listeentreprise = listeentreprise;
    }

    public List<Etudiant> getListeetudiant() {
        return listeetudiant;
    }

    public void setListeetudiant(List<Etudiant> listeetudiant) {
        this.listeetudiant = listeetudiant;
    }

    public List<Role> getListeRole() {
        return listeRole;
    }

    public void setListeRole(List<Role> listeRole) {
        this.listeRole = listeRole;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMail() {
        return mail;
    }

    public String getNiveau() {
        return niveau;
    }

    public void setNiveau(String niveau) {
        this.niveau = niveau;
    }

    public int getCin() {
        return cin;
    }

    public void setCin(int cin) {
        this.cin = cin;
    }

    public Date getDateN() {
        return dateN;
    }

    public void setDateN(Date dateN) {
        this.dateN = dateN;
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

}
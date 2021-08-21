package com.horizon.hapt.models;

public class Role {
    private long id;
    private String nom;

    public Role(long id, String nom) {
        this.setId(id);
        this.setNom(nom);
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}

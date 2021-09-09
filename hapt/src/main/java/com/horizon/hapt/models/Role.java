package com.horizon.hapt.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(schema = "haptdb", uniqueConstraints = @UniqueConstraint(columnNames = "nom"))
public class Role {
    private static final long serialVersionUID = 1l;

    @Column
    private long id;
    @Column
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

    public long getSetserrialVersionUID() {
        return serialVersionUID;
    }
}

package com.horizon.hapt.models;

public class Formateur {
    private Long id;
    private int experience;

    public Formateur(int experience, Long id) {
        this.id = id;
        this.experience = experience;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience= experience;
    }
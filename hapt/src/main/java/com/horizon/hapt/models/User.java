package com.horizon.hapt.models;

public class User {
    private String mail;
    private String password;

    public User(String mail, String password) {
        this.setMail(mail);
        this.setPassword(password);
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }
}
package de.entities;


public class User{
    private String name;
    private String vorname;
    private String emailAdresse;
    private String Adresse;

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public String getVorname() {
        return vorname;
    }

    public void setVorname(final String vorname) {
        this.vorname = vorname;
    }

    public String getEmailAdresse() {
        return emailAdresse;
    }

    public void setEmailAdresse(final String emailAdresse) {
        this.emailAdresse = emailAdresse;
    }

    public String getAdresse() {
        return Adresse;
    }

    public void setAdresse(final String adresse) {
        Adresse = adresse;
    }

    public User(final String name, final String vorname, final String emailAdresse, final String adresse) {
        this.name = name;
        this.vorname = vorname;
        this.emailAdresse = emailAdresse;
        Adresse = adresse;
    }
}
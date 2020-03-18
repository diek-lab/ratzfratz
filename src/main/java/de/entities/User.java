package de.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="users")
public class User{
    private int id;
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
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
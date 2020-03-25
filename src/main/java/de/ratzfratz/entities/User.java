package de.ratzfratz.entities;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import de.ratzfratz.security.Authority;

@Entity
@Table(name ="users")
public class User{
    private int id;
    private String name;
    private String vorname;
    private String emailAdresse;
    private String adresse;
    private String password;
    private Set<Authority> authorities = new HashSet<>();
    private Nachricht nachricht;
    private Auftrag auftrag;

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
        return adresse;
    }

    public void setAdresse(final String adresse) {
        this.adresse = adresse;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer getId() {
        return id;
    }

    public void setId(final Integer id) {
        this.id = id;
    }

    public void setId(final int id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(final String password) {
        this.password = password;
    }

    @OneToMany
    public Set<Authority> getAuthorities() {
        return authorities;
    }

    public void setAuthorities(final Set<Authority> authorities) {
        this.authorities = authorities;
    }

    @OneToMany
    public Nachricht getNachricht() {
        return nachricht;
    }

    public void setNachricht(final Nachricht nachricht) {
        this.nachricht = nachricht;
    }

    @OneToMany
    public Auftrag getAuftrag() {
        return auftrag;
    }

    public void setAuftrag(final Auftrag auftrag) {
        this.auftrag = auftrag;
    }

    public User(int id, String name, String vorname, String emailAdresse, String adresse, String password) {
        this.id = id;
        this.name = name;
        this.vorname = vorname;
        this.emailAdresse = emailAdresse;
        this.adresse = adresse;
        this.password = password;
    }
}
package de.ratzfratz.entities;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedAttributeNode;
import javax.persistence.NamedEntityGraph;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@NamedEntityGraph(name = "User.Auftrag", attributeNodes = {
                                                            @NamedAttributeNode("auftrag"),
                                                            @NamedAttributeNode("authorities")})
@Table(name ="users")
public class User{
    private int id;
    private String name;
    private String vorname;
    private String emailAdresse;
    private String adresse;
    private String password;
    private Set<Authority> authorities = new HashSet<>();
    private Set<Nachricht> nachricht = new HashSet<>();
    private Set<Auftrag> auftrag = new HashSet<>();

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

    public String getPassword() {
        return password;
    }

    public void setPassword(final String password) {
        this.password = password;
    }

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "user")
    public Set<Authority> getAuthorities() {
        return authorities;
    }

    public void setAuthorities(final Set<Authority> authorities) {
        this.authorities = authorities;
    }

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "user")
    public Set<Nachricht> getNachricht() {
        return nachricht;
    }

    public void setNachricht(final Set<Nachricht> nachricht) {
        this.nachricht = nachricht;
    }

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "user")
    public Set<Auftrag> getAuftrag() {
        return auftrag;
    }

    public void setAuftrag(final Set<Auftrag> auftrag) {
        this.auftrag = auftrag;
    }

    public User() { }

    @Override
    public String toString() {
        return "User [adresse=" + adresse + ", id=" + id + ", name=" + name + ", password=" + password + ", vorname="
                + vorname + "]";
    }
}
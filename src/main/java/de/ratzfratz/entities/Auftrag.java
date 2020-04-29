package de.ratzfratz.entities;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.NamedAttributeNode;
import javax.persistence.NamedEntityGraph;
import javax.persistence.OneToMany;

@Entity
@NamedEntityGraph(name = "Auftrag.Nachricht", attributeNodes = @NamedAttributeNode("nachricht"))
public class Auftrag{
    private int auftragsNummer;
    private User user;
    private String auftragsBeschreibung;
    private Date startDatum;
    private Set<Nachricht> nachricht = new HashSet<>();

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getAuftragsNummer() {
        return auftragsNummer;
    }

    public void setAuftragsNummer(final int auftragsNummer) {
        this.auftragsNummer = auftragsNummer;
    }


    public String getAuftragsBeschreibung() {
        return auftragsBeschreibung;
    }

    public void setAuftragsBeschreibung(final String auftragsBeschreibung) {
        this.auftragsBeschreibung = auftragsBeschreibung;
    }

    public Date getStartDatum() {
        return startDatum;
    }

    public void setStartDatum(final Date startDatum) {
        this.startDatum = startDatum;
    }

    @ManyToOne
    public User getUser() {
        return user;
    }

    public void setUser(final User user) {
        this.user = user;
    }

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "auftrag")
    public Set<Nachricht> getNachricht() {
        return nachricht;
    }

    public void setNachricht(final Set<Nachricht> nachricht) {
        this.nachricht = nachricht;
    }
}
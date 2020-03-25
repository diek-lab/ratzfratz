package de.ratzfratz.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Auftrag{
    private int auftragsNummer;
    private User user;
    private String auftragsBeschreibung;
    private Date startDatum;

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

    public Auftrag(final int auftragsNummer, final User user, final String auftragsBeschreibung,
            final Date startDatum) {
        this.auftragsNummer = auftragsNummer;
        this.user = user;
        this.auftragsBeschreibung = auftragsBeschreibung;
        this.startDatum = startDatum;
    }
}
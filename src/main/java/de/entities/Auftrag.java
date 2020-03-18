package de.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Auftrag{
    private int auftragsNummer;
    private User auftraggeber;
    private String auftragsBeschreibung;
    private Date startDatum;

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getAuftragsNummer() {
        return auftragsNummer;
    }

    public void setAuftragsNummer(final int auftragsNummer) {
        this.auftragsNummer = auftragsNummer;
    }

    public User getAuftraggeber() {
        return auftraggeber;
    }

    public void setAuftraggeber(final User auftraggeber) {
        this.auftraggeber = auftraggeber;
    }

    public String getAuftragsBeschreibung() {
        return auftragsBeschreibung;
    }

    public void setAuftragsBeschreibung(final String auftragsBeschreibung) {
        this.auftragsBeschreibung = auftragsBeschreibung;
    }

    public Auftrag(final int auftragsNummer, final User auftraggeber, final String auftragsBeschreibung) {
        this.auftragsNummer = auftragsNummer;
        this.auftraggeber = auftraggeber;
        this.auftragsBeschreibung = auftragsBeschreibung;
    }

    public Date getStartDatum() {
        return startDatum;
    }

    public void setStartDatum(Date startDatum) {
        this.startDatum = startDatum;
    }

    

}
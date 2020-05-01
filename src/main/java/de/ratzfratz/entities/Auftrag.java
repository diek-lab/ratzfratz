package de.ratzfratz.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Auftrag{
    private int auftragsNummer;
    private String auftragsBeschreibung;
    private Date datum;
    private String kontakt;
    private Boolean status;
    private String name;
    private String anschrift;
    private String startDatum;

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

    public String getStartDatum() {
        return startDatum;
    }

    public void setStartDatum(final String startDatum) {
        this.startDatum = startDatum;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public String getAnschrift() {
        return anschrift;
    }

    public void setAnschrift(final String anschrift) {
        this.anschrift = anschrift;
    }

    public Date getDatum() {
        return datum;
    }

    public void setDatum(final Date datum) {
        this.datum = datum;
    }

    public String getKontakt() {
        return kontakt;
    }

    public void setKontakt(final String kontakt) {
        this.kontakt = kontakt;
    }

    @Override
    public String toString() {
        return "Auftrag [anschrift=" + anschrift + ", auftragsBeschreibung=" + auftragsBeschreibung
                + ", auftragsNummer=" + auftragsNummer + ", datum=" + datum + ", kontakt=" + kontakt + ", name=" + name
                + ", startDatum=" + startDatum + "]";
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }


}
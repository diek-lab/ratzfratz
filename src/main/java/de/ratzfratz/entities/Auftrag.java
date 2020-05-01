package de.ratzfratz.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Auftrag{
    private int auftragsNummer;
    private String auftragsBeschreibung;
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

    public void setName(String name) {
        this.name = name;
    }

    public String getAnschrift() {
        return anschrift;
    }

    public void setAnschrift(String anschrift) {
        this.anschrift = anschrift;
    }

    @Override
    public String toString() {
        return "Auftrag [anschrift=" + anschrift + ", auftragsBeschreibung=" + auftragsBeschreibung
                + ", auftragsNummer=" + auftragsNummer + ", name=" + name + ", startDatum=" + startDatum + "]";
    }


}
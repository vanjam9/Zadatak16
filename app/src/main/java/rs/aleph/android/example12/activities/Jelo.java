package rs.aleph.android.example12.activities;

import android.app.Activity;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by va on 2/1/2017.
 */

public class Jelo {

    private int id;
    private String slika,ime,opis,sastojci;
    private int kalorije;
     private double cena;
private Kategorijama kategorijama;


    public Kategorijama getKategorijama() {
        return kategorijama;
    }

    public void setKategorijama(Kategorijama kategorijama) {
        this.kategorijama = kategorijama;
    }





    public Jelo(int id, String slika, String ime, String opis, String sastojci,  Kategorijama kategorijama) {
        this.id=id;
        this.slika = slika;
        this.ime = ime;
        this.opis = opis;
        this.sastojci = sastojci;


        this.kategorijama=kategorijama;


    }

    public Jelo(int i, String s, String jastog, String opis, String sastojci, int i1, int i2) {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSlika() {
        return slika;
    }

    public void setSlika(String slika) {
        this.slika = slika;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getOpis() {
        return opis;
    }

    public void setOpis(String opis) {
        this.opis = opis;
    }



    public String getSastojci() {
        return sastojci;
    }

    public void setSastojci(String sastojci) {
        this.sastojci = sastojci;
    }

    public int getKalorije() {
        return kalorije;
    }

    public void setKalorije(int kalorije) {
        this.kalorije = kalorije;
    }

    public double getCena() {
        return cena;
    }

    public void setCena(double cena) {
        this.cena = cena;
    }


}

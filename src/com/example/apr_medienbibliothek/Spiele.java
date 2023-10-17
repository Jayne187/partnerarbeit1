package com.example.apr_medienbibliothek;

public class Spiele {
    private int preis;
    private int konsolentyp;

    public Spiele(int preis, int konsolentyp) {this.preis = preis; this.konsolentyp = konsolentyp;}

    public void setPreis(int preis) {this.preis = preis;}

    public void setKonsolentyp(int konsolentyp) {this.konsolentyp = konsolentyp;}

    public int getPreis() {return preis;}

    public int getKonsolentyp() {return konsolentyp;}
}

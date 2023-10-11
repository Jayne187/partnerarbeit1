package com.example.apr_medienbibliothek;

public class Movie extends Media{
    public Movie(String titel, String kommentar, String erscheinungsdatum, Genre genre, Urheber urheber, String regisseur, int spielzeit, boolean uhd, boolean hd) {
        super(titel, kommentar, erscheinungsdatum, genre, urheber);
        this.regisseur = regisseur;
        this.spielzeit = spielzeit;
        this.uhd = uhd;
        this.hd = hd;
    }

    private String regisseur;
    private int spielzeit;
    private boolean uhd;
    private boolean hd;
    private Genre genre;

    public void setRegisseur(String regisseur) {
        this.regisseur = regisseur;
    }

    public void setSpielzeit(int spielzeit) {
        this.spielzeit = spielzeit;
    }

    public void setUhd(boolean uhd) {
        this.uhd = uhd;
    }

    public void setHd(boolean hd) {
        this.hd = hd;
    }

    public String getRegisseur() {
        return regisseur;
    }

    public int getSpielzeit() {
        return spielzeit;
    }

    public boolean isUhd() {
        return uhd;
    }

    public Genre getGenre() {
        return genre;
    }

    public boolean isHd() {
        return hd;
    }

    public void setGenre(Genre genre) {

    }

    @Override
    public String toString() {
        return "Movie{" + "regisseur='" + regisseur + '\'' + ", spielzeit=" + spielzeit + ", UHD=" + uhd + ", HD=" + hd + '}';
    }
}

package com.example.apr_medienbibliothek;

public class eBook extends Media{

    public eBook(String titel, String kommentar, String erscheinungsdatum, Genre genre, Urheber urheber, String autor, int isbn, int seitenaznahl, String auflage) {
        super(titel, kommentar, erscheinungsdatum, genre, urheber);
        this.autor = autor;
        this.isbn = isbn;
        this.seitenaznahl = seitenaznahl;
        this.auflage = auflage;
    }
    private String autor;
    private int isbn;
    private Genre genre;
    private int seitenaznahl;
    private String auflage;

    public Genre getGenre() {
        return genre;
    }



    @Override
    public void setKommentar(String kommentar) {this.kommentar = kommentar;}

    public void setErscheinung(String erscheinung) {this.erscheinung = erscheinung;}

    @Override
    public void setGenre(Genre genre) {

    }

    @Override
    public String getKommentar() {
        return kommentar;
    }

    public String getErscheinung() {
        return erscheinung;
    }

    private String kommentar;

    private String erscheinung;

    public String getAutor() {
        return autor;
    }

    public int getIsbn() {
        return isbn;
    }

    public int getSeitenaznahl() {
        return seitenaznahl;
    }

    public String getAuflage() {
        return auflage;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public void setSeitenaznahl(int seitenaznahl) {
        this.seitenaznahl = seitenaznahl;
    }

    public void setAuflage(String auflage) {
        this.auflage = auflage;
    }

    @Override
    public String toString() {
        return "eBook{" + "autor='" + autor + '\'' + ", isbn=" + isbn + ", seitenaznahl=" + seitenaznahl + ", auflage='" + auflage + '\'' + '}';
    }
}

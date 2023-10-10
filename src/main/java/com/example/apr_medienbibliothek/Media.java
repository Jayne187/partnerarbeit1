package com.example.apr_medienbibliothek;

import java.util.ArrayList;

public abstract class Media {
    public Media(String titel, String kommentar, String erscheinungsdatum, Genre genre, Urheber urheber) {}
    private String titel;
    private String kommentar;
    private String erscheinungsdatum;
    private Urheber urheber;
    private Genre genre;
    public String getTitel() {
        return titel;
    }

    public void setGenre() {setGenre(null);}

    public abstract void setGenre(Genre genre);

    public String getKommentar() {
        return kommentar;
    }

    public String getErscheinungsdatum() {
        return erscheinungsdatum;
    }

    public void setTitel(String titel) {
        this.titel = titel;
    }

    public void setKommentar(String kommentar) {
        this.kommentar = kommentar;
    }

    public void setErscheinungsdatum(String erscheinungsdatum) {
        this.erscheinungsdatum = erscheinungsdatum;
    }

    @Override
    public String toString() {
        return "Media{" + "titel='" + titel + '\'' + ", kommentar='" + kommentar + '\'' + ", erscheinungsdatum='" + erscheinungsdatum + '\'' + ", genre=" + genre + '}';
    }
}

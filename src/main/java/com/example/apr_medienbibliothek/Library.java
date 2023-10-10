package com.example.apr_medienbibliothek;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;

public class Library {
    private ArrayList<Media> liste = new ArrayList<>();

    public Library() {
    }

    public void setListe(ArrayList<Media> liste) {
        this.liste = liste;
    }

    public ArrayList<Media> getListe() {
        return liste;
    }

    public void addMedia(Media media){
        liste.add(media);
    }

    public void removeMedia(Media media){
        liste.remove(media);
    }

    public ArrayList<Media> searchMediaByTitle(String title){
        ArrayList<Media> existingMedia = new ArrayList<>();

        for(Media m : liste){
            if(title.equals(m.getTitel())){
                existingMedia.add(m);
            }
        }
        return existingMedia;
    }

    public ArrayList<Movie> allMovieAsList() {
        ArrayList<Movie> movie = new ArrayList<>();
        Iterator it = this.liste.iterator();

        while (it.hasNext()) {
            Media m = (Media) it.next();
            if (m instanceof Movie) {
                movie.add((Movie) m);
            }
        }
        return movie;
    }

    public ArrayList<eBook> allBookAsList() {
        ArrayList<eBook> book = new ArrayList<>();
        Iterator it = this.liste.iterator();

        while (it.hasNext()) {
            Media m = (Media) it.next();
            if (m instanceof eBook) {
                book.add((eBook) m);
            }
        }
        return book;
    }

    public void showAllMedia(){
        System.out.println(liste);
    }
    @Override
    public String toString() {
        return "Library{" + "liste=" + liste + '}';
    }
}

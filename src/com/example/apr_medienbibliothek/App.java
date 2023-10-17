package com.example.apr_medienbibliothek;

public class App {

    public static void main(String[] args)
    {
        Urheber u = new Urheber("Dominik", "Nemes", "HiHi");

        Library l = new Library();
        Movie bat_man = new Movie("BAT MAN", "reicher Typ mit tiefer Stimme ohne Eltern", "01.02.1999", Genre.action, u, "Jona Klotz", 150, false, true);
        eBook the_mountain_is_you = new eBook("The Mountain is you", "komment", "01.02.2023", Genre.drama, u, "Jona Klotz", 2180938, 253, "Auflage");
        l.addMedia(bat_man);
        l.addMedia(the_mountain_is_you);

        l.showAllMedia();
        System.out.println("");
        System.out.println("-------- all Movies --------");
        for(Movie m : l.allMovieAsList()){
            m.toString();
        }
        System.out.println("");
        System.out.println("-------- all E-Books --------");
        for(eBook b : l.allBookAsList()){
            b.toString();
        }
        /*
        Medienbibliothek bib = new Medienbibliothek();

        VHS heman = new VHS("He-Man and the Master of the Universe", 120.99, "Büro", 90, "ausgezeichnet");
        Cartridge zeldaGold = new Cartridge("The Adventures of Zelda", 300.00, "Keller", true, "Nintendo", Konsolentyp.NES);
        Buch herr = new Buch("Herr der Ringe", 49.99, "Wonzimmer", "123456234643");
        bib.mediumHinzufügen(heman);
        bib.mediumHinzufügen(zeldaGold);
        bib.mediumHinzufügen(herr);

        bib.alleMedienAusgeben();

        System.out.println("");
        System.out.println("------ alle VHS in der Liste ------");
        for(VHS vhs: bib.alleVHSalsListe())
        {
            vhs.anzeigen();
        }*/
    }
}

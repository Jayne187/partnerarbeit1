package com.example.apr_medienbibliothek;

import java.util.Scanner;

public class Kommandozeilenmenü {
        Scanner scan;
        private Genre genre;
        Library library = new Library();

    public Genre getGenre() {return genre;}
    public void setGenre(Genre genre) {this.genre = genre;}

    public Kommandozeilenmenü() {this.scan = new Scanner(System.in);}

        public void menüAnzeigen() {
            System.out.println("MENÜ");
            System.out.println("1) AUSGABE");
            System.out.println("2) RECHNEN");
            System.out.println("3) exit");
            System.out.println("4) begruessung");
            System.out.println("5) Genre Ausgeben");
            System.out.println("6) Library Ausgeben");
        }

        public void start() {
            String s = "-";
            while (!s.equals("3")) {
                menüAnzeigen();
                s = scan.nextLine();
                switch(s)
                {
                    case "1":
                        this.ausgabe();
                        break;
                    case "2":
                        this.rechnen();
                        break;
                    case "3":
                        break;
                    case "4":
                        this.begruessung();
                        break;
                    case "5":
                        this.genreAusgeben();
                        break;
                    case "6":
                        this.Libraryausgeben();
                        break;
                    default:
                        this.fehler();
                        break;
                }
            }
            scan.close();
        }

        public void ausgabe()
        {
            System.out.println("AUSGABE");
        }

        public void rechnen()
        {
            System.out.println("RECHNEN 1+1 = 2");
        }

        public void fehler()
        {
            System.out.println("Sie können nur 1,2 oder 3 eingeben!");
        }

        public void begruessung(){System.out.println("Hallo");}

        public void genreAusgeben(){System.out.println(genre);}

        public void Libraryausgeben(){
            for(Media m : library.getListe()){
                System.out.println(m);
            }
        }
    }


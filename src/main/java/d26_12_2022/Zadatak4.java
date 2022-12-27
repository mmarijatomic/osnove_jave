package d26_12_2022;

import java.util.Scanner;
import java.util.concurrent.atomic.AtomicBoolean;

//Napisati metodu koja stampa podatke o korisniku u formatu:
//JMBG: [jmbg]
//Ime: [ime]
//Prezime: [prezime]
//God. rodjenja: [god]
//Aktivan: [true/false]
//Metoda prima jmbg, ime, prezime, god rodjenja i da li je aktivan kao parametre metode.
//Metoda nista ne vraca.
public class Zadatak4 {
    public static void main(String[] args) {

        podaciKorisnika(1111111111,"Marija", "Tomic", 31, true);
    }
    public static void podaciKorisnika (int jmbg, String ime, String prezime, int god, boolean status) {

        System.out.println("JMBG: [" + jmbg + "]");
        System.out.println("Ime: [" + ime + "]");
        System.out.println("Prezime: [" + prezime + "]");
        System.out.println("Godina rodjenja: [" + god+ "]");
        System.out.println("Aktivan: [" + status + "]");
    }
}

package d26_12_2022;

import java.util.Scanner;
import java.util.concurrent.atomic.AtomicBoolean;

//Napisati metodu koja vrsi spajanje punog imena i vraca tu vrednost.
//Metoda od parametara prima ime i prezime (2 parametra) i vraca jedan string tako sto spoji ime i prezime.
//METODA NISTA NE STAMPA.
//Primer poziva: Ako se metoda pozove za ime=”Milan” i prezime=”Jovanovic”, metoda vraca “Milan Jovanovic”
public class Zadatak2 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Unesi ime: ");
        String ime = s.next();
        System.out.println("Unesi prezime: ");
        String prezime = s.next();

         punoIme(ime, prezime);
    }
    public static void punoIme (String ime, String prezime) {

        String imeIPrezime = ime + prezime;

    }
}

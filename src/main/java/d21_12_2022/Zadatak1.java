package d21_12_2022;

import java.util.ArrayList;
import java.util.Scanner;

//Napisati program koji u sebi ima definisan niz od 10 broja (brojevi su proizvoljni)
//i koji menja vrednost elementa na pozciji K. K i novu vrednost unosi korisnik.
//Primer:
//Unesite pozicjiu od 0 do 9: 3
//Unesite novu vrednost: 11
//Element na 3. poziciji treba na kraju da ima vrednost 11 u vasem programu.
public class Zadatak1 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        ArrayList <Integer> brojevi = new ArrayList<Integer>();

        brojevi.add(3);
        brojevi.add(6);
        brojevi.add(8);
        brojevi.add(9);
        brojevi.add(2);
        brojevi.add(4);
        brojevi.add(1);
        brojevi.add(6);
        brojevi.add(8);
        brojevi.add(1);

        System.out.println("Unesite poziciju od 0 do 9: ");
        int k = s.nextInt();
        System.out.println("Unesite novu vrednost: ");
        int m = s.nextInt();

        brojevi.set(k, m);


    }
}

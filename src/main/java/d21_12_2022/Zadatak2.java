package d21_12_2022;

import java.util.ArrayList;
import java.util.Scanner;

//Napisati program koji ucitava N brojeva i smesta ih u niz.
//Zatim, iz niza, broji koliko je parnih brojeva uneto. brojeve unosi korisnik.
//Unesite N: 5
//
//Unesite broj: 1
//Unesite broj: 3
//Unesite broj: 4
//Unesite broj: 7
//Unesite broj: 8
//U nizu ima 2 parna broja.
public class Zadatak2 {
    public static void main(String[] args) {

        ArrayList <Integer> niz = new ArrayList<Integer>();
        Scanner s = new Scanner(System.in);
        System.out.println("Unesite N: ");
        int n = s.nextInt();
        int brojac = 0;


        for (int i = 0; i < n; i++) {
            System.out.println("Unesite broj: ");
            int broj = s.nextInt();
            niz.add(broj);

            if (broj % 2 == 0) { brojac++;}
        }
        System.out.println("Uneta su " + brojac + " parna broja.");
    }
}

package d14_12_2022;

import java.util.Scanner;

//  Napisati program koji za unetu vrednost x odredjuje i prikazuje vrednost funkcije y. Iskoristite if/else za racunanje informacije i tek nakon te logike odstampajte vrednost y na ekranu.Funkcija y je definisana kao:
//    			       (x,       x < 2
//                y =  (2,      2 <= x < 10
//    			       (x - 1, x >= 10
//
// Objasnjenje formule: Ako je x manje od 2, y je jednako x
//			           Ako je x u opsegu od 2 do 10, y je jednako 2
//			           Ako je x vece od 10, y je x-1
public class Zadatak4 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.print("Unesite x: ");
        int x = s.nextInt();
        int y;

        if (x <= 2) {
            System.out.print("y: "+ x);}
        else if (x  > 2 && x < 10) { y=2;
            System.out.print("y: "+ y);}
        else if (x >= 10) {y=x-1;
            System.out.print("y: "+ y);}



        }

    }

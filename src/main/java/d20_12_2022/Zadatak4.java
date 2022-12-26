package d20_12_2022;

import java.util.Scanner;

//Napisati program koji proverava uparenost zagrada.
//Korisnik unosi matematicku formulu sve dok ne unese znak =.
//Korisnik unosi svaki karakter jednacine posebno i na kraju programa se ispisuje da li su sve zagrade uparene.
//	Formula koja se koristi u primeru je: (2 * ( 1 + 3))=
//	Primer izvrsenja:
//	Unos: (
//	Unos: 2
//	Unos: *
//	Unos: (
//	Unos: 1
//	Unos: +
//	Unos: 3
//	Unos: )
//	Unos: )
//	Unos: =
//	Zagrade su uparene
//	(Objasnjenje: Imamo isti broj otvorenih i zatvorenih zagrada)
//
//	Primer izvrsenja 2:
//	Unos: (
//	Unos: 2
//	Unos: *
//	Unos: (
//	Unos: 1
//	Unos: +
//	Unos: 3
//	Unos: )
//	Unos: =
//	Zagrade nisu uparene
//	(Objasnjenje: fali poslednja zagrada iz formule)
public class Zadatak4 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        String unos = "";
        int brojac1 = 0;
        int brojac2 = 0;

        while (!unos.equals("=")) {
            System.out.println("Unos: ");
            unos = s.next();

            if (unos.contains("(")) {
                brojac1++;
            } else if (unos.contains(")")){
                brojac2++;  }

        } if (brojac1 % 2==0 && brojac2 % 2==0) {
            System.out.println("Zagrade su uparene");} else {
            System.out.println("Zagrade nisu uparene");}
    }
}

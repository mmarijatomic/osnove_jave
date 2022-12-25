package d20_12_2022;

import java.util.Scanner;

//Napisati program koji od korisnika ucitava brojeve sve dok ne unesu bar dve dvojke ili tri jedinice.
//Primer izvrsenja 1:
//Unesite broj:1
//Unesite broj:2
//Unesite broj:0
//Unesite broj:2
//Kraj programa.
//(Objasnjenje: Kraj jer je uneto dve dvojke)
//
//Primer izvrsenja 1:
//Unesite broj:1
//Unesite broj:2
//Unesite broj:1
//Unesite broj:3
//Unesite broj:1
//Kraj programa.
//(Objasnjenje: Kraj jer je uneto tri jedinice)
public class Zadatak3 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int brojac1 = 0;
        int brojac2 = 0;

        while (brojac1 != 3 && brojac2 !=2) {
            System.out.print("Unesite broj: ");
            int broj = s.nextInt();
            if (broj==1) {brojac1++;}
            if (broj==2) {brojac2++;}
        }
        System.out.println("Kraj programa.");
    }
}

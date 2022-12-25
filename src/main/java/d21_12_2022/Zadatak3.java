package d21_12_2022;

import java.util.ArrayList;
import java.util.Scanner;

//Napisati program koji ucitava niz A duzine N, i koji nakon unosa niz A stampa sve elemente niza koji su veci od nule.
//Primer izvrsenja:
//Unesite N: 5
//Unesite broj: 1
//Unesite broj: -4
//Unesite broj: 3
//Unesite broj: -7
//Unesite broj: 9
//
//Brojevi veci od nule u nizu A su: 1, 3, 9,
public class Zadatak3 {
    public static void main(String[] args) {

        ArrayList <Integer> nizA = new ArrayList<Integer>();
        Scanner s = new Scanner(System.in);
        System.out.println("Unesite N: ");
        int n = s.nextInt();
        ArrayList <Integer> veciodnule = new ArrayList<Integer>();

        for (int i = 0; i < n; i++) {
            System.out.println("Unesite broj: ");
            int broj = s.nextInt();
            nizA.add(broj);
        }
        for (int i = 0; i < nizA.size(); i++) {
            if (nizA.get(i) > 0) {
                System.out.println(veciodnule.add(nizA.get(i)));
            }

        }
        System.out.println("Brojevi veci od nule u nizu A su: " + veciodnule);

        }


    }

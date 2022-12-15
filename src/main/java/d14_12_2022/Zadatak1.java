package d14_12_2022;

import java.util.Scanner;

//Napisati program koji ima informacije koje ucitava informacije sa tastature:
//Ime
//Prezime
//godinu rodjenja
//I stampa informaicije u formatu:
//[ime] [prezime] - [startost] god
public class Zadatak1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Ime: ");
        String ime = s.next();
        System.out.print("Prezime: ");
        String prezime = s.next();
        System.out.print("Godina rodjenja: ");
        int godRodjenja = s.nextInt();
        int starost = 2022 - godRodjenja;

        System.out.println("[" + ime + "]"+ "[" + prezime + "]" + "-" + "[" + starost + "]");

    }
}


package d12_01_2023;

import java.util.ArrayList;

//Kreirati klasu ZeleniKarton koja ima:
//ime i prezime studenta
//broj indeksa
//naziv predmeta
//ime i prezime profesora
//ocenu - od 5 do 10
//gettere i settere
//konstruktore
//metodu koja vraca da li je ispit polozen ili ne (ispit je polozen ako je ocena veca od 5)
//metodu stampaj koja stampa podatke u formatu:
//		(naziv predmeta) - (ocena)
//		Student: ime i prezime, broj indeksa
//		Profesor: ime i prezime
//
//	U glavnoj klasi:
//kreirati niz od 10tak zelenih kartona za ispite i odstampati podatke za sve ispite
public class Zadatak1 {
    public static void main(String[] args) {

        ZeleniKarton z1 = new ZeleniKarton(1522, "Psihopatologija",
                "Goran Golubovic", 8, "Marija Tomic");
        ZeleniKarton z2 = new ZeleniKarton(1521, "Psihologija ucenja",
                "Miroslav Komlenic", 7, "Jana Komadinic");
        ZeleniKarton z3 = new ZeleniKarton(1520, "Psiholosko savetovanje",
                "Marina Hadzi-Pesic", 5, "Nevena Golic");
        ZeleniKarton z4 = new ZeleniKarton(1620, "Psihopatologija",
                "Goran Golubovic", 9, "Jelena Lukovic");
        ZeleniKarton z5 = new ZeleniKarton(1523, "Psihologija ucenja",
                "Miroslav Komlenic", 5, "Goran Bundic");
        ZeleniKarton z6 = new ZeleniKarton(1524, "Psiholosko savetovanje",
                "Marina Hadzi-Pesic", 10, "Katarina Sosevic");
        ZeleniKarton z7 = new ZeleniKarton(1525, "Psihopatologija",
                "Goran Golubovic", 7, "Marko Nikolic");
        ZeleniKarton z8 = new ZeleniKarton(1526, "Psihologija ucenja",
                "Miroslav Komlenic", 8, "Tijana Pucarevic");
        ZeleniKarton z9 = new ZeleniKarton(1527, "Psiholosko savetovanje",
                "Marina Hadzi-Pesic", 5, "Milica Stevanovic");
        ZeleniKarton z10 = new ZeleniKarton(1529, "Psihopatologija",
                "Goran Golubovic", 10, "Tamara Mitrovic");

        ArrayList <ZeleniKarton> ispiti = new ArrayList<>();
        ispiti.add(z1);
        ispiti.add(z2);
        ispiti.add(z3);
        ispiti.add(z4);
        ispiti.add(z5);
        ispiti.add(z6);
        ispiti.add(z7);
        ispiti.add(z8);
        ispiti.add(z9);
        ispiti.add(z10);

        for (int i = 0; i <ispiti.size() ; i++) {
            ispiti.get(i).stampaj();
        }
    }
}

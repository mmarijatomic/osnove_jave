package d29_12_2022;
//Napisati klasu Proizvod koja ima atribute
//naziv proizvoda (String)
//cenu proizvoda (double)
//težinu proizvoda u gramima. (double)
//	i metode:
//stampaj - stampa podatke proizvoda u formatu {{naziv}}, {{cena}}, {{tezina}}
//povecajCenu - koja kao parametar funkcije prima vrednost povećanje za koju treba povećati cenu.
//Ova funkcija treba da menja atribut cena i ova funkcija nema povratnu vrednost.
//vratiCenuSaPopustom - koja kao ulazni parametar funkcije dobija popust,
//a povratnu vrednost je cena proizvoda kada se uračuna popust.Ova funkcije ne menja atribut cena.
//Smatrati da je parametar popust u opsegu od 0 do 100.
//racunajPostarinu - funkcije vraća koliko bi bila postarina da se proizvod šalje preko kurirske sluzbe.
//Funkcija je bez ulaznih parametara, a cena postarine se računa u zavisnosti od tezine:
//za tezinu do 100g, postarina iznosi 200din
//za tezinu od 101g do 500g, postarina iznosi 400din
//za tezinu preko 500g, postarina iznosi 1000din
//
//U glavnom programu kreirati minimum 2 proizvoda i za svaki od njih pozvati svaku od definisanih funkcija.

public class Zadatak1 {
    public static void main(String[] args) {
        Proizvod p1 = new Proizvod();

        p1.naziv = "Serum za lice";
        p1.cena = 1200.00;
        p1.tezina = 50.00;

        p1.stampaj();
        p1.povecajCenu(120);
        System.out.println(p1.cena);
        System.out.println(p1.vratiCenuSaPopustom(20));
        System.out.println(p1.cena);
        System.out.println(p1.racunajPostarinu());

        Proizvod p2 = new Proizvod();

        p2.naziv = "Tonik za lice";
        p2.cena = 800.00;
        p2.tezina = 150.00;

        p2.stampaj();
        p2.povecajCenu(250);
        System.out.println(p2.cena);
        System.out.println(p2.vratiCenuSaPopustom(15));
        System.out.println(p2.cena);
        System.out.println(p2.racunajPostarinu());



    }



}


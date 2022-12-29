package d27_12_2022;
//Kreirati klasu SmartAirConditioning koja ima:
//atribut za marku klime (npr: Samsung, Galanz, Gree, …)
//atribut za izabranu temperaturu
//atribut za mod (hladi/greje) - string
//metodu za stampu (proizvoljno)
//metodu koja vraca informaciju da li je napolju veca temperatura od one na koju je klima postavljena.
//Metoda kao parametar prima temperaturu koja je napolju.
//
//
//U glavnom programu kreirati minimum 2 objekta klase SmartAirConditioning i za svaki od njih pozvati metode
public class Zadatak2 {
    public static void main(String[] args) {

        SmartAirConditioning klimaUredjaj1 = new SmartAirConditioning();

        klimaUredjaj1.markaKlime = "LG";
        klimaUredjaj1.izabranaTemp = 28;
        klimaUredjaj1.mod = "greje";

        SmartAirConditioning klimaUredjaj2 = new SmartAirConditioning();

        klimaUredjaj2.markaKlime = "Samsung";
        klimaUredjaj2.izabranaTemp = 18;
        klimaUredjaj2.mod = "hladi";

        klimaUredjaj1.stampa();
        klimaUredjaj2.stampa();

        if (klimaUredjaj1.daLiJeTempVeca(30)) {
            System.out.println("Napolju je veca temperatura.");}
        else {System.out.println("Temperatura napolju je manja.");}

        if (klimaUredjaj2.daLiJeTempVeca(5)) {
            System.out.println("Napolju je veca temperatura.");}
        else {System.out.println("Temperatura napolju je manja.");}

        }


    }


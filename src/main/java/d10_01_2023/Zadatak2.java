package d10_01_2023;
//Kreirati klasu Proizvod koja ima
//Naziv proizvoda
//kupca/musteriju
//cenu izrade proizvoda
//gettere i settere
//konstruktore
//Metodu za racunanje cene proizvoda, koja racuna cenu proizvoda po formuli:
//cena izrade * 1.9 * (100 - popust na clansku karticu) / 100
//Metodu za stampanje proizvoda u formatu:
//naziv proizvoda - cena
//ime i prezime - broj kartice
//
//Kreirati klasu Kupac koja ima:
//ime i prezime
//clansku kartu
//gettere i settere, clanska karta ne moze da se menja
//konstruktore
//metodu stampaj koja stampa u formatu
//ime i prezime - broj kartice
//
//Kreirati klasu ClanskaKarta koja ima:
//popust (u rasponu od 5 do 10 %)
//broj kartice (npr: 9329-0239)
//gettere i setter
//konstuktore
public class Zadatak2 {
    public static void main(String[] args) {

        ClanskaKarta ck1 = new ClanskaKarta(5, "1112-2333");
        ClanskaKarta ck2 = new ClanskaKarta(10, "8877-6654");

        Kupac k1 = new Kupac("Marija Tomic", ck1);
        k1.stampaj();
        Kupac k2 = new Kupac("Simonida Ristic", ck2);
        k2.stampaj();
        System.out.println();

        Proizvod p1 = new Proizvod("Losion za telo", k1, 420.00);
        p1.stampajProizvod();

        Proizvod p2 = new Proizvod("Krema za lice", k2, 980.00);
        p2.stampajProizvod();


    }
}

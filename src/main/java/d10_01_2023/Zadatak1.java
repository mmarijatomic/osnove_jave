package d10_01_2023;
//Kreirati klasu Autor koja ima
//-ime i prezime
//-konstuktore koje mislite da su vam potrebni
//-gettere i settere za atribute
//-metodu print koja stampa u formatu:
//(ime autora) (prezime autora)
//
//Kreirati klasu Knjiga koji ima:
//-ISBN
//-naziv
//-godina izdanja
//-autor
//-konstuktore koje mislite da su vam potrebni
//-gettere i settere za atribute
//-metodu print koja stampa u formatu (izbegavati dupliranje koda):
//(ISBN)
//(naziv) - (godina izdanja)
//autor: (ime autora) (prezime autora)
//
//	U glavnom programu napraviti vise autora sa vise knjiga.
public class Zadatak1 {
    public static void main(String[] args) {

        Autor a1 = new Autor("Irvin", "Jalom");
        a1.stampaj();
        Autor a2 = new Autor("Gabor", "Mate");
        a2.stampaj();

        Knjiga k1 = new Knjiga(1234567, "Gledanje u sunce", 2011, a1);
        k1.print();
        Knjiga k2 = new Knjiga(567891, "Lecenje Sopenhauerom", 2015, a1);
        k2.print();
        Knjiga k3 = new Knjiga(564738, "Rasuti umovi", 2020, a2);
        k3.print();
        Knjiga k4 = new Knjiga(887789, "Kada telo kaze ne", 2019, a2);
        k4.print();

    }
}

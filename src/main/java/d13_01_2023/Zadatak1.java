package d13_01_2023;
//Napisati klasu Student koja ima
//broj indeksa
//ime i prezime
//tip studija (osnovne, master, doktorske)
//niz ispita
//konstuktore koje mislite da ce vam trebati
//gettere i settere za indeks, ime i prezime, tip studija
//getter za niz predmeta
//metodu dodaj ispit u niz ispita
//metodu koja racuna prosek na studijama (u prosek se ubrajaju samo polozeni ispiti)
//metodu stampaj koja stampa u formatu:
//(broj indeksa) - (ime i prezime) - (tip studija)
//Predmeti:
//(naziv predmeta) - (profesor) - (ocena)
//(naziv predmeta) - (profesor) - (ocena)
//(naziv predmeta) - (profesor) - (ocena)
//Prosecna ocena: (prosecna ocena)
//
//
//Napisati klasu Ispit koja ima
//naziv predmeta
//ocenu (u rasponu od 5 do 10)
//Ime i prezime profesora koji predaje predmet
//konstuktore koje mislite da ce vam trebati
//gettere i settere za sve atribute
//metodu koja kaze da li je ispit polozen (polozen je ako je ocena od 6 do 10)
//metodu koja stampa ispit u formatu:
//(naziv predmeta) - (profesor) - (ocena)

public class Zadatak1 {
    public static void main(String[] args) {

        Ispit i1 = new Ispit("Psiholosko savetovanje", 9, "Marina Hadzi-Pesic");
        Ispit i2 = new Ispit("Psihopatologija detinjstva i mladosti", 8, "Bojana Dimitrijevic");
        Ispit i3 = new Ispit("Teorije emocionalnog razvoja", 10, "Tatjana Stefanovic");
        Ispit i4 = new Ispit("Teorije licnosti", 7, "Ljubisa Zlatanovic");
        Ispit i5 = new Ispit("Psihologija ucenja", 8, "Miroslav Komlenic");
        Ispit i6 = new Ispit("Multivarijantna statistika", 7, "Vladimir Hedrih");

        i3.stampa();

        Student s1 = new Student(1522, "Marija Tomic", "osnovne");

        s1.dodajIspit(i1);
        s1.dodajIspit(i2);
        s1.dodajIspit(i3);
        s1.dodajIspit(i4);
        s1.dodajIspit(i5);
        s1.dodajIspit(i6);

        s1.stampaj();
    }
}

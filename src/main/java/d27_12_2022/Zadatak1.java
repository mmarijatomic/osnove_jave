package d27_12_2022;
//Napisati klasu Proizvod koja ima atribute
//naziv proizvoda (String)
//cenu proizvoda (double)
//težinu proizvoda u gramima. (double)
//	i metode:
//stampaj - stampa podatke proizvoda u formatu {{naziv}}, {{cena}}, {{tezina}}
//konvertuj - metoda konvertuje tezinu u kilograme i tone. Metoda kao parametar prima jedinicu
//u koju zelimo da konvertujemo, a metoda vraca sracunatu vrednost. Jedinica moze biti “kg” ili “t”
//Primer: ako proizvod ima 1200 grama i pozovemo metodu sa parametrom kg, metoda vraca 1.200
//Primer: ako proizvod ima 12000 grama i pozovemo metodu sa parametrom t, metoda vraca 0.012
//
//
//U glavnom programu kreirati minimum 2 proizvoda i za svaki od njih pozvati metode
public class Zadatak1 {
    public static void main(String[] args) {

        Proizvod brasno = new Proizvod();

        brasno.nazivProizvoda = "Brasno tip400";
        brasno.cenaProizvoda = 150.0;
        brasno.tezinaProizvoda = 1000.0;

        Proizvod pirinac = new Proizvod();

        pirinac.nazivProizvoda = "Pirinac integralni";
        pirinac.cenaProizvoda = 200.0;
        pirinac.tezinaProizvoda = 1200.0;

        brasno.stampa();
        pirinac.stampa();

        System.out.println("Tezina u kg: " + brasno.konvertuj("kg"));
        System.out.println("Tezina u t: " + brasno.konvertuj("t"));
        System.out.println("Tezina u kg: " + pirinac.konvertuj("kg"));
        System.out.println("Tezina u t: " + pirinac.konvertuj("t"));
    }
}

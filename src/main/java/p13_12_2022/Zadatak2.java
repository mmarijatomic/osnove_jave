package p13_12_2022;

public class Zadatak2 {

    public static void main(String[] args) {
//Napisati program koji na ekranu stampa podatke u formatu:
//Sifra [SIFRA PROIZVODA]
//[NAZIV PROIZVODA]  - $[CENA] - Popust [POPUST]%
//[BOJA], [VELICINA]

        String SifraProizvoda = "x932k20";
        String NazivProizvoda = "Nike Patike";
        int Cena = 90;
        double Popust = 13.5;
        String Boja = "Crna";
        double Velicina = 46.5;
        System.out.println(SifraProizvoda);
        System.out.println(NazivProizvoda + "-" + "$"+ Cena + "-"+ Popust + "%" );
        System.out.println(Boja + "," + "Velicina");


    }



    }


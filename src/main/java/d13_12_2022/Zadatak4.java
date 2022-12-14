package d13_12_2022;

public class Zadatak4 {
    public static void main(String[] args) {
//    Napisati program koji racuna i ispisuje povrsinu i obim trougla.
//    KOREN BROJA 3 neka bude konstanta 1.73.
//    Za stranicu trougla postavite proizvoljnu vrednost.
//    Primer izvrsenja programa:
//    a: 10
//    Povrsina je 43.25
//    Obim je 30

        int StranicaTrougla = 7;
        double KorenBroja3 = 1.73;
        double PovrsinaTrougla = (((StranicaTrougla)*(StranicaTrougla))*(KorenBroja3))/4;
        int ObimTrougla = 3 * StranicaTrougla;

        System.out.println("a: "+ StranicaTrougla);
        System.out.println("Povrsina je "+ PovrsinaTrougla);
        System.out.println("Obim je "+ ObimTrougla);
    }
}

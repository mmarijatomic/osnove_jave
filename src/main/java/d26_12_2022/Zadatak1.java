package d26_12_2022;

import java.util.Scanner;

//Napisati metodu stampajVrednostZa10Vecu u kojoj se stampa prosledjena vrednost za 10 veca.
//Iz main-a pozvati izvrsenje metode za razlicite vrednosti.
public class Zadatak1 {
    public static void main(String[] args) {
        int x = 12;
        stampajVrednostZa10Vecu(x);
        int m = 34;
        stampajVrednostZa10Vecu(m);
        int n = 65;
        stampajVrednostZa10Vecu(n);
    }
    public static void stampajVrednostZa10Vecu (int x) {
        System.out.println(x*10);
    }
//     public static void main(String[] args) {
//        Scanner s = new Scanner(System.in);
//        System.out.println("Unesite vrednost koju povecavamo: ");
//        int x= s.nextInt();
//        stampajVrednostZa10Vecu(x);
//
//    } public static void stampajVrednostZa10Vecu (int x) {
//        System.out.println("Vrednost uvecana za 10 je: "+(x*10));
//    }

}

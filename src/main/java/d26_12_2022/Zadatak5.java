package d26_12_2022;

import java.util.Scanner;

//Metoda prima dva parametra N i karakter za stampu. Metoda stampa N karaktera.
//Ako se za N prosledi 5 i za karakter prosledi npr kosa crta (/) stampa se
/// / / / /
//Napomena: Metoda nista ne vraca.
public class Zadatak5 {
    public static void main(String[] args) {
        int n = 5;
        char karakter = '/';

        zaStampanje(n,karakter);
    }
    public static void zaStampanje (int n, char karakter) {
        for (int i = 0; i < n; i++) {
            System.out.print(karakter + " ");

        }
    }
}

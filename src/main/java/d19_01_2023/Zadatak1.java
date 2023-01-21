package d19_01_2023;

//U glavnom programu kreirati jednu Korpu i u nju dodati nekoliko Ambalaza razlicitih tipova i istestirati
// sve metode i ispisati ukupnu cenu sa popustom.
public class Zadatak1 {
    public static void main(String[] args) {

        Korpa korpa = new Korpa();
        SuperKartica sk = new SuperKartica(4435, "Marija Tomic", 5);
        sk.stampaj();

        Ambalaza sokOdAnasa = new Tetrapak("6536245624365", "Nectar Life", 1000,
                1200, true, 198.9);
        Ambalaza mleko = new Tetrapak("7687575868", "Moja Kravica", 1000,
                1120, false, 170.0);
        Ambalaza pivo = new StaklenaAmbalaza("67564376243267", "Birra Moretti", 400,
                950, 35.5, true, 75);
        Ambalaza vino = new StaklenaAmbalaza("678757989", "Shiraz", 700,
                1300, 0, false, 1620);

        sokOdAnasa.stampaj();
        mleko.stampaj();
        pivo.stampaj();
        vino.stampaj();

        korpa.dodajAmbalazu(sokOdAnasa);
        korpa.dodajAmbalazu(mleko);
        korpa.dodajAmbalazu(pivo);
        korpa.dodajAmbalazu(vino);

        System.out.println("Ukupna cena korpe je: "+ korpa.ukupnaCenaKorpe(sk));

        korpa.izbaciAmbalazu("7687575868");

        System.out.println("Cena korpe nakon izbacivanja: " + korpa.ukupnaCenaKorpe(sk));

    }
}

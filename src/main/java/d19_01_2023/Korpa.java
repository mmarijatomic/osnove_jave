package d19_01_2023;

import java.util.ArrayList;

//Kreirati klasu Korpa koja ima:
//niz ambalaza
//metodu dodaj ambalazu
//metodu izbaci ambalazu, u funkciju se prosledjuje barkod flase (String) koju treba izbaciti
//privatnu metodu koja vraca cenu svih ambalaza sa popustom, metoda kao parametar prima popust.
//metodu koja racuna i vraca ukupncu cenu korpe (sabira sve cene ambalze), kao parametar funkcije
// se prima Super karticu iz koje se cita popust.
//
public class Korpa {

    private ArrayList <Ambalaza> nizAmbalaza;

    public Korpa () {
        nizAmbalaza = new ArrayList<Ambalaza>();
    }
    public void dodajAmbalazu (Ambalaza ambalaza) {
        nizAmbalaza.add(ambalaza);
    }
    public void izbaciAmbalazu (String barkod) {
        for (int i = 0; i < this.nizAmbalaza.size(); i++) {
            if (this.nizAmbalaza.get(i).getBarkod().equals(barkod)) {
                this.nizAmbalaza.remove(i);
            }
        }
    }
    private double cenaAmbalazaSaPopustom (double popust) {
        double suma = 0;
        for (int i = 0; i < this.nizAmbalaza.size(); i++) {
         suma = suma + this.nizAmbalaza.get(i).cenaArtika() * popust; }
        return suma - popust;
        }


        public double ukupnaCenaKorpe (SuperKartica kartica) {
        double suma = 0;
            for (int i = 0; i < this.nizAmbalaza.size(); i++) {
                suma= suma + this.nizAmbalaza.get(i).cenaArtika();
            } return suma - kartica.getPopust();
        }

    }


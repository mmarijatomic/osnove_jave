package d29_12_2022;

public class Proizvod {
    public String naziv;
    public double cena;
    public double tezina;

    public void stampaj() {
        System.out.println(naziv + ", " + cena + ", " + tezina);
    }

    public void povecajCenu(double iznos) {

        cena =cena + iznos;
    }

    public double vratiCenuSaPopustom(double popust) {

        return cena - (cena *  popust/100);
    }

    public int racunajPostarinu() {
        if (tezina <= 100) {
            return 200;
        } else if (tezina <= 500) {
            return 400;
        } else {
            return 1000;
        }
    }
}


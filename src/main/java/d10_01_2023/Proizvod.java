package d10_01_2023;

public class Proizvod {
    private String nazivProizvoda;
    private Kupac kupac;
    private double cenaIzrade;

    public Proizvod(String nazivProizvoda, Kupac kupac, double cenaIzrade) {
        this.nazivProizvoda = nazivProizvoda;
        this.kupac = kupac;
        this.cenaIzrade = cenaIzrade;
    }

    public double cenaProizvoda() {
        return cenaIzrade * 1.9 * (100 - kupac.getClanskaKarta().getPopust()) / 100;
    }

    public void stampajProizvod() {
        System.out.println(nazivProizvoda + " - " + cenaProizvoda());
        System.out.println(kupac.getImePrezime() + " - " + kupac.getClanskaKarta().getBrojKartice());
    }
}


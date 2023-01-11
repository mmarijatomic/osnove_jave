package d10_01_2023;

public class Kupac {
    private String imePrezime;
    private ClanskaKarta clanskaKarta;

    public Kupac(String imePrezime, ClanskaKarta clanskaKarta) {
        this.imePrezime = imePrezime;
        this.clanskaKarta = clanskaKarta;
    }

    public String getImePrezime() {
        return imePrezime;
    }

    public ClanskaKarta getClanskaKarta() {
        return clanskaKarta;
    }

    public void stampaj() {
        System.out.println(imePrezime + " - " + clanskaKarta.getBrojKartice());
    }
}


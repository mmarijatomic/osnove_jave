package d12_01_2023;

public class Racun {
    private String broj;
    private String imeIPrezimeKorisnika;
    private double stanje;

    public Racun(String broj, String imeIPrezimeKorisnika, double stanje) {
        this.broj = broj;
        this.imeIPrezimeKorisnika = imeIPrezimeKorisnika;
        this.stanje = stanje;
    }

    public String getBroj() {
        return broj;
    }

    public void setBroj(String broj) {
        this.broj = broj;
    }

    public String getImeIPrezimeKorisnika() {
        return imeIPrezimeKorisnika;
    }

    public void setImeIPrezimeKorisnika(String imeIPrezimeKorisnika) {
        this.imeIPrezimeKorisnika = imeIPrezimeKorisnika;
    }

    public double getStanje() {
        return stanje;
    }


    public void promeniStanje(double vrednost) {
        if (this.stanje + vrednost > 0) {
            this.stanje = this.stanje + vrednost;
        } else {
            System.out.println("Stanje na racunu ne moze biti manje od 0.");
        }
    }
    public void stampaj () {
        System.out.println("Ime i prezime: " + this.imeIPrezimeKorisnika + "-  broj racuna: " + this.broj);
        System.out.println("Stanje na racunu je: " + this.stanje + " rsd.");
    }
}

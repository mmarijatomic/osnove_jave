package d16_01_2023;

import p16_01_2023.Osoba;

public class Igrac extends Osoba {

    private int brojIgraca;

    private String pozicija;

    private boolean jeKapiten;

    public Igrac() {
        super();
    }
    public Igrac(String imeIPrezime, String jmbg, int godinaRodjenja, int brojIgraca, String pozicija, boolean jeKapiten) {
        super(imeIPrezime, jmbg, godinaRodjenja);
        this.brojIgraca = brojIgraca;
        this.pozicija = pozicija;
        this.jeKapiten = jeKapiten;
    }

    public int getBrojIgraca() {
        return brojIgraca;
    }

    public void setBrojIgraca(int brojIgraca) {
        this.brojIgraca = brojIgraca;
    }

    public String getPozicija() {
        return pozicija;
    }

    public void setPozicija(String pozicija) {
        this.pozicija = pozicija;
    }

    public boolean isJeKapiten() {
        return jeKapiten;
    }

    public void setJeKapiten(boolean jeKapiten) {
        this.jeKapiten = jeKapiten;
    }

    @Override
    public void stampaj () {
        System.out.println("Igrac: ");
        super.stampaj();
        System.out.println("Broj igraca: " + this.brojIgraca);
        System.out.println("Pozicija: " + this.pozicija);
        if (jeKapiten) { System.out.println("Igrac je kapiten");
            System.out.println();
        } else {
            System.out.println();}
    }
}

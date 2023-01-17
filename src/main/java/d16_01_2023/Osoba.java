package d16_01_2023;

public class Osoba {

    protected String imeIPrezime;

    protected String jmbg;

    protected int godRodjenja;

    public Osoba() {
    }

    public Osoba(String imeIPrezime, String jmbg, int godRodjenja) {
        this.imeIPrezime = imeIPrezime;
        this.jmbg = jmbg;
        this.godRodjenja = godRodjenja;
    }

    public String getImeIPrezime() {
        return imeIPrezime;
    }

    public void setImeIPrezime(String imeIPrezime) {
        this.imeIPrezime = imeIPrezime;
    }

    public String getJmbg() {
        return jmbg;
    }

    public void setJmbg(String jmbg) {
        this.jmbg = jmbg;
    }

    public int getGodRodjenja() {
        return godRodjenja;
    }

    public void setGodRodjenja(int godRodjenja) {
        this.godRodjenja = godRodjenja;
    }

    public void stampaj () {
        System.out.println("( " + this.imeIPrezime + "), ( " + this.jmbg + " ), ( " + this.godRodjenja + " )");
    }
}

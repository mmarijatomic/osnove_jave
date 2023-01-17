package d16_01_2023;

public class Trener extends Osoba {

    private int godineIskustva;

    private String tipTrenera;

    public Trener(String imeIPrezime, String jmbg, int godRodjenja, int godineIskustva, String tipTrenera) {
        super(imeIPrezime, jmbg, godRodjenja);
        this.godineIskustva = godineIskustva;
        this.tipTrenera = tipTrenera;
    }

    public int getGodineIskustva() {
        return godineIskustva;
    }

    public void setGodineIskustva(int godineIskustva) {
        this.godineIskustva = godineIskustva;
    }

    public String getTipTrenera() {
        return tipTrenera;
    }

    public void setTipTrenera(String tipTrenera) {
        this.tipTrenera = tipTrenera;
    }
    @Override
    public void stampaj () {
        System.out.println("Trener:");
        super.stampaj();
        System.out.println("Godine iskustva: " + this.godineIskustva);
        System.out.println("Tip trenera: " + this.tipTrenera);
        System.out.println();
    }
}

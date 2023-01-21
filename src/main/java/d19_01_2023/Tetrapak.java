package d19_01_2023;
//Kreirati klasu Tetrapak koja nasledjuje klasu Ambalaza koja ima:
//atribut koji kaze da li se moze reciklirati
//osnovna cena
//gettere i setter za atribute
//konstuktori koji su vam potrebni
//racuna cenu tako da ispunjava uslova:
//ako je od recikliranog materijala, ( tezina pakovanja ) * 1.5 + (osnovna cena);
//ako nije u cenu ulazi samo osnovna cena
//metoda stampaj stampa sve podatke iz klase tetrapak.
public class Tetrapak extends Ambalaza {

    private boolean mozeReciklirati;

    private double osnovnaCena;

    public boolean MozeReciklirati() {
        return mozeReciklirati;
    }

    public void setMozeReciklirati(boolean mozeReciklirati) {
        this.mozeReciklirati = mozeReciklirati;
    }

    public double getOsnovnaCena() {
        return osnovnaCena;
    }

    public void setOsnovnaCena(double osnovnaCena) {
        this.osnovnaCena = osnovnaCena;
    }

    public Tetrapak(String barkod, String nazivArtikla, int netoTezina, int brutoTezina, boolean mozeReciklirati, double osnovnaCena) {
        super(barkod, nazivArtikla, netoTezina, brutoTezina);
        this.mozeReciklirati = mozeReciklirati;
        this.osnovnaCena = osnovnaCena;
    }

    @Override
    public double cenaArtika() {
        if (MozeReciklirati()) {
            return (super.tezinaPakovanja() * 1.5 + (this.osnovnaCena));
        }else {
            return this.osnovnaCena; }


    }

    @Override
    public void stampaj() {
        System.out.println("Tetrapak:");
        System.out.println("Barkod: " + this.barkod);
        System.out.println("Naziv artikla: " +this.nazivArtikla);
        System.out.println("Neto tezina: " + this.netoTezina + ", bruto tezina: " + this.brutoTezina);
        if (MozeReciklirati()) {
        System.out.println("Ova ambalaza se moze se reciklirati");
        } else {
            System.out.println("Ova ambalaza se ne moze se reciklirati");
        }
        System.out.println("Cena je: " + this.cenaArtika() + "rsd");
        System.out.println();
    }
}

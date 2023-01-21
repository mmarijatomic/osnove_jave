package d19_01_2023;
//Kreirati klasu StaklenaAmbalaza koja nasledjuje klasu Ambalaza koja ima:
//kaucija za flasu
//atribut koji kaze da li se za flasu placa kaucija
//osnovna cena
//gettere i setter za atribute
//konstuktori koji su vam potrebni
//racuna cenu
//ako se kaucija placa, (osnovna cena) * 1.2 + (kaucija);
//ako se ne placa, (osnovna cena) * 1.2
//metoda stampaj stampa sve podatke iz klase staklena flasa.
public class StaklenaAmbalaza extends Ambalaza{

    private double kaucijaZaFlasu;

    private boolean placaKauciju;

    private double osnovnaCena;

    public StaklenaAmbalaza(String barkod, String nazivArtikla, int netoTezina, int brutoTezina, double kaucijaZaFlasu, boolean placaKauciju, double osnovnaCena) {
        super(barkod, nazivArtikla, netoTezina, brutoTezina);
        this.kaucijaZaFlasu = kaucijaZaFlasu;
        this.placaKauciju = placaKauciju;
        this.osnovnaCena = osnovnaCena;
    }

    public double getKaucijaZaFlasu() {
        return kaucijaZaFlasu;
    }

    public void setKaucijaZaFlasu(double kaucijaZaFlasu) {
        this.kaucijaZaFlasu = kaucijaZaFlasu;
    }

    public boolean isPlacaKauciju() {
        return placaKauciju;
    }

    public void setPlacaKauciju(boolean placaKauciju) {
        this.placaKauciju = placaKauciju;
    }

    public double getOsnovnaCena() {
        return osnovnaCena;
    }

    public void setOsnovnaCena(double osnovnaCena) {
        this.osnovnaCena = osnovnaCena;
    }

    @Override
    public double cenaArtika() {
        if (placaKauciju) {
            return this.osnovnaCena * 1.2 + this.kaucijaZaFlasu;
        } else {
            return this.osnovnaCena * 1.2;}

    }

    @Override
    public void stampaj() {
        System.out.println("Staklena ambalaza: ");
        System.out.println("Naziv artikla: " + this.nazivArtikla);
        if (placaKauciju) {
            System.out.println("Za ovu ambalazu se placa kaucija, koja iznosi :" + this.kaucijaZaFlasu + "rsd");
        }else {
            System.out.println("Za ovu ampalazu se ne placa kaucija.");}
        System.out.println("Cena je: " + this.cenaArtika() + "rsd");
        System.out.println();


    }
}

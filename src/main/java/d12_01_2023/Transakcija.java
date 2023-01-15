package d12_01_2023;

public class Transakcija {
    private int id;
    private Racun racunSa;
    private Racun racunNa;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Racun getRacunSa() {
        return racunSa;
    }

    public void setRacunSa(Racun racunSa) {
        this.racunSa = racunSa;
    }

    public Racun getRacunNa() {
        return racunNa;
    }

    public void setRacunNa(Racun racunNa) {
        this.racunNa = racunNa;
    }

    public Transakcija(int id, Racun racunSa, Racun racunNa) {
        this.id = id;
        this.racunSa = racunSa;
        this.racunNa = racunNa;
    }
    public double provizija (double transakcija) {
        if (transakcija < 4500) {
            return 45;
        } else {
            return transakcija * 0.01;
        }
    }
    public void izvrsiTransakciju (double transakcija){
        double provizija = provizija(transakcija);
        double novoStanjeSaKog = this.racunSa.getStanje() - (transakcija + provizija);
        if (novoStanjeSaKog < 0) {
            System.out.println("Nemate dovoljno sredstava na racunu.");
        } else {
            this.racunSa.promeniStanje(-transakcija-provizija);
            this.racunNa.promeniStanje(transakcija);
        }
    }
    public void stampajTransakciju(){
        System.out.println("id transakcije: " + this.id);
        System.out.println("Racun sa: " + this.racunSa.getImeIPrezimeKorisnika() + " - " + this.racunSa.getBroj());
        System.out.println("Racun na: " + this.racunNa.getImeIPrezimeKorisnika() + " - " + this.racunNa.getBroj());
    }
}


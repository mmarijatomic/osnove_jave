package d13_01_2023;

public class Ispit {
    private String nazivIspita;
    private double ocena;
    private String imeIPrezimeProf;

    public String getNazivIspita() {
        return nazivIspita;
    }

    public void setNazivIspita(String nazivIspita) {
        this.nazivIspita = nazivIspita;
    }

    public double getOcena() {
        return ocena;
    }

    public void setOcena(double ocena) {
        this.ocena = ocena;
    }

    public String getImeIPrezimeProf() {
        return imeIPrezimeProf;
    }

    public void setImeIPrezimeProf(String imeIPrezimeProf) {
        this.imeIPrezimeProf = imeIPrezimeProf;
    }

    public Ispit(String nazivIspita, double ocena, String imeIPrezimeProf) {
        this.nazivIspita = nazivIspita;
        this.ocena = ocena;
        this.imeIPrezimeProf = imeIPrezimeProf;
    }
    public Ispit(){}

    public boolean polozio (){
        if (this.ocena <= 10 && this.ocena > 5){
            return true;
        } return false;
    }

    public void stampa(){
        System.out.println("Predmet: " + this.nazivIspita + " - " + " profesor: " + this.imeIPrezimeProf
                +  " - " + this.ocena);
    }
}


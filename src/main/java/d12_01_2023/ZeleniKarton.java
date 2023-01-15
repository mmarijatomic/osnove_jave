package d12_01_2023;

public class ZeleniKarton {

    private String imeIPrezimeStudent;
    private int brojIndeksa;

    private String nazivPredmeta;

    private String imeIPrezimeProf;

    private int ocena;

    public ZeleniKarton(int brojIndeksa, String nazivPredmeta, String imeIPrezimeProf, int ocena, String imeIPrezimeStudent) {
        this.brojIndeksa = brojIndeksa;
        this.nazivPredmeta = nazivPredmeta;
        this.imeIPrezimeProf = imeIPrezimeProf;
        this.ocena = ocena;
        this.imeIPrezimeStudent = imeIPrezimeStudent;
    }

    public int getBrojIndeksa() {
        return brojIndeksa;
    }

    public void setBrojIndeksa(int brojIndeksa) {
        this.brojIndeksa = brojIndeksa;
    }

    public String getNazivPredmeta() {
        return nazivPredmeta;
    }

    public void setNazivPredmeta(String nazivPredmeta) {
        this.nazivPredmeta = nazivPredmeta;
    }

    public String getImeIPrezimeProf() {
        return imeIPrezimeProf;
    }

    public void setImeIPrezimeProf(String imeIPrezimeProf) {
        this.imeIPrezimeProf = imeIPrezimeProf;
    }

    public int getOcena() {
        return ocena;
    }

    public void setOcena(int ocena) {
        this.ocena = ocena;
    }

    public String getImeIPrezimeStudent() {
        return imeIPrezimeStudent;
    }

    public void setImeIPrezimeStudent(String imeIPrezimeStudent) {
        this.imeIPrezimeStudent = imeIPrezimeStudent;
    }

    public boolean jePolozio (int ocena) {
        if (ocena > 5) {return true;
        }else { return false;}
    }

    public void stampaj () {
        System.out.print("(" + this.nazivPredmeta + ")");
                if (this.jePolozio(this.ocena)) {
                    System.out.println(" - (" + this.ocena + ")");
                    System.out.println("Student: " + this.imeIPrezimeStudent + " " + this.brojIndeksa);
                    System.out.println("Profesor: " + this.imeIPrezimeProf );
                    System.out.println();

                } else {
                    System.out.println(" - Nije polozio ispit.");
                    System.out.println("Student: " + this.imeIPrezimeStudent + " " + this.brojIndeksa);
                    System.out.println("Profesor: " + this.imeIPrezimeProf );
                    System.out.println();
        }

    }
}

package d29_12_2022;

public class FacebookPost {
    private String autorImeIPrezime;
    private String profilImeIPrezime;
    private String tekst;
    private int lajkovi;
    private int deljenja;

    public String getAutorImeIPrezime() {
        return this.autorImeIPrezime;
    }
    public String getProfilImeIPrezime() {
        return this.profilImeIPrezime;
    }
    public String getTekst (){
        return this.tekst;
    }
    public int getLajkovi () {
        return this.lajkovi;
    }
    public int getDeljenja() {
        return this.deljenja;
    }

    public void setAutorImeIPrezime (String imeIPrezime) {
        this.autorImeIPrezime = imeIPrezime;
    }
    public void setProfilImeIPrezime (String imeIPrezime) {
        this.profilImeIPrezime = imeIPrezime;
    }
    public void setTekst (String tekst) {
        this.tekst = tekst;
    }

    public void like() {
        lajkovi ++;
    }
    public void dislike() {
        if(lajkovi>0) {
            lajkovi--;
        }
    }
    public void share () {
        deljenja++;
    }

    public void print () {
        System.out.println("(" + this.autorImeIPrezime+ ") >>> (" + profilImeIPrezime + ")\n" +
                "(" + this.tekst + ")\n" +
                "Likes (" + this.lajkovi + ") |  Shares (" + this.deljenja + ")\n");
    }

}
package d10_01_2023;

public class ClanskaKarta {
    private int popust;
    private String brojKartice;

    public ClanskaKarta(int popust, String brojKartice) {
        this.popust = popust;
        this.brojKartice = brojKartice;
    }

    public int getPopust() {
        return popust;
    }

    public String getBrojKartice() {
        return brojKartice;
    }
}


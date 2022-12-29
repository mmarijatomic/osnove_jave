package d27_12_2022;

public class SmartAirConditioning {

    public String markaKlime;

    public int izabranaTemp;

    public String mod;

    public void stampa() {
        System.out.println("Marka klima uredjaja je " + markaKlime + " koja radi na modu za "
                + mod + " i trenutna temperatura je " + izabranaTemp + "c.");
    }
    public boolean daLiJeTempVeca (int spoljnaTemp) {
        if (spoljnaTemp > izabranaTemp) {
            return true;
        } else {
            return false;
        }
    }}

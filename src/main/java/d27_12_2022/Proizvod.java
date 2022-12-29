package d27_12_2022;

public class Proizvod {

    public String nazivProizvoda;

    public double cenaProizvoda;

    public double tezinaProizvoda;

    public void stampa () {
        System.out.println("{{"+nazivProizvoda+ "}} , {{" + cenaProizvoda + "}}, {{"+ tezinaProizvoda + "g }}" );
    }
    public double konvertuj (String unetaJedinica) {
        if (unetaJedinica.equals("t")) return this.tezinaProizvoda * 0.000001;
        else if (unetaJedinica.equals("kg")) { return this.tezinaProizvoda * 0.001;
        } else {return 0;}


    }
}

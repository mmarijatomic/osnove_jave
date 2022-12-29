package p13_12_2022;

public class Zadatak1 {

    public static void main(String[] args) {
//        Napisati program koji na ekranu stampa podatke u formatu:
//[IME I PREZIME]
//[BROJ TELEFONA], [ULICA I BROJ], [GRAD]
//[EMAIL]
    String ImeIPrezime = "Marija Tomic";
    String BrojTelefona = "062613084";
    String UlicaIBroj = "Sindjelicev Trg 28";
    String Grad = "Nis";
    String Email = "mmarijatomicc@gmail.com";

    System.out.println(ImeIPrezime);
    System.out.println(BrojTelefona + " "+ UlicaIBroj + " " + Grad);
    System.out.println(Email);

}
}
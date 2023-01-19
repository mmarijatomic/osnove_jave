package d17_01_2023;
//Kreirati klasu VideoPlayer koja ima:
//duzinu videa
//trenutno vreme videa
//jacinu zvuka
//Kvalitet videa (144, 240, 360, 480, 720, 1080)
//gettere, settere i konstruktore
//metodu stampaj koja stampa podatke u formatu:
//trenutno vreme videa
//jacina zvuka
//kavlitet videa
//
//Kreirati apstraktnu klasu Control koja ima:
//abstraktnu metodu izvrsi akciju, koja kao parametar prima objekat VideoPlayer
//
//Kreirati klasu TimeControl koja nasledjuje klasu Control i
//konstruktore
//ima atribut koji kaze na koju stranu pomera trenutno vreme videa (tipa boolean)
//implementira metodu izvrsi akciju tako sto pomeri trenutno vreme videa za 15s unapred ili unazad u zavisnosti od atributa.
//Veoma je bitno da se ne izadje van granica videa.
//
//Kreirati klasu AudioControl koja nasledjuje klasu Control i
//gettere, settere i konstruktore
//ima atribut koji kaze da li se smanjuje ili pojacava zvuk (tipa boolean)
//implementira metodu izvrsi akciju tako sto pojaca ili smanjuje zvuk za 1. U opsegu od 0 do 100
//
//Kreirati klasu QualityOptimizerControl koja nasledjuje klasu Control i
//ima brzinu interneta u megabajtima, npr 10mb/s, 20mb/s, 7.9mb/s
//gettere, settere i konstruktore
//implementira metodu izvrsi akciju tako sto postavlja kvalitet videa u zavisnosti od brzine interneta.
//Kvalitet se racuna na osnovu formule:
//brzina interneta * 10.1, gde se uzima prvi veci kvalitet
//npr: ako je brizna interneta 20 * 10.1 = 204 => postavlja 240
//npr: ako je brzina interneta 5 * 10.1 = 50.5 => postavlja 144
//npr: ako je brzina interneta 50 * 10.1 = 505 => postavlja 720
//
//U glavnom programu kreirati video plejer i izvrsiti neke akcije nad njim.
public class Zadatak1 {
    public static void main(String[] args) {

        VideoPlayer winamp = new VideoPlayer(4.20, 1.18, 25, 430);
        TimeControl tc = new TimeControl(true);
        AudioControl ac = new AudioControl(true);
        QualityOptimizerControl qc = new QualityOptimizerControl(20);

        winamp.print();
        tc.action(winamp);
        ac.action(winamp);
        qc.action(winamp);
        winamp.print();

    }







}

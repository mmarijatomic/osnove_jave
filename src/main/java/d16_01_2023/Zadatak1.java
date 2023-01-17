package d16_01_2023;
//Kreirati klasu Osoba koja ima:
//ime i prezime
//jmbg
//godinu rodjenja
//default-ni konstuktor
//konstuktor sa parametrima
//gettere i settere
//metodu stampaj koja stampa u formatu:
//(ime i prezime), (jmbg), (godina rodjenja)
//
//Kreirati klasu Igrac koja nasledjuje klasu Osoba i koja ima:
//broj (broj koji igrac nosi)
//poziciju koju igra (odbrambeni, napadac, … )
//kapiten (promenljiva koja kaze da li je igrac kapiten tima, i tipa je boolean)
//default-ni konstuktor
//konstuktor sa parametrima
//gettere i settere za broj, kapiten i poziciju
//metodu stampaj, koju prepisuje iz glavne klase, tako da stampa sve informacije o igracu
//
//Kreirati klasu Trener koja nasledjuje klasu Osoba i koja ima:
//godine iskustva
//tip trenera (kondicioni, za igru, pomocni, personalni)
//metodu stampaj, koju prepisuje iz glavne klase, tako da stampa sve informacije o treneru.
//
//U glavnom programu kreirati 2 igraca i 2 trenera, i istestirati metode.
public class Zadatak1 {
    public static void main(String[] args) {

        Igrac i1 = new Igrac("Marko Milosevic", "110299875648",1998, 5, "napadac", false);
        Igrac i2 = new Igrac("Dusan Stosic", "090399765764",1997, 2, "odbrambeni", true);
        i1.stampaj();
        i2.stampaj();

        Trener t1 = new Trener("Petar Pesic", "0101962878678", 1962, 18, "kondicioni");
        Trener t2 = new Trener("Nikola Misic", "111299056677", 1990, 7, "pomocni");
        t1.stampaj();
        t2.stampaj();
    }
}

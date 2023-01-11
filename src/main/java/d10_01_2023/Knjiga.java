package d10_01_2023;

public class Knjiga {

    private int ISBN;

    private String naziv;

    private int godinaIzdanja;

    private Autor autor;

    public Knjiga(int ISBN, String naziv, int godinaIzdanja, Autor autor) {
        this.ISBN = ISBN;
        this.naziv = naziv;
        this.godinaIzdanja = godinaIzdanja;
        this.autor = autor;
    }

    public int getISBN() {
        return ISBN;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public int getGodinaIzdanja() {
        return godinaIzdanja;
    }

    public void setGodinaIzdanja(int godinaIzdanja) {
        this.godinaIzdanja = godinaIzdanja;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public void print () {
        System.out.println("(" + this.ISBN + ")");
        System.out.println("(" + this.naziv + ") - (" + this.godinaIzdanja + ")");
        System.out.println("autor: " + "(" + this.autor.getIme() + " " + this.autor.getPrezime() + ")");
    }

}

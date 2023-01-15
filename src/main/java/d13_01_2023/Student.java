package d13_01_2023;

import java.util.ArrayList;

public class Student {
    private int index;
    private String imeIPrezimeStudent;
    private String tipStudija;
    private ArrayList <Ispit> ispiti;

    public Student(int index, String imeIPrezimeStudent, String tipStudija) {
        this.index = index;
        this.imeIPrezimeStudent = imeIPrezimeStudent;
        this.tipStudija = tipStudija;
        this.ispiti = new ArrayList<>();
    }
    public Student (){
        this.ispiti = new ArrayList<>();
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public String getImeIPrezimeStudent() {
        return imeIPrezimeStudent;
    }

    public void setImeIPrezimeStudent(String imeIPrezimeStudent) {
        this.imeIPrezimeStudent = imeIPrezimeStudent;
    }

    public String getTipStudija() {
        return tipStudija;
    }

    public void setTipStudija(String tipStudija) {
        this.tipStudija = tipStudija;
    }

    public ArrayList<Ispit> getIspiti() {
        return ispiti;
    }

    public void dodajIspit(Ispit ispit){
        this.ispiti.add(ispit);
    }
    public double prosek(){
        double suma = 0;
        double brojac = 0;
        for (int i = 0; i < this.ispiti.size() ; i++) {
            if (this.ispiti.get(i).polozio()){
                suma += this.ispiti.get(i).getOcena();
                brojac++;
            } return suma/brojac;}
        return 0;
    }
    public void stampaj(){
        for (int i = 0; i <this.ispiti.size(); i++) {
            this.ispiti.get(i).stampa();
        }
        System.out.println("Prosek ocena je: " + prosek() );
    }
}


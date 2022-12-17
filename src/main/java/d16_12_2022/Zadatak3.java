package d16_12_2022;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Scanner;

//Napisati program koji stampa sve brojeve od 1 do 100 tako da:
//sve parne stampa kao negativne a
//sve neprane kao pozitivne brojeve
//                Primer izvrsenja:
//	   0, 1, -2, 3, -4, 5, -6, ……
public class Zadatak3 {
    public static void main(String[] args) {

        for (int i = 1; i < 101; i++) {
            if (i % 2 == 0) {
                System.out.print(-i + ", ");
            } else {
                System.out.print(i + ", ");
            }
        }

    }}
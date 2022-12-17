package d16_12_2022;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

//Napisati program koji stampa 25 _ (donjih crta), pritom na svaku 5. iteraciju odstampa i novi red.
//Zadatak resiti pomocu FOR petlje.
//Primer izvrsenja:
//_ _ _ _ _
//_ _ _ _ _
//_ _ _ _ _
//_ _ _ _ _
//_ _ _ _ _
public class Zadatak2 {
    public static void main(String[] args) {

        for (int i = 1; i <= 25; i++) {
            System.out.print("_ ");

            if (i%5==0) {
                System.out.println();
            }

        }

         }}





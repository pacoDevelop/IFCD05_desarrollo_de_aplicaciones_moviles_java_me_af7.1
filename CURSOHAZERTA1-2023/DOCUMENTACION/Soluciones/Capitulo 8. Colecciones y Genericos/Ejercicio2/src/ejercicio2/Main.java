package ejercicio2;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> conjunto = new ArrayList<String>();

        conjunto.add("Esto");
        conjunto.add("es");
        conjunto.add("una");
        conjunto.add("prueba");
        conjunto.add("de");
        conjunto.add("almacenamiento");
        conjunto.add("de");
        conjunto.add("palabras");

        Iterator<String> itr = conjunto.iterator();

        while(itr.hasNext()){
            System.out.print(itr.next() + " ");
        }
        System.out.println("");
    }

}

package ejercicio3;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Integer[] array = new Integer[10];
        ArrayList lista = new ArrayList();

        for(int i=0; i<10;i++){
            array[i] = new Integer(i);
            lista.add(i, new Integer(i));
        }

        for(int i=0; i<10; i++){
            System.out.print("Array: " + array[i]);
            System.out.println(" Lista: " + lista.get(i));
        }
    }

}

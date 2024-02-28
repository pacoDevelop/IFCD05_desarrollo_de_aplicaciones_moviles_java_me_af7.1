package ejercicio2;

import java.io.File;

public class Main {

	public static void main(String[] args) {
		File f = new File("");
        File lista[]=f.listRoots();
        for (int i=0; i < lista.length; i++){
            System.out.print(lista[i] + " ");
        }

	}

}

package ejercicio1;

import java.io.File;

public class Main {

	public static void main(String[] args) {
		int i;
        File canal = new File("C:\\windows");
        String [] lista = canal.list();
        for (i=0;i<lista.length;i++){
            System.out.println(lista[i]);
        }
	}

}

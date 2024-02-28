package ejercicio3;

import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) {
		String texto;
        InputStreamReader flujo = new InputStreamReader(System.in);
        BufferedReader teclado = new BufferedReader(flujo);
        try{
           System.out.println("Introduce fichero con ruta completa ");
           texto = teclado.readLine();
           File f = new File(texto);
           System.out.println("Nombre: " + f.getName());
           System.out.println("Directorio " + f.getPath());
           if (f.exists()) System.out.println("El fichero existe ");
           if (f.canWrite()) System.out.println("Se puede escribir ");
           if (f.canRead()) System.out.println("Se puede leer ");
           System.out.println("El tamaño es: " + f.length() + " bytes");
           System.out.println("La ultima modificacion es: " + f.lastModified());
        }catch (Exception e){
           System.out.println(e.getMessage());
        }

	}

}

package ejercicio4;

import java.io.FileOutputStream;

public class Main {

	public static void main(String[] args) {
		FileOutputStream fs = null;
        byte buffer[] = new byte[128];
        int nbytes;

        try{
           System.out.println("Escribe el texto a guardar ");
           nbytes = System.in.read(buffer);
           fs = new FileOutputStream("D:\\texto.txt", true);
           fs.write(buffer,0,nbytes);
        }catch (Exception e){
           System.out.println(e.getMessage());
        }

	}

}

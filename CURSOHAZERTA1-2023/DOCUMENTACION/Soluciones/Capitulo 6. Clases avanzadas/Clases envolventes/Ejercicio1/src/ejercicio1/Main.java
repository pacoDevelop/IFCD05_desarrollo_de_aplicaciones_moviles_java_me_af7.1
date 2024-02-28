package ejercicio1;

public class Main {

    public static void main(String[] args) {
        for (char c: new Main().caracteres("Hola")){
            System.out.println(c);
        }
    }

    public char[] caracteres(String cadena){
         return cadena.toCharArray();
    }

}

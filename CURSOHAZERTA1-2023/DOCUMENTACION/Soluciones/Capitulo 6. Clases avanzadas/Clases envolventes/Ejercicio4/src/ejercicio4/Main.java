package ejercicio4;

public class Main {

    public static void main(String[] args) {
        System.out.println(new Main().enMayusculas("hola"));
    }

    public String enMayusculas(String cadena){
        return cadena.toUpperCase();
    }
}

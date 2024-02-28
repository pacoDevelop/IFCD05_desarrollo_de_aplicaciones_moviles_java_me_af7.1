package ejercicio3;

public class Main {

    public static void main(String[] args) {
        System.out.println(new Main().enMinusculas("HOLA"));
    }

    public String enMinusculas(String cadena){
        return cadena.toLowerCase();
    }

}

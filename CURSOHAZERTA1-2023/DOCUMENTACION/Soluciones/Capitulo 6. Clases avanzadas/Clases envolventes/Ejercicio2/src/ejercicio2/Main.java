package ejercicio2;

public class Main {

    public static void main(String[] args) {
        System.out.println(new Main().representacionBinaria(2));
    }

    public String representacionBinaria(int numero){
         return Integer.toBinaryString(numero);
    }

}

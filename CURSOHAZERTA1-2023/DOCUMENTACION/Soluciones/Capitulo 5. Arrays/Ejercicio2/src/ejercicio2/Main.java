package ejercicio2;

public class Main {

    public static void main(String[] args) {
        int[] enteros = {3,9,5,4,8,12,2,7};

        for (int numero : enteros){
            if (numero % 2 == 0){
                System.out.println("El numero " + numero+" es par");
            }else{
                System.out.println("El numero " + numero + " es impar");
            }

            if (numero % 3 == 0){
                System.out.println("El numero " + numero + " es divisible por 3");
            }
        }
    }

}

package ejercicio7;

public class Main {

    public static void main(String[] args) {
        float[] decimales = new float[]{3.4F, 5.67F, 12.0F, 3.141615F, 0.0F};
        float suma = 0;

        for (float numero : decimales) {
            suma += numero;
        }

        System.out.println("La suma de todos los elementos del array es " + suma);
    }
}

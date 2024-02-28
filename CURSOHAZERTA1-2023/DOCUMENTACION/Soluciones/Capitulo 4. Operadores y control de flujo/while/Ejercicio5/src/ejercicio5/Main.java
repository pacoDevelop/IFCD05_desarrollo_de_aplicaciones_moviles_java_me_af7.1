package ejercicio5;

public class Main {

    public static void main(String[] args) {
        int suma = 0;
        for (int i = 1; i <= 100; i++) {
            for (int j = 1; j < i; j++) {
                if (i % j == 0) {
                    suma = suma + j;
                }
            }
            if (i == suma) {
                System.out.println("Numero perfecto: " + i);
            }
            suma = 0;
        }
    }
}

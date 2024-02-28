package ejercicio8;

public class Main {

    public static void main(String[] args) {
        for (int i = 1; i <= 20; i = i + 1) {
            System.out.println();
            System.out.println("El " + i + " es divisible por:");
            System.out.println();
            for (int j = 1; j <= 20; j = j + 1) {
                if (i % j == 0) {
                    if (j != 1 && j != i) {
                        System.out.println("Es divisible por " + j);
                    } else if (j == 1) {
                        System.out.println("Por 1");
                    } else {
                        System.out.println("Por si mismo");
                    }
                }
            }
        }
    }
}

package ejercicio1;

public class Main {

    public static void main(String[] args) {
        int cont;
        cont = 0;
        for (int i = 1; i <= 100; i = i + 1) {
            for (int j = 2; j <= (i - 1); j = j + 1) {
                if (i % j == 0) {
                    cont = 1;
                }

            }
            if (cont == 0) {
                System.out.println(i);
            }
            cont = 0;
        }
    }
}

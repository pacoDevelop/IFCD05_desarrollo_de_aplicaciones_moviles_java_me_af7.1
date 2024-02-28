package ejercicio3;

public class Main {

    public static void main(String[] args) {
        int cont;
        cont = 0;
        int i = 0;
        int primo = 1;
        while (primo != 26) {
            i = i + 1;
            for (int j = 2; j <= (i - 1); j = j + 1) {
                if (i % j == 0) {
                    cont = 1;
                }
            }
            if (cont == 0) {
                System.out.println("Primo " + primo + " -> " + i);
                primo = primo + 1;
            }
            cont = 0;
        }
    }
}

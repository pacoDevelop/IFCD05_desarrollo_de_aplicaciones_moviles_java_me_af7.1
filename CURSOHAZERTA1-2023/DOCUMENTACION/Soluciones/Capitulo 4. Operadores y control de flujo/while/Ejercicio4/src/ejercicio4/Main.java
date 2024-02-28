package ejercicio4;

public class Main {

    public static void main(String[] args) {
        int cont;
        cont = 0;
        int i = 198;
        int primo = 0;
        while (primo != 1) {
            i = i + 1;
            for (int j = 2; j <= (i - 1); j++) {
                if (i % j == 0) {
                    cont = 1;
                }
            }
            if (cont == 0) {
                System.out.println(i);
                primo = 1;
            }
            cont = 0;
        }
    }
}

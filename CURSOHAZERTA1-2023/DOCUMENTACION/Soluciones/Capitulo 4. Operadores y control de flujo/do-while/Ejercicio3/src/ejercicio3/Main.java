package ejercicio3;

public class Main {

    public static void main(String[] args) {
        int suma = 0;
        int n = 10;
        do {
            if (n % 2 == 0) {
                suma = suma + n;
            }
            n = n + 1;
        } while (n <= 50);
        System.out.println(suma);
    }
}

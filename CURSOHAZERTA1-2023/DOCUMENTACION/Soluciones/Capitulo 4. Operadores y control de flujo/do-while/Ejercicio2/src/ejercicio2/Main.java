package ejercicio2;

public class Main {

    public static void main(String[] args) {
        int a = 1;
        int b = 1;
        int c = 0;
        int n = 0;
        System.out.println(a);
        System.out.println(b);
        do {
            c = a + b;
            System.out.println(c);
            a = b;
            b = c;
            n = n + 1;
        } while (n <= 20);
    }
}

package ejercicio6;

public class Main {

    public static void main(String[] args) {
        int a = 1;
        int b = 1;
        int c = 0;
        int n = 20;
        System.out.println(a);
        System.out.println(b);
        while (n != 0) {
            c = a + b;
            System.out.println(c);
            a = b;
            b = c;
            n = n - 1;
        }
    }
}

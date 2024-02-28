package ejercicio2;

public class Main {

    public static void main(String[] args) {
        int exp = 1;
        int cont = 0;
        while (cont != 8) {
            exp = exp * 2;
            cont = cont + 1;
        }
        System.out.println(exp);
    }
}

package ejercicio1;

public class Main {

    public static void main(String[] args) {
        int exp = 1;
        int cont = 1;
        do {
            exp = exp * 2;
            cont = cont + 1;
        } while (cont <= 8);
        System.out.println(exp);
    }
}

package ejercicio4;

public class Main {

    public static void main(String[] args) {
        double fact = 1;
        for (int i = 15; i > 0; i--) {
            fact = fact * i;
        }
        System.out.println(fact);
    }
}

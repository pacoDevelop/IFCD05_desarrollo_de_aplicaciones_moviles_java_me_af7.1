package ejercicio6;

public class Main {

    public static void main(String[] args) {
        System.out.println(new Main().representaFloat(12.78F));
    }

    public String representaFloat(float numero){
        return Float.toString(numero);
    }

}

package ejercicio5;

public class Main {

    public static void main(String[] args) {
        System.out.println(new Main().devuelveCadena('a'));
    }

    public String devuelveCadena(char caracter){
        return Character.toString(caracter);
    }

}

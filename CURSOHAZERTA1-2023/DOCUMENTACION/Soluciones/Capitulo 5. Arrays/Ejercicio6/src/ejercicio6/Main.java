package ejercicio6;

public class Main {

    public static void main(String[] args) {
        char[] letras = new char[]{'2','f','f','u','u','g','h','i','4'};

        char[] consonantes = {'b','c','d','f','g','h','j','k','l','m','n','p','q','r','s','t','v','w','x','y','z'};

        for (char letra : letras){
            for (char consonante : consonantes){
                if (letra == consonante){
                    System.out.print(letra + " ");
                    break;
                }
            }
        }
        System.out.println("");
    }

}

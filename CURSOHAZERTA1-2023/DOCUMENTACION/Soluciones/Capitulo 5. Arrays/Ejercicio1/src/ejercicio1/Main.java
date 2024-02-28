package ejercicio1;

public class Main {

    public static void main(String[] args) {
        char[] caracteres = new char[]{'w','f','a','h','u','g','b','i','o'};
        char letra;

        for(int i = 0; i<caracteres.length; i++){
            letra = caracteres[i];
            switch (letra){
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                case 'A':
                case 'E':
                case 'I':
                case 'O':
                case 'U':
                    System.out.println(letra);
                    break;
            }
        }
    }

}

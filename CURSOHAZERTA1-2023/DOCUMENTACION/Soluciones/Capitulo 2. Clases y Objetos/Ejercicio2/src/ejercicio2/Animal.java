package ejercicio2;

public class Animal {

    public boolean mamifero;
    public int numPatas;
    public String nombre;

    public void dormir(){
        System.out.println("El animal esta durmiendo");
    }

    public void comer(){
        System.out.println("El animal esta comiendo");
    }

    public void mostrarInformacion(){
        System.out.println("Manimero: " + mamifero +
                           " Numero de patas: " +numPatas +
                           " Nombre : " + nombre);
    }
}

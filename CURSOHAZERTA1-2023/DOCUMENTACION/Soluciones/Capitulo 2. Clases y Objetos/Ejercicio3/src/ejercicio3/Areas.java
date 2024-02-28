package ejercicio3;

public class Areas {

    public void areaCirculo(double radio){
        double area = Math.PI * Math.pow(radio, 2);
        System.out.println("El area del circulo es " + area);
    }

    public void areaRectangulo(double base, double altura){
        double area = base * altura;
        System.out.println("El area del rectangulo es " + area);
    }

}

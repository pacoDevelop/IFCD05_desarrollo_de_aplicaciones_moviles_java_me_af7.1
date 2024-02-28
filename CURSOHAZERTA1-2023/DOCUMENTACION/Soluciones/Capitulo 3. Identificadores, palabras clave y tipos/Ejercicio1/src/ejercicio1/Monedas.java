package ejercicio1;

public class Monedas {

    public void calcularCambio(double pago, double importe){

        double cambio = pago - importe;
        // redondeamos a dos decimales para no perder centimos
        cambio = Math.rint(cambio*100)/100;
        
        // calculamos billetes de 500 euros a devolver
        int billete500 = (int)cambio / 500;
        System.out.println("Billetes de 500 € " + billete500);
        cambio = cambio - (billete500 * 500);
        cambio = Math.rint(cambio*100)/100;
        
        // calculamos billetes de 200 euros a devolver
        int billete200 = (int)cambio / 200;
        System.out.println("Billetes de 200 € " + billete200);
        cambio = cambio - (billete200 * 200);
        cambio = Math.rint(cambio*100)/100;
        
        // calculamos billetes de 100 euros a devolver
        int billete100 = (int)cambio / 100;
        System.out.println("Billetes de 100 € " + billete100);
        cambio = cambio - (billete100 * 100);
        cambio = Math.rint(cambio*100)/100;
        
        // calculamos billetes de 50 euros a devolver
        int billete50 = (int)cambio / 50;
        System.out.println("Billetes de 50 € " + billete50);
        cambio = cambio - (billete50 * 50);
        cambio = Math.rint(cambio*100)/100;
        
        // calculamos billetes de 20 euros a devolver
        int billete20 = (int)cambio / 20;
        System.out.println("Billetes de 20 € " + billete20);
        cambio = cambio - (billete20 * 20);
        cambio = Math.rint(cambio*100)/100;
       
        // calculamos billetes de 10 euros a devolver
        int billete10 = (int)cambio / 10;
        System.out.println("Billetes de 10 € " + billete10);
        cambio = cambio - (billete10 * 10);
        cambio = Math.rint(cambio*100)/100;
        
        // calculamos billetes de 5 euros a devolver
        int billete5 = (int)cambio / 5;
        System.out.println("Billetes de 5 € " + billete5);
        cambio = cambio - (billete5 * 5);
        cambio = Math.rint(cambio*100)/100;
        
        // calculamos monedas de 2 euros a devolver
        int moneda2 = (int)cambio / 2;
        System.out.println("Monedas de 2 € " + moneda2);
        cambio = cambio - (moneda2 * 2);
        cambio = Math.rint(cambio*100)/100;
       
        // calculamos monedas de 1 euro a devolver
        int moneda1 = (int)cambio / 1;
        System.out.println("Monedas de 1 € " + moneda1);
        cambio = cambio - (moneda1 * 1);
        cambio = Math.rint(cambio*100)/100;
       
        // calculamos monedas de 50 centimos de euro a devolver
        int moneda050 = (int)(cambio / 0.5);
        System.out.println("Monedas de 50 centimos € " + moneda050);
        cambio = cambio - (moneda050 * 0.5);
        cambio = Math.rint(cambio*100)/100;
        
        // calculamos monedas de 20 centimos de euro a devolver
        int moneda020 = (int)(cambio / 0.2);
        System.out.println("Monedas de 20 centimos € " + moneda020);
        cambio = cambio - (moneda020 * 0.2);
        cambio = Math.rint(cambio*100)/100;
        
        // calculamos monedas de 10 centimos de euro a devolver
        int moneda010 = (int)(cambio / 0.1);
        System.out.println("Monedas de 10 centimos € " + moneda010);
        cambio = cambio - (moneda010 * 0.1);
        cambio = Math.rint(cambio*100)/100;
        
        // calculamos monedas de 5 centimos de euro a devolver
        int moneda005 = (int)(cambio / 0.05);
        System.out.println("Monedas de 5 centimos € " + moneda005);
        cambio = cambio - (moneda005 * 0.05);
        cambio = Math.rint(cambio*100)/100;
        
        // calculamos monedas de 2 centimos de euro a devolver
        int moneda002 = (int)(cambio / 0.02);
        System.out.println("Monedas de 2 centimos € " + moneda002);
        cambio = cambio - (moneda002 * 0.02);
        cambio = Math.rint(cambio*100)/100;
        
        // calculamos monedas de 1 centimo de euro a devolver
        int moneda001 = (int)(cambio / 0.01);
        System.out.println("Monedas de 1 centimo € " + moneda001);
        cambio = cambio - (moneda001 * 0.01);
        cambio = Math.rint(cambio*100)/100;
        
    }

}

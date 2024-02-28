package ejercicio1;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Main {

	public static void main(String[] args) {
		// crear y configurar la ventana
        JFrame frame = new JFrame("Ventana desde JFrame");

        // acción por defecto al cerrar la ventana: salir del programa
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel1 = new JPanel();

        /* para añadir un panel a un JFrame es preferible
         * ventana.getContentPane().add(panel1);
         * en lugar de
         * ventana.add(panel1); */
        frame.getContentPane().add(panel1);

        // mostrar la ventana
        frame.setSize(340, 240); // dimensiones
        frame.setLocation(200, 200); // posición
        frame.setResizable(false); // no cambia el tamaño
        frame.setVisible(true); // mostrarla

	}

}

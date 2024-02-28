package ejercicio2;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Main extends JFrame{

	private JPanel panel1;

	public static void main(String args[]) {
		new Main();
	}

	// MÉTODO CONSTRUCTOR QUE CREA Y MUESTRA LA INTERFAZ
	// Ventana_sencilla hereda las características de JFrame
	public Main() {
		/*
		 * la variable especial this se usa en métodos de instancia para hacer
		 * referencia al objeto que contiene al método, aquí equivale a JFrame
		 */
		// acción por defecto al cerrar la ventana: salir del programa
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("Ventana desde JFrame");
		this.setSize(340, 240);
		this.setLocation(200, 200);
		this.setResizable(false);
		this.setVisible(true);

	}

}

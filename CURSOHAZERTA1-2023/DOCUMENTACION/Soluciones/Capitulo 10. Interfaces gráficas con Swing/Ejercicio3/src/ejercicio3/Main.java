package ejercicio3;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class Main extends JFrame {

    private JPanel panel1;
    private JButton bt;
    private JLabel label;


    public static void main(String args[]) {
        new Main();
    }

    // MÉTODO CONSTRUCTOR QUE CREA Y MUESTRA LA INTERFAZ
    // Ventana_sencilla hereda las características de JFrame
    public Main() {
        /* la variable especial this se usa en métodos de instancia
         * para hacer referencia al objeto que contiene al método,
         * aquí equivale a JFrame */
        // acción por defecto al cerrar la ventana: salir del programa
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        /* panel contenido en la ventana, BorderLayout es uno de los tipos de disposición de los paneles
         * tiene 5 zonas: NORTH, WEST, CENTER, EAST, SOUTH */
        panel1 = new JPanel(new BorderLayout());
        // etiqueta y botón contenidos en el pane
        // etiqueta con texto alineado al centro en horizontal
        label = new JLabel("Ventana con etiqueta y botón", SwingConstants.CENTER);
        Font letra1 = new Font("Verdana", Font.PLAIN, 18);
        label.setFont(letra1);
        label.setForeground(Color.blue);
        bt = new JButton("Salir");
        Font letra2 = new Font("Verdana", Font.BOLD, 12);
        bt.setFont(letra2);
        /* asociar el botón con una instancia de la clase Cerrar
         * para configurar la acción al pulsar en el botón */
        bt.addActionListener(new Cerrar());

        /* colocar los componentes en los paneles;
         * para añadir un componente a un JFrame es preferible
         * ventana.getContentPane().add(panel1);
         * en lugar de
         * ventana.add(panel1); */
        this.getContentPane().add(panel1);
        panel1.add(label, BorderLayout.CENTER);
        panel1.add(bt, BorderLayout.SOUTH);

        this.setTitle("Ventana desde JFrame");
        this.setSize(340, 240);
        this.setLocation(200, 200);
        this.setResizable(false);
        this.setVisible(true);
    }
    //CERRAR EL PROGRAMA AL PULSAR EL BOTÓN bt
    //el botón bt se asocia con una instancia de la clase Cerrar
    //en la clase Cerrar están definidos el evento y la acción que se va a realizar

    class Cerrar implements ActionListener {

        public void actionPerformed(ActionEvent evt) {
            System.exit(0);
        }
    }
}

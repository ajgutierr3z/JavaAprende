/**
 * RETO DEL GIMNASIO DE CÓDIGO (GUI - Nivel 2)
 * Reto 4: ¿Cuál es el mayor?
 */

import javax.swing.*;
import java.awt.FlowLayout;


public class MayorDeDosVisual extends JFrame {
    JTextField cajaNum1, cajaNum2;
    JButton btnEvaluar;
    JLabel etiquetaResultado;

    public MayorDeDosVisual() {
        setTitle("El Mayor de Dos");
        setSize(250, 200);
        setLayout(new FlowLayout());
        
        cajaNum1 = new JTextField(5);
        cajaNum2 = new JTextField(5);
        btnEvaluar = new JButton("¿Cuál es mayor?");
        etiquetaResultado = new JLabel("Esperando números...");
        
        btnEvaluar.addActionListener(e -> {
            // TODO 1: Extrae el texto de ambas cajas (getText()) y conviértelos a int
            // TODO 2: Crea un if/else para comparar cuál es mayor
            // TODO 3: Cambia el texto de etiquetaResultado usando .setText("El mayor es...")
        });
        
        add(new JLabel("Número 1:")); add(cajaNum1);
        add(new JLabel("Número 2:")); add(cajaNum2);
        add(btnEvaluar); add(etiquetaResultado);
    }

    public static void main(String[] args) {
        new MayorDeDosVisual().setVisible(true);
    }
}
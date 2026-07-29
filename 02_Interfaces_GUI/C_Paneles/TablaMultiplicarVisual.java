/**
 * RETO DEL GIMNASIO DE CÓDIGO (GUI - Nivel 3)
 * Reto 8: Generador de Tablas de Multiplicar en JTextArea
 */


import javax.swing.*;
import java.awt.FlowLayout;


public class TablaMultiplicarVisual extends JFrame {
    JTextField cajaNumero;
    JButton btnGenerar;
    JTextArea areaResultados;

    public TablaMultiplicarVisual() {
        setTitle("Tablas Mágicas");
        setSize(250, 350);
        setLayout(new FlowLayout());
        
        cajaNumero = new JTextField(5);
        btnGenerar = new JButton("Generar");
        areaResultados = new JTextArea(10, 15); 
        areaResultados.setEditable(false);
        
        btnGenerar.addActionListener(e -> {
            areaResultados.setText(""); // Limpiar antes de generar
            
            // TODO 1: Obtener el número de cajaNumero
            // TODO 2: Crear un ciclo for del 1 al 10
            // TODO 3: Usar areaResultados.append( numero + " x " + i + " = ... \n" )
        });
        
        add(new JLabel("Tabla del:")); add(cajaNumero);
        add(btnGenerar); add(new JScrollPane(areaResultados));
    }

    public static void main(String[] args) {
        new TablaMultiplicarVisual().setVisible(true);
    }
}
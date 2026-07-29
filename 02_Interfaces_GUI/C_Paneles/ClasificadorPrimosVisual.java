/**
 * RETO DEL GIMNASIO DE CÓDIGO (GUI - Nivel 3)
 * Reto 9: Buscador de Números Primos del 1 al 100
 */

import javax.swing.*;
import java.awt.FlowLayout;


public class ClasificadorPrimosVisual extends JFrame {
    JButton btnBuscar;
    JTextArea areaResultados;

    public ClasificadorPrimosVisual() {
        setTitle("Buscador de Primos");
        setSize(300, 300);
        setLayout(new FlowLayout());
        
        btnBuscar = new JButton("Encontrar Primos (1-100)");
        areaResultados = new JTextArea(10, 20);
        areaResultados.setEditable(false);
        
        btnBuscar.addActionListener(e -> {
            areaResultados.setText("Primos encontrados:\n");
            
            // TODO: Crear ciclo for del 2 al 100
            // TODO: Validar si 'i' es primo
            // TODO: Si es primo, agregarlo al área de texto con areaResultados.append(i + ", ");
        });
        
        add(btnBuscar); add(new JScrollPane(areaResultados));
    }

    public static void main(String[] args) {
        new ClasificadorPrimosVisual().setVisible(true);
    }
}
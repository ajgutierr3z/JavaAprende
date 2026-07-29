/**
 * RETO DEL GIMNASIO DE CÓDIGO (GUI - Nivel 2)
 * Reto 6: Tienda de Balones (Cotizador visual)
 */

import javax.swing.*;
import java.awt.FlowLayout;


public class TiendaBalonesVisual extends JFrame {
    JTextField cajaCantidad;
    JButton btnCotizar;
    JLabel etiquetaTotal;

    public TiendaBalonesVisual() {
        setTitle("Cotizador de Balones");
        setSize(300, 150);
        setLayout(new FlowLayout());
        
        cajaCantidad = new JTextField(10);
        btnCotizar = new JButton("Calcular Total");
        etiquetaTotal = new JLabel("Total a pagar: $0");
        
        btnCotizar.addActionListener(e -> {
            // TODO 1: Extrae y convierte la cantidad de balones a int
            // TODO 2: Aplica la lógica: >15 ($85), 11-15 ($92), <=10 ($99)
            // TODO 3: Muestra el gran total en etiquetaTotal
        });
        
        add(new JLabel("¿Cuántos balones llevas?"));
        add(cajaCantidad); add(btnCotizar); add(etiquetaTotal);
    }

    public static void main(String[] args) {
        new TiendaBalonesVisual().setVisible(true);
    }
}
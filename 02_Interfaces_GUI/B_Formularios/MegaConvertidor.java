/**
 * Ejercicio (GUI - Nivel 2)
 * Reto 7: El Mega Convertidor Universal con JComboBox
 */

import javax.swing.*;
import java.awt.FlowLayout;


public class MegaConvertidor extends JFrame {
    JTextField cajaEntrada;
    JComboBox<String> menuConversiones;
    JButton btnConvertir;
    JLabel etiquetaResultado;

    public MegaConvertidor() {
        setTitle("Navaja Suiza: Convertidor");
        setSize(350, 200);
        setLayout(new FlowLayout());
        
        cajaEntrada = new JTextField(8);
        btnConvertir = new JButton("Convertir");
        etiquetaResultado = new JLabel("Resultado: ---");
        
        String[] opciones = { "Selecciona...", "Celsius a Fahrenheit", "Pies a Metros", "Galones a Litros" };
        menuConversiones = new JComboBox<>(opciones);
        
        btnConvertir.addActionListener(e -> {
            try {
                double valor = Double.parseDouble(cajaEntrada.getText());
                String seleccion = (String) menuConversiones.getSelectedItem();
                double resultadoFinal = 0.0;
                
                // TODO: Crea una estructura if/else o switch para evaluar 'seleccion' y calcular 'resultadoFinal'
                
                etiquetaResultado.setText("Resultado: " + resultadoFinal);
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Ingresa un número válido.");
            }
        });
        
        add(new JLabel("Valor:")); add(cajaEntrada);
        add(menuConversiones); add(btnConvertir); add(etiquetaResultado);
    }

    public static void main(String[] args) {
        new MegaConvertidor().setVisible(true);
    }
}
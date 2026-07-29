/**
 * RETO DEL GIMNASIO DE CÓDIGO (GUI - Nivel 2)
 * Reto 5: Validador Visual de Par o Impar
 */
import javax.swing.*;
import java.awt.FlowLayout;

public class ParImparVisual extends JFrame {
    JTextField cajaNumero;
    JButton btnValidar;
    JLabel etiquetaResultado;

    public ParImparVisual() {
        setTitle("Validador Numérico");
        setSize(250, 150);
        setLayout(new FlowLayout());
        
        cajaNumero = new JTextField(10);
        btnValidar = new JButton("Comprobar");
        etiquetaResultado = new JLabel("Esperando número...");
        
        btnValidar.addActionListener(e -> {
            // TODO 1: Obtener el texto de 'cajaNumero' y convertir a int
            // TODO 2: Usar un if/else y el operador módulo (%) para saber si es par
            // TODO 3: Mostrar el resultado en 'etiquetaResultado'
        });
        
        add(new JLabel("Ingresa un número:"));
        add(cajaNumero); add(btnValidar); add(etiquetaResultado);
    }

    public static void main(String[] args) {
        new ParImparVisual().setVisible(true);
    }
}
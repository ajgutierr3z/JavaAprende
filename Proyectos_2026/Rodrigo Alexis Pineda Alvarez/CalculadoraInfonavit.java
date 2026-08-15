import javax.swing.*;
import java.awt.FlowLayout;

public class CalculadoraInfonavit extends JFrame {
    JTextField cajaNombre;
    JTextField cajaEdad;
    JTextField cajaSalario;
    JComboBox<String> menuBimestres;
    JButton botonCalcular;
    JTextArea areaResultados;
    public CalculadoraInfonavit(){
        setTitle("Simulador De Puntaje Infonavit");
        setSize(380, 350);
        setLayout(new FlowLayout());
        cajaNombre = new JTextField(12);
        cajaEdad = new JTextField(5);
        cajaSalario = new JTextField(8);
        String[] opciones = {"Selecciona...", "1 a 4 bimestres", "5 a 8 bimestres", "9 o mas bimestres"};
        menuBimestres = new JComboBox<>(opciones);
        botonCalcular = new JButton("Calcular puntaje");
        areaResultados = new JTextArea(8,28);
        areaResultados.setEditable(false);
        botonCalcular.addActionListener(e -> {
            try {
                String nombre = cajaNombre.getText().trim();
                if (nombre.isEmpty()) {
                    JOptionPane.showMessageDialog(null,"Por favor ingresa tu nombre completo.");
                    return;
                }
                int edad = Integer.parseInt(cajaEdad.getText());
                double salario = Double.parseDouble(cajaSalario.getText());
                if (edad <= 0 || salario <= 0) {
                    JOptionPane.showMessageDialog(null,"La edad y el salario deben ser mayores a 0.");
                    return;
                }
                String seleccionBimestres = (String) menuBimestres.getSelectedItem();
                if (seleccionBimestres.equals("Selecciona...")) {
                    JOptionPane.showMessageDialog(null,"Selecciona los bimestres cotizados.");
                    return;
                }
                int puntosTotales = 0;
                if (edad >= 18 && edad <= 29) {
                    puntosTotales += 100;
                } else if (edad >= 30 && edad <= 49) {
                    puntosTotales += 120;
                } else if (edad >= 50) {
                    puntosTotales += 90;
                }
                if (salario >= 15000) {
                    puntosTotales += 500;
                } else if (salario >= 8000) {
                    puntosTotales += 400;
                } else {
                    puntosTotales += 300;
                }
                if (seleccionBimestres.equals("9 o mas bimestres")) {
                    puntosTotales += 500;
                } else if (seleccionBimestres.equals("5 a 8 bimestres")) {
                    puntosTotales += 350;
                } else if (seleccionBimestres.equals("1 a 4 bimestres")) {
                    puntosTotales += 200;
                }
                String diagnostico = "";
                if (puntosTotales >= 1080) {
                    diagnostico = "Hola " + nombre + ",\n¡ELEGIBLE PARA CRÉDITO!\n\n"
                                + "Tienes " + puntosTotales + " puntos de 1080 requeridos.\n"
                                + "Recomendación: Es un momento idóneo para iniciar tu solicitud. "
                                + "Mantén tu empleo actual para asegurar el trámite.";
                } else {
                    int faltantes = 1080 - puntosTotales;
                    diagnostico = "Hola " + nombre + ",\nPUNTAJE INSUFICIENTE\n\n"
                                + "Tienes " + puntosTotales + " puntos. Te faltan " + faltantes + " puntos.\n"
                                + "Recomendación: Sigue cotizando continuamente para alcanzar el "
                                + "puntaje mínimo de 1080.";
                }
                areaResultados.setText(diagnostico);
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null,"Por favor ingresa un valor numérico válido para edad y salario.");
            }
        });
        add(new JLabel("Nombre:"));
        add(cajaNombre);
        add(new JLabel("Edad:"));
        add(cajaEdad);
        add(new JLabel("Salario ($):"));
        add(cajaSalario);
        add(new JLabel("Cotización:"));
        add(menuBimestres);
        add(botonCalcular);
        add(new JScrollPane(areaResultados));
    }
    public static void main(String[] args) {
        new CalculadoraInfonavit().setVisible(true);
    }
}

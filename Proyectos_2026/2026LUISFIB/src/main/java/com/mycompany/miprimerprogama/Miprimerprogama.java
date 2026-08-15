/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.miprimerprogama;

import javax.swing.*;
import java.awt.FlowLayout;

public class Miprimerprogama extends JFrame {

    public Miprimerprogama() {
        // 1. Configuración del lienzo
        setTitle("Rescatemos el Planeta");
        setSize(500, 300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout()); // Organiza los elementos uno al lado del otro

        // 2. Creación de los componentes
        JLabel etiqueta = new JLabel("Ingresa la cantidad de plantas:");
        JTextField cajaTexto1 = new JTextField(5); // Espacio para 5 caracteres
	
        JLabel etiqueta2 = new JLabel("ingrese el nombre del voluntario");
        JTextField cajaTexto2 = new JTextField(10);
        
                
	
JButton boton = new JButton("5 plantas");
JButton boton2 = new JButton("10 plantas");
JButton boton3 = new JButton("20 plantas");
JButton boton4 = new JButton("25 plantas");
JButton boton5 = new JButton("50 plantas");

        // 3. El Evento (La acción al hacer clic)
        boton.addActionListener(e -> {

        // Capturamos el texto, lo convertimos a entero y lo mostramos
            String textoIngresado = cajaTexto1.getText();
            int cantidad = Integer.parseInt(textoIngresado);
            JOptionPane.showMessageDialog(null, "quedan:" + (cantidad - 5) + "plantas por salvar");
			
        });
		boton2.addActionListener(e -> {

        // Capturamos el texto, lo convertimos a entero y lo mostramos
            String textoIngresado = cajaTexto1.getText();
            int cantidad = Integer.parseInt(textoIngresado);
            JOptionPane.showMessageDialog(null, "quedan:" + (cantidad - 10) + "plantas por salvar");
			
        });
        boton3.addActionListener(e -> {

        // Capturamos el texto, lo convertimos a entero y lo mostramos
            String textoIngresado = cajaTexto1.getText();
            int cantidad = Integer.parseInt(textoIngresado);
            JOptionPane.showMessageDialog(null, "quedan:" + (cantidad - 20) + "plantas por salvar");
			
        });
		boton4.addActionListener(e -> {

        // Capturamos el texto, lo convertimos a entero y lo mostramos
            String textoIngresado = cajaTexto1.getText();
            int cantidad = Integer.parseInt(textoIngresado);
            JOptionPane.showMessageDialog(null, "quedan:" + (cantidad - 25) + "plantas por salvar");
			
        });
                boton5.addActionListener(e -> {

        // Capturamos el texto, lo convertimos a entero y lo mostramos
            String textoIngresado = cajaTexto1.getText();
            int cantidad = Integer.parseInt(textoIngresado);
            JOptionPane.showMessageDialog(null, "quedan:" + (cantidad - 50) + "plantas por salvar");
			
        });

        // 4. Agregar las piezas a la ventana
        add(etiqueta);
        add(cajaTexto1);
        add(boton);
		add(boton2);
		add(boton3);
		add(boton4);
    }

    public static void main(String[] args) {
        Miprimerprogama form = new Miprimerprogama();
        form.setVisible(true);
    }
}

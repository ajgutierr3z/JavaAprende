import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class ImprimeNumeros extends JFrame{
	JButton bImprimir, bSalir;
	JLabel ePrimer, eSalida;
	JTextField tNumero;
	public ImprimeNumeros (){
		ePrimer = new JLabel ("Escribe un Numero:");
		bImprimir = new JButton ("Imprimir");
		bSalir = new JButton ("Salir");
		eSalida = new JLabel ("Aquí imprimire la salida");
		tNumero = new JTextField(9);
		bImprimir.addActionListener(new ebImprimir());
		bSalir.addActionListener(new ebSalir());
		add(ePrimer);
		add(tNumero);
		add(bImprimir);
		add(bSalir);
		add(eSalida);
		setLayout(new FlowLayout());
		setSize(200,200);
		setVisible(true);
	}
	public static void main (String args []){
		ImprimeNumeros imprime = new ImprimeNumeros();
	}
	class ebImprimir implements ActionListener{
		public void actionPerformed(ActionEvent e){
			String valor = tNumero.getText();
			String v="";
			int valor1 = Integer.parseInt(valor);
			for (int i =0; i < valor1; i++){
				v = v +  String.valueOf(i);
				//v = String.valueOf(i);
				eSalida.setText(v);
			}
				//eSalida.setText(v);
		}
	}
	class ebSalir implements ActionListener{
		public void actionPerformed (ActionEvent e){
			int res = JOptionPane.showConfirmDialog(null,"¿Deseas salir?","Alerta",JOptionPane.YES_NO_OPTION);
			if(res == 0){
				System.exit(0);
			}
		}
	}
}

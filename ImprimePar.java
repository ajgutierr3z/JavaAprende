import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class ImprimePar extends JFrame {
	JButton bImprimir, bSalir;
	JLabel eImprimir, eTexto;
	JTextField tNumero;
	public ImprimePar (){
		eImprimir = new JLabel("Aquí ira el resultado");
		eTexto = new JLabel("Escribe un número:");
		tNumero = new JTextField(9);
		bImprimir = new JButton ("Calcular");
		bSalir = new JButton ("Salir");
		bImprimir.addActionListener(new ebImprimir());
		bSalir.addActionListener(new ebSalir());
		add(eTexto);
		add(tNumero);
		add(bImprimir);
		add(bSalir);
		add(eImprimir);
		setLayout(new FlowLayout());
		setSize(200,200);
		setVisible(true);
	}
	public static void main (String args []){
		ImprimePar imprime = new ImprimePar ();
	}
	class ebImprimir implements ActionListener{
		public void actionPerformed(ActionEvent e){
			String N = tNumero.getText();
			String gp="", gi="";
			int num = Integer.parseInt(N);
			int par = 0;
			for (int i=0; i<num; i++){
				par = i % 2;
				if (par == 0){
					gp = gp + String.valueOf(i);
				}else{
					gi = gi + String.valueOf(i);
				}
			}
			eImprimir.setText("Los pares son: "+gp+" Los impares son: "+gi);
		}
	}
	class ebSalir implements ActionListener{
		public void actionPerformed (ActionEvent e){
			int r = JOptionPane.showConfirmDialog(null,"¿Deseas salir?","Alerta",JOptionPane.YES_NO_OPTION);
			if (r == 0){
				System.exit(0);
			}
		}
	}
}

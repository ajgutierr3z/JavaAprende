import javax.swing.*;

public class Ventanas {



        public static void main(String[] args){

            String nombre;
            int edad;


            nombre= JOptionPane.showInputDialog("Digite su nombre por favor");
            edad=Integer.parseInt(JOptionPane.showInputDialog("Digite su edad:"));


            JOptionPane.showMessageDialog(null, "Bienvenido al sistema "+nombre);
            JOptionPane.showMessageDialog(null, "Su edad es: "+edad);
        }
}

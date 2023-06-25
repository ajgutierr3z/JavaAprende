import javax.swing.*;

public class Baseball{

    public static void main(String[] args){

        int cantidad=0;
        int costo=0;

        cantidad = Integer.parseInt(JOptionPane.showInputDialog("Ingese la cantidad a comprar:"));

        if(cantidad>=10){
            costo=100*cantidad;

            JOptionPane.showMessageDialog(null,"El monto de su compra es: "+costo);

        }
        else if (cantidad<10) {
            costo=108*cantidad;

            JOptionPane.showMessageDialog(null,"El monto d su compra es: "+costo);

        }


    }


}

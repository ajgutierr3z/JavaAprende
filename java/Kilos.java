import java.util.Scanner;

public class Kilos {


    public static void main (String[] args){
        Scanner entrada = new Scanner(System.in);

        float kilos =0f;
        float libras = 0f;

        System.out.println("Ingrese los kilos a convertir a libras: ");
        kilos = entrada.nextFloat();

        libras = (kilos*2.2f);

        System.out.println("\nLos kilos convertidos a libras son: "+libras+" libras");



    }


}

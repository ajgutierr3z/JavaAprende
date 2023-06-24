import java.util.Scanner;

public class Temperatura {

    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        float grados=0f;
        float fare=0f;


        System.out.println("Ingrese los grados a convertir a Fahrenheit: ");
        grados = entrada.nextFloat();

        fare=(grados*9/5)+32;

        System.out.println("\nLos grados ya convertidos son: "+fare+" Fahrenheit");


    }


}

import java.util.Scanner;

public class Pulgadas {

    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        float cms = 0f;
        float pulgadas = 0f;

        System.out.println("Ingrese los centimetros a converir: ");
        cms = entrada.nextFloat();

        pulgadas=(cms/2.54f);

        System.out.println("\nLos centimetros convertidos son: "+pulgadas+" Pulgadas");




  }



}

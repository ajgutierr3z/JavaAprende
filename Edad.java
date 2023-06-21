import java.util.Scanner;

public class Edad {




    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        int años;
        double meses=0f, dias=0f, semanas=0f, horas=0f, decadas=0f, lustro=0f, segundos=0f;


        System.out.println("Ingrese su edad: ");
        años = entrada.nextInt();

        decadas=años/10;
        lustro=años/5;
        meses = años*12;
        semanas = meses*4.34524;
        dias = semanas*7;
        horas = dias*24;
        segundos=horas*3600;

        System.out.println("\nUsted ha vivido: ");
        System.out.println(decadas+" Decadas");
        System.out.println(lustro+" Lustros");
        System.out.println(meses+" Meses");
        System.out.println(semanas+" Semanas");
        System.out.println(dias+" Dias");
        System.out.println(horas+" Horas");
        System.out.println(segundos+" Segundos");





    }
}

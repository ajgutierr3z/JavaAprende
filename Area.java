import java.util.Scanner;
public class Area{

    public static void main(String[] args){
        Scanner dato = new Scanner(System.in);
        final double pi=3.1416;
        double radio;
        double perimetro;
        double area;

         

        System.out.println("Ingrese el radio: ");
        radio= dato.nextDouble();

        area=radio*pi;
        perimetro=radio*(pi*2);

        System.out.println("El Area del Circulo es: "+area);
        System.out.println("El Perimetro del Circulo es: "+perimetro);





    }
}
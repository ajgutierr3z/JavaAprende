/**
 * EJERCICIO GUIADO 1 
 * Tema: Entrada de datos múltiples y jerarquía de operadores.
 */
import java.util.Scanner; 

public class CalculadoraPromedio {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in); 
        
        System.out.print("Ingrese calificación 1: ");
        double cal1 = entrada.nextDouble(); 
        
        System.out.print("Ingrese calificación 2: ");
        double cal2 = entrada.nextDouble();
        
        System.out.print("Ingrese calificación 3: ");
        double cal3 = entrada.nextDouble();
        
        System.out.print("Ingrese calificación 4: ");
        double cal4 = entrada.nextDouble();
        
        // El paréntesis obliga a sumar todo antes de dividir
        double promedio = (cal1 + cal2 + cal3 + cal4) / 4.0;
        
        System.out.println("El promedio exacto es: " + promedio);
    }
}
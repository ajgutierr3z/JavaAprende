/**
 * EJERCICIO GUIADO 2 
 * Tema: Estructuras condicionales (if / else if) y operadores relacionales.
 */
import java.util.Scanner;

public class TiendaBalones {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("¿Cuántos balones desea comprar?: ");
        int cantidad = entrada.nextInt();
        int precioUnitario = 0; 
        
        // Evaluamos las reglas de negocio
        if (cantidad > 15) {
            precioUnitario = 85;
        } else if (cantidad > 10 && cantidad <= 15) {
            precioUnitario = 92;
        } else {
            precioUnitario = 99;
        }
        
        int total = cantidad * precioUnitario;
        System.out.println("El costo total por " + cantidad + " balones es: $" + total);
    }
}
/**
 * EJERCICIO GUIADO 3 
 * Tema: Ciclos automatizados (Bucle for).
 */
import java.util.Scanner;

public class TablaMultiplicar {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Ingrese el número de la tabla que desea generar: ");
        int numero = entrada.nextInt();
        
        System.out.println("--- TABLA DEL " + numero + " ---");
        
        // Iniciamos en 1; repetimos mientras sea menor o igual a 10; aumentamos de 1 en 1
        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }
    }
}
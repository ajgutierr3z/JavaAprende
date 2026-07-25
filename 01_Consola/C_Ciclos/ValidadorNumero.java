/**
 * Reto 12: Análisis de un número (Par, Impar y Primo)
 * Descripción: Solicitar un número al usuario y determinar si es par o impar, 
 * y además evaluar si es un número primo.
 */
import java.util.Scanner;

public class ValidadorNumero {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        // TODO: Solicitar un número entero al usuario
        
        // 1. EVALUAR PAR O IMPAR
        // TODO: Usar if/else con el operador módulo (numero % 2 == 0) para imprimir si es par o impar.
        
        // 2. EVALUAR SI ES PRIMO
        // TODO: Crear una variable booleana (ej. esPrimo = true)
        // TODO: Validar que el número sea mayor a 1 (el 1 no es primo)
        // TODO: Crear un ciclo for desde 2 hasta (numero - 1) para buscar divisores
        // Tip: Si (numero % i == 0), entonces esPrimo cambia a false y puedes romper el ciclo (break).
        
        // TODO: Imprimir "Es un número primo" o "No es un número primo" según la bandera.
    }
}
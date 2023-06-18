import java.util.Scanner;

public class DatoTeclado {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese su nombre
        System.out.print("Ingrese su nombre: ");
        String nombre = scanner.nextLine();

        // Solicitar al usuario que ingrese su edad
        System.out.print("Ingrese su edad: ");
        int edad = scanner.nextInt();

        // Solicitar al usuario que ingrese un número decimal
        System.out.print("Ingrese un número decimal: ");
        double numeroDecimal = scanner.nextDouble();

        // Imprimir los datos ingresados por el usuario
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Número decimal: " + numeroDecimal);

        // Cerrar el objeto Scanner
        scanner.close();
    }
}

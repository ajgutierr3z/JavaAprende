/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.brianeduardolopezvega;

/**
 *
 * @author brian
 */
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author brian
 */
public class BrianEduardoLopezVega {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("========================================");
        System.out.println("Control de desperdicio de alimentos");
        System.out.println("========================================");
        
        char opcion = 0;
        ArrayList<String> alimentos = new ArrayList<>();
        ArrayList<Integer> cantidades = new ArrayList<>();
        ArrayList<String> listaDesperdiciados = new ArrayList<>();
        ArrayList<Boolean> desperdiciados = new ArrayList<>();




        while (opcion != '6') { 
            
            System.out.println("1. Registrar alimento");
            System.out.println("2. Mostrar inventario");
            System.out.println("3. Buscar alimentos");
            System.out.println("4. Registrar desperdicio");
            System.out.println("5. Estadisticas");
            System.out.println("6. Salir");

            System.out.println("");
            System.out.println("Ingrese su opcion");
            opcion = teclado.next().charAt(0);

            switch (opcion) {
                case '1': //Registrar

                System.out.println("Ingrese el nuevo alimento a ingresar: ");
                teclado.nextLine();
                String alim = teclado.nextLine();

                System.out.println("Cantidad");
                int cantidad = teclado.nextInt();

                alimentos.add(alim);
                cantidades.add(cantidad);
                desperdiciados.add(false);

                System.out.println("\nAlimento registrado.");
                    break;
                case '2': //Mostrar

                System.out.println("==========Inventario total==========");

                if (alimentos.isEmpty()) {
                    System.out.println("No hay alimentos registrados.");
                } else{

                    for (int i = 0; i < alimentos.size(); i++) {
                        
                        System.out.println("\nAlimento #" + (i + 1));
                        System.out.println("Nombre: " + alimentos.get(i));
                        System.out.println("Cantidad: " + cantidades.get(i));
                        
                        if (desperdiciados.get(i)) {
                                System.out.println("Estado: Desperdiciado");
                        } else {
                                System.out.println("Estado: Disponible");
                        }

                    }

                }

                    break;
                case '3': //Buscar

                System.out.println("========Buscar alimento======");

                System.out.println("Ingrese el nombre del alimento:");
                teclado.nextLine();
                String buscar = teclado.nextLine();

                boolean encontrado = false;

                for (int i = 0; i < alimentos.size(); i++) {

                    if (alimentos.get(i).equalsIgnoreCase(buscar)) {

                        System.out.println("\nAlimento encontrado:");
                        System.out.println("Nombre: " + alimentos.get(i));
                        System.out.println("Cantidad: " + cantidades.get(i));

                        if (desperdiciados.get(i)) {
                            System.out.println("Estado: Desperdiciado");
                        } else {
                            System.out.println("Estado: Disponible");
                        }

                        encontrado = true;
                    }
                }

                if (!encontrado) {
                    System.out.println("\nEl alimento no fue encontrado.");
                }
                    
                break;
                case '4': //registrar desperdicios

                System.out.println("\n===== REGISTRAR DESPERDICIO =====");

                System.out.println("Ingrese el nombre del alimento desperdiciado:");
                teclado.nextLine();
                String desperdicio = teclado.nextLine();

                listaDesperdiciados.add(desperdicio);

                System.out.println("\nEl alimento "
                        + desperdicio
                        + " fue registrado como desperdiciado.");

                    break;
                case '5': //estadisticas

                System.out.println("\n===== ESTADISTICAS =====");

                int totalAlimentos = alimentos.size();
                int totalDesperdiciados = listaDesperdiciados.size();

                System.out.println("Total de alimentos registrados: "
                        + totalAlimentos);

                System.out.println("Total de alimentos desperdiciados: "
                        + totalDesperdiciados);

                if (totalAlimentos > 0) {

                    double porcentaje =
                            ((double) totalDesperdiciados / totalAlimentos) * 100;

                    System.out.println("Porcentaje de desperdicio: "
                            + porcentaje + "%");

                    if (porcentaje >= 30) {

                        System.out.println(
                                "ADVERTENCIA: El desperdicio de alimentos es elevado."
                        );

                    } else {

                        System.out.println(
                                "El nivel de desperdicio se encuentra controlado."
                        );
                    }

                } else {

                    System.out.println(
                            "No hay suficientes datos para calcular estadisticas."
                    );
                }

                    break;
                    
            }




        }
        
        
        
    }
    
}

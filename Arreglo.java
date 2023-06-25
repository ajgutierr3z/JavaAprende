import java.util.Scanner;

public class Arreglo {

    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        int elementos;
        int mayor=0;

        System.out.println("Ingrese la cantidad de elementos en su arreglo: ");
        elementos=entrada.nextInt();

        int [] numeros = new int[elementos];


        System.out.println("Ingrese los elementos: ");
        for(int i = 0; i<elementos;i++){
            System.out.println("\nElemento  No. "+(i+1)+" de su arreglo");
            numeros[i]=entrada.nextInt();

            if(numeros[i]>mayor){
                mayor=numeros[i];

            }


        }
        System.out.println("El numero mayor de su arreglo es: "+mayor);

    }
}

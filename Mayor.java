import java.util.Scanner;

public class Mayor {

    public static void main(String [] args){

        int num1,num2;

        Scanner entrada = new Scanner(System.in);


        System.out.print("Digite 2 numeros enteros por favor: ");
        num1= entrada.nextInt();
        num2= entrada.nextInt();


        if(num1>num2){
            System.out.println("El numero mayor es el: "+num1);
        } else if (num1==num2) {
            System.out.println("Los Numeros tecleados son iguales");

        } else {
            System.out.println("El numero mayor es el: "+num2);
        }

    }



}

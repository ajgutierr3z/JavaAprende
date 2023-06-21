import java.util.Scanner;

public class Horas {


    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        int HoraActual=0, cantidad=0,HoraSiguiente=0;



        System.out.println("Introduzca la Hora Actual: ");
        HoraActual=entrada.nextInt();



        System.out.println("Introduzca las Horas que desea agregar: ");
        cantidad=entrada.nextInt();

        HoraSiguiente=(HoraActual+cantidad)%12;
        if(HoraSiguiente>12 && HoraSiguiente<24) {
            System.out.println("\nDentro de " + cantidad + " Horas Seran las: " + HoraSiguiente + " De la noche");

        } else if (HoraSiguiente < 24 && HoraSiguiente < 5) {
            System.out.println("\nDentro de " + cantidad + " Horas Seran las: " + HoraSiguiente + " De la madrugada");

        }

        else{
            System.out.println("\nDentro de " + cantidad + " Horas Seran las: " + HoraSiguiente + " De la noche");
        }


    }

}


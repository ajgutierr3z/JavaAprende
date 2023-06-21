import java.util.Scanner;

public class Calificaciones {


    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        float materias;
        float calificaciones=0f;
        float promedio=0f;

        System.out.println("Ingrese ciuantas materias desea calificar: ");
        materias=entrada.nextFloat();

        for(int i=1; i<=materias;i++){
            System.out.println("Ingrese la calificacion de la materia No.-"+i );
            calificaciones=entrada.nextFloat();

            promedio+=(calificaciones)/materias;





        }


        System.out.println("El promedio general del Alumno es: "+promedio);



    }
}

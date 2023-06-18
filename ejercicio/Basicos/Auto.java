// Clase base (superclase)
class Vehiculo {
    protected String marca;

    public void conducir() {
        System.out.println("Conduciendo un vehículo...");
    }
}

// Clase derivada (subclase)
class Automovil extends Vehiculo {
    private int numPuertas;

    public void abrirPuertas() {
        System.out.println("Abriendo las puertas del automóvil...");
    }
}

// Clase principal
public class Auto {
    public static void main(String[] args) {
        Automovil miAuto = new Automovil();
        miAuto.marca = "Toyota";
        miAuto.conducir();
        miAuto.abrirPuertas();
    }
}

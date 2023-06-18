// Clase base (superclase)
class Figura {
    public double calcularArea() {
        return 0.0;
    }
}

// Clase derivada Cuadrado
class Cuadrado extends Figura {
    private double lado;

    public Cuadrado(double lado) {
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        return lado * lado;
    }
}

// Clase derivada Círculo
class Circulo extends Figura {
    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * radio * radio;
    }
}

// Clase principal
public class PolimorfismoArea {
    public static void main(String[] args) {
        Figura cuadrado = new Cuadrado(5.0); // Crear un objeto Cuadrado
        Figura circulo = new Circulo(3.0);   // Crear un objeto Círculo

        // Calcular y mostrar el área del cuadrado
        System.out.println("Área del cuadrado: " + cuadrado.calcularArea());

        // Calcular y mostrar el área del círculo
        System.out.println("Área del círculo: " + circulo.calcularArea());
    }
}
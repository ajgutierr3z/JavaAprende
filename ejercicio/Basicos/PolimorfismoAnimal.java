// Clase base (superclase)
class Animal {
    public void hacerSonido() {
        System.out.println("El animal hace un sonido.");
    }
}

// Clases derivadas (subclases)
class Perro extends Animal {
    public void hacerSonido() {
        System.out.println("El perro ladra.");
    }
}

class Gato extends Animal {
    public void hacerSonido() {
        System.out.println("El gato maulla.");
    }
}

// Clase principal
public class PolimorfismoAnimal {
    public static void main(String[] args) {
        Animal animal1 = new Perro(); // Crear un objeto Perro y asignarlo a una referencia Animal
        Animal animal2 = new Gato();  // Crear un objeto Gato y asignarlo a una referencia Animal

        animal1.hacerSonido(); // Llamar al método hacerSonido() del objeto Perro
        animal2.hacerSonido(); // Llamar al método hacerSonido() del objeto Gato
    }
}
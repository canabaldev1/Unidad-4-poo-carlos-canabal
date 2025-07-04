package Taller3.Ejercicios;

/**
 *
 * @author lm-carlos
 */
public class IntegradorTaller3 {

    public static void main() {

        Coche c1 = new Coche("Toyota", "Corolla");
        Coche c2 = new Coche("Honda", "Civic");
        Coche c3 = new Coche("Ford", "Focus");

        Coche.mostrarCantidadDeCoches();

        System.out.println("Suma: " + Matematicas.sumar(10, 5));
        System.out.println("Resta: " + Matematicas.restar(10, 5));
        System.out.println("Multiplicación: " + Matematicas.multiplicar(10, 5));
        System.out.println("División: " + Matematicas.dividir(10, 5));
        
    }
}

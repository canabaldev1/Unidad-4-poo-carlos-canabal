package Taller3.Ejercicios;

/**
 *
 * @author lm-carlos
 */
public class Coche {

    private String marca;
    private String modelo;

    private static int contadorCoches = 0;

    // Constructor
    public Coche(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
        contadorCoches++; // Incrementa el contador cada vez que se crea un coche
    }

    // Método para mostrar cuántos coches hay
    public static void mostrarCantidadDeCoches() {
        System.out.println("Cantidad de coches creados: " + contadorCoches);
    }
}

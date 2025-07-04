package Taller3.Ejemplos;

/**
 *
 * @author lm-carlos
 */
public class Contador {

    static int contadorGlobal = 0;

    public Contador() {
        contadorGlobal++; // Incrementa el contador global cada vez que se crea un objeto
    }

    public static void mostrarContador() {
        System.out.println("Contador global: " + contadorGlobal);
    }
}

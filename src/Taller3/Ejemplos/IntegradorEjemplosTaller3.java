package Taller3.Ejemplos;

/**
 *
 * @author lm-carlos
 */
public class IntegradorEjemplosTaller3 {

    public static void main() {
        Contador c1 = new Contador();
        Contador c2 = new Contador();
        Contador c3 = new Contador();
// Se accede al método estático usando el nombre de la clase
        Contador.mostrarContador(); // Muestra: Contador global: 3

    }
}

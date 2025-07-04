package Taller3.Ejercicios;

/**
 *
 * @author lm-carlos
 */
public class Matematicas {

    public static int sumar(int a, int b) {
        return a + b;
    }

    public static int restar(int a, int b) {
        return a - b;
    }

    public static int multiplicar(int a, int b) {
        return a * b;
    }

    public static double dividir(double a, double b) {
        if (b != 0) {
            return a / b;
        } else {
            System.out.println("Error: División por cero.");
            return Double.NaN;
        }
    }
}

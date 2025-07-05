package Taller7.Ejercicios.Ejercicio3;

/**
 *
 * @author lm-carlos
 */
public class Utilidades {

    public static double sumar(double a, double b) {
        return a + b;
    }

    public static double restar(double a, double b) {
        return a - b;
    }

    public static double multiplicar(double a, double b) {
        return a * b;
    }

    public static double dividir(double a, double b) {
        if (b == 0) {
            System.out.println("No se puede dividir entre cero");
            return Double.NaN; 
        }
        return a / b;
    }
}

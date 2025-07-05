package Taller7.Ejercicios.Pruebas;

import Taller7.Ejercicios.Ejercicio3.Utilidades;

/**
 *
 * @author lm-carlos
 */
public class PruebaEjercicio3 {

    public static void main(String[] args) {
        double a = 12;
        double b = 4;

        System.out.println("Suma: " + Utilidades.sumar(a, b));
        System.out.println("Resta: " + Utilidades.restar(a, b));
        System.out.println("Multiplicación: " + Utilidades.multiplicar(a, b));
        System.out.println("División: " + Utilidades.dividir(a, b));

    }
}

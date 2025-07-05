package Taller7.Ejercicios.Pruebas;

import Taller7.Ejercicios.Ejercicio2.CuentaBancaria;

/**
 *
 * @author lm-carlos
 */
public class PruebaEjercicio2 {

    public static void main(String[] args) {
        CuentaBancaria c1 = new CuentaBancaria("123456", 5000, "Corriente");

        try {
            System.out.println(c1.numeroCuenta);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("No se puede acceder directamente al atributo numeroCuenta");
        }
    }

}

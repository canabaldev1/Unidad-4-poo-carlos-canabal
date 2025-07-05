package Taller7.Ejercicios.Pruebas;

import Taller7.Ejercicios.Ejercicio1.Empleado;

/**
 *
 * @author lm-carlos
 */
public class PruebaEjercicio1 {

    public static void main(String[] args) {
        Empleado e1 = new Empleado("Carlos", 1000000);

        System.out.println(e1.nombre);
        try {
            System.out.println(e1.salario);

        } catch (Exception e) {
            System.out.println("No se puede acceder a salario");
        }
        
        System.out.println(e1.getSalario());
        
        e1.setSalario(5000000);
        
        System.out.println(e1.getSalario());
        

    }
}

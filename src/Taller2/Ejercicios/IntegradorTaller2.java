package Taller2.Ejercicios;

import java.util.Scanner;

/**
 *
 * @author lm-carlos
 */
public class IntegradorTaller2 {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        
        // PRODUCTO
        
        System.out.println("ingresar nombre del producto 1");
        String nombreProducto1 = keyboard.nextLine();

        System.out.println("ingresar precio del producto 1");
        int precioProducto1 = keyboard.nextInt();
        keyboard.nextLine();

        Producto producto1 = new Producto(nombreProducto1, precioProducto1);
        System.out.println(producto1);
        
        // ESTUDIANTE
        
        System.out.println("ingresar nombre del estudiante 1");
        String nombreEstudiante1 = keyboard.nextLine();

        System.out.println("ingresar edad del estudiante 1");
        int edadEstudiante1 = keyboard.nextInt();
        keyboard.nextLine();

        Estudiante estudiante1 = new Estudiante(nombreEstudiante1, edadEstudiante1);
        System.out.println(estudiante1);
        
        try {
            Estudiante.MetodoConError();
        } catch (Exception e) {
            System.out.println("Error del método");
        }
        
        estudiante1.MetodoConErrorCorregido();
    }
}

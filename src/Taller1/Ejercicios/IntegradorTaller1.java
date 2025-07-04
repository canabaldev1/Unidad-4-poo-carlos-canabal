package Taller1.Ejercicios;

import java.util.Scanner;

/**
 *
 * @author lm-carlos
 */
public class IntegradorTaller1 {

    public static void main() {

        Scanner keyboard = new Scanner(System.in);

        // CREAR LIBROS
        Libro libro1 = new Libro();
        System.out.println(libro1);

        System.out.println("ingresar titulo del libro 2");
        String tituloLibro1 = keyboard.nextLine();

        System.out.println("ingresar autor del libro 2");
        String autorLibro1 = keyboard.nextLine();

        System.out.println("ingresar numero de paginas del libro 2");
        int numeroPaginaLibro1 = keyboard.nextInt();
        keyboard.nextLine();

        Libro libro2 = new Libro(tituloLibro1, autorLibro1, numeroPaginaLibro1);
        System.out.println(libro2);

        // CREAR CUENTAS BANCARIAS
        CuentaBancaria cuenta1 = new CuentaBancaria();
        System.out.println(cuenta1);

        System.out.println("ingresar numero de la cuenta 2");
        String numeroCuenta2 = keyboard.nextLine();

        System.out.println("ingresar tipo de la cuenta 2");
        String tipoCuenta2 = keyboard.nextLine();

        CuentaBancaria cuenta2 = new CuentaBancaria(numeroCuenta2, tipoCuenta2);
        System.out.println(cuenta2);

        System.out.println("ingresar numero de la cuenta 3");
        String numeroCuenta3 = keyboard.nextLine();

        System.out.println("ingresar tipo de la cuenta 3");
        String tipoCuenta3 = keyboard.nextLine();

        System.out.println("ingresar saldo de la cuenta 3");
        Long saldoCuenta3 = keyboard.nextLong();
        keyboard.nextLine();

        CuentaBancaria cuenta3 = new CuentaBancaria(numeroCuenta3, tipoCuenta3, saldoCuenta3);
        System.out.println(cuenta3);

        // CREAR ESTUDIANTES
        Estudiante estudiante1 = new Estudiante();
        System.out.println(estudiante1);

        System.out.println("ingresar nombre de estudiante 2");
        String nombreEstudiante2 = keyboard.nextLine();

        System.out.println("ingresar edad de estudiante 2");
        int edadEstudiante2 = keyboard.nextInt();
        keyboard.nextLine();

        Estudiante estudiante2 = new Estudiante(nombreEstudiante2, edadEstudiante2);
        System.out.println(estudiante2);

        System.out.println("ingresar nombre de estudiante 3");
        String nombreEstudiante3 = keyboard.nextLine();

        System.out.println("ingresar edad de estudiante 3");
        int edadEstudiante3 = keyboard.nextInt();
        keyboard.nextLine();

        System.out.println("ingresar curso de estudiante 3");
        String cursoEstudiante3 = keyboard.nextLine();

        Estudiante estudiante3 = new Estudiante(nombreEstudiante3, edadEstudiante3, cursoEstudiante3);
        System.out.println(estudiante3);

    }

}

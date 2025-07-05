package Taller14.Ejercicios;

/**
 *
 * @author lm-carlos
 */
public class PruebaTaller14 {

    public static void main(String[] args) {

        // EJERCICIO 1
        Figura c1 = new Circulo(5);
        Figura r1 = new Rectangulo(7, 10);

        c1.calcularArea();
        r1.calcularArea();

        // EJERCICIO 2
        Persona p1 = new Persona();
        Persona p2 = new Estudiante();
        Persona p3 = new Profesor();

        p1.presentarse();
        p2.presentarse();
        p3.presentarse();

        // EJERCICIO 3
        try {
            p3.motivar();

        } catch (Exception e) {
            System.out.println(e.getMessage());

            System.out.println("El metodo motivar está definido en Profesor, pero no en persona.\nPor tanto no se encuentra");
        }

        Persona p4 = new Civil();

        p4.presentarse();

        System.out.println("Es una mala práctica porque si se modifica\nel metodo de la clase base, tambien habría que modificar\nla clase derivada, y si se olvida se generan errores");

        // EJERCICIO 4
        Vehiculo v1 = new Vehiculo();
        Vehiculo v2 = new Coche();
        Vehiculo v3 = new Bicicleta();

        v1.mover();
        v2.mover();
        v3.mover();

    }

}

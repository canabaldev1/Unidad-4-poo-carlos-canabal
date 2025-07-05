package Taller14.Ejemplos;

/**
 *
 * @author lm-carlos
 */
public class PruebaEjemplosTaller14 {

    public static void main(String[] args) {
        Empleado empleado1 = new Gerente();
        Empleado empleado2 = new Ingeniero();
        empleado1.trabajar();
        empleado2.trabajar();

        Animal miAnimal = new Perro();
        miAnimal.correr();
    }

}

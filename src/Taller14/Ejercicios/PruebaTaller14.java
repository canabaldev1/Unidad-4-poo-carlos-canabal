package Taller14.Ejercicios;

/**
 *
 * @author lm-carlos
 */
public class PruebaTaller14 {

    public static void main(String[] args) {

        Figura c1 = new Circulo(5);
        Figura r1 = new Rectangulo(7, 10);

        c1.calcularArea();
        r1.calcularArea();

        Persona p1 = new Persona();
        Persona p2 = new Estudiante();
        Persona p3 = new Profesor();
        
        p1.presentarse();
        p2.presentarse();
        p3.presentarse();
    }

}

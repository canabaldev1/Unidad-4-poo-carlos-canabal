package Taller13.Ejercicios;

/**
 *
 * @author lm-carlos
 */
public class PruebaTaller13 {

    public static void main(String[] args) {
        Rectangulo r1 = new Rectangulo(5, 2);
        Triangulo t1 = new Triangulo(5, 2);

        System.out.println("Area del rectangulo: " + r1.calcularArea());
        System.out.println("Area del triangulo: " + t1.calcularArea());

        Pato p1 = new Pato();

        p1.nadar();
        p1.volar();

    }
}

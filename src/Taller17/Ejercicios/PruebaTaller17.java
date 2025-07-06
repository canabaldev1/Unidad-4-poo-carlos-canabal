package Taller17.Ejercicios;

/**
 *
 * @author lm-carlos
 */
public class PruebaTaller17 {

    public static void main(String[] args) {
        Figura f1 = new Circulo(5);
        Figura f2 = new Rectangulo(8, 8);

        System.out.println(f1.calcularArea());
        System.out.println(f2.calcularArea());

    }
}

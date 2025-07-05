package Taller14.Ejercicios;

/**
 *
 * @author lm-carlos
 */
public class Rectangulo extends Figura {

    double alto;
    double ancho;

    public Rectangulo(double alto, double ancho) {
        this.alto = alto;
        this.ancho = ancho;
    }

    @Override
    public void calcularArea() {
        double area = alto * ancho;
        System.out.println("El area es: " + area);
    }
}

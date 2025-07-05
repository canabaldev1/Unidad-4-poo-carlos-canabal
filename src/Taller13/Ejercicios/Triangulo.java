package Taller13.Ejercicios;

/**
 *
 * @author lm-carlos
 */
public class Triangulo extends Figura {

    double alto;
    double ancho;

    public Triangulo(double alto, double ancho) {
        this.alto = alto;
        this.ancho = ancho;
    }

    @Override
    public double calcularArea() {
        return alto * ancho / 2;
    }
}

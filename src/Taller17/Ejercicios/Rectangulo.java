package Taller17.Ejercicios;

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
    public double calcularArea() {
        return alto * ancho;
    }
}

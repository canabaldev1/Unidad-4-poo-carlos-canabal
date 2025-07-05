package Taller14.Ejercicios;

/**
 *
 * @author lm-carlos
 */
public class Circulo extends Figura {

    double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    @Override
    public void calcularArea() {
        double area = Math.PI * radio * radio;
        System.out.println("El area es: " + area);
    }
}

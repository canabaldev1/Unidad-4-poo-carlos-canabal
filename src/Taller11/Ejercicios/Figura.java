package Taller11.Ejercicios;

/**
 *
 * @author lm-carlos
 */
public abstract class Figura {

    public abstract double calcularArea();

    public void mostrarArea() {
        System.out.println("Área: " + calcularArea());
    }
}

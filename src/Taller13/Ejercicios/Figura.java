package Taller13.Ejercicios;

/**
 *
 * @author lm-carlos
 */
public abstract class Figura {

    public abstract double calcularArea();

    public void mostrar() {
        System.out.println("Soy una figura");
        System.out.println("Si es posible definir un metodo predeterminado en una clase absrtracta");
    }
}

package Taller12.Ejercicios;

/**
 *
 * @author lm-carlos
 */
public class Persona implements Hablador, Trabajador {

    @Override
    public void hablar() {
        System.out.println("La persona habla");
    }

    @Override
    public void trabajar() {
        System.out.println("La persona trabaja");
    }
}

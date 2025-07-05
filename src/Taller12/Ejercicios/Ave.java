package Taller12.Ejercicios;

/**
 *
 * @author lm-carlos
 */
public class Ave implements Volador, Cantante {

    @Override
    public void cantar() {
        System.out.println("El ave canta");
    }

    @Override
    public void volar() {
        System.out.println("El ave vuela");
    }
}

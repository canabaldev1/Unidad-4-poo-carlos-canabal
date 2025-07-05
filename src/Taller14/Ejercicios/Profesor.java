package Taller14.Ejercicios;

/**
 *
 * @author lm-carlos
 */
public class Profesor extends Persona {

    @Override
    public void presentarse() {
        System.out.println("Hola, soy un profesor");
    }

    public void motivar() {
        System.out.println("Eso está papaya");
    }
}

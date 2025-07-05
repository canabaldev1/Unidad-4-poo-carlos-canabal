package Taller12.Ejercicios;

/**
 *
 * @author lm-carlos
 */
public class Pez implements Nadador, Respirador {

    @Override
    public void nadar() {
        System.out.println("El pez nada en el agua");
    }

    @Override
    public void respirar() {
        System.out.println("El pez respira bajo el agua");
    }

}

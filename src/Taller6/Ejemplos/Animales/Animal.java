package Taller6.Ejemplos.Animales;

/**
 *
 * @author lm-carlos
 */
public class Animal {

    protected String especie;

    public Animal(String especie) {
        this.especie = especie;
    }

    protected void emitirSonido() {
        System.out.println("El animal hace un sonido.");
    }

}

package Taller8.Ejemplos;

/**
 *
 * @author lm-carlos
 */
public class Perro extends Animal {

    public Perro(String raza) {
        // super(especie);
        System.out.println("Raza: "+raza);
    }

    public void ladrar() {
        System.out.println("El perro ladra.");
    }

    @Override
    public void emitirSonido() {
        System.out.println("El perro ladra.");
    }

}

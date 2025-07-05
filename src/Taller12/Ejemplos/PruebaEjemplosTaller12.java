package Taller12.Ejemplos;

/**
 *
 * @author lm-carlos
 */
public class PruebaEjemplosTaller12 {

    public static void main(String[] args) {
        Pato pato = new Pato();
        pato.nadar();
        pato.volar();

        Robot robot = new Robot();
        robot.caminar();
        robot.hablar();

        Coche coche = new Coche();
        coche.encender();
        coche.acelerar();
    }
}

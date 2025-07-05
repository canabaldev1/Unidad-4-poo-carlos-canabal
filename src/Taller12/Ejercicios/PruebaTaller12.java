package Taller12.Ejercicios;

/**
 *
 * @author lm-carlos
 */
public class PruebaTaller12 {

    public static void main(String[] args) {
        Ave a1 = new Ave();

        a1.cantar();
        a1.volar();

        Pez p1 = new Pez();

        p1.nadar();
        p1.respirar();

        Persona per1 = new Persona();
        per1.hablar();
        per1.trabajar();
    }
}

package Taller5.Ejercicios.Ejercicio3;

/**
 *
 * @author lm-carlos
 */
public class PruebaPersona {

    public static void main(String[] args) {
        Persona p = new Persona("Carlos", 32);

        try {
            System.out.println(p.nombre);

        } catch (Exception e) {
            System.out.println("No se puede acceder a nombre directamente");
        }

        System.out.println(p.edad);

        System.out.println(p.getNombre());

    }
}

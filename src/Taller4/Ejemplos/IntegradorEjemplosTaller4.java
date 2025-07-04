package Taller4.Ejemplos;

/**
 *
 * @author lm-carlos
 */
public class IntegradorEjemplosTaller4 {

    public static void main() {
        Persona p = new Persona("Juan", 20);
        try {
            System.out.println(p.nombre);

        } catch (Exception e) {
            System.out.println("No se puede accedor al atributo nombre directamente");
            
        }
    }
}

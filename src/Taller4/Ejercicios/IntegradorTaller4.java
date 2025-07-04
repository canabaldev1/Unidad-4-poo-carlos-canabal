package Taller4.Ejercicios;

/**
 *
 * @author lm-carlos
 */
public class IntegradorTaller4 {
    public static void main() {
                Estudiante est = new Estudiante();

        est.setNombre("Laura");
        est.setEdad(20);
        est.setNotaPromedio(4.5);

        System.out.println("Nombre: " + est.getNombre());
        System.out.println("Edad: " + est.getEdad());
        System.out.println("Nota promedio: " + est.getNotaPromedio());

        // Prueba con datos inválidos
        est.setNombre("");
        est.setEdad(-1);
        est.setNotaPromedio(6.0);
    }
}

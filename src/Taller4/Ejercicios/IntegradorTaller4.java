package Taller4.Ejercicios;

/**
 *
 * @author lm-carlos
 */
public class IntegradorTaller4 {

    public static void main() {

        //ESTUDIANTE
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

        //COCHE
        Coche carro1 = new Coche("Mazda", "3", 180);

        System.out.println("Velocidad máxima: " + carro1.getVelocidadMaxima());

        try {
            carro1.velocidadMaxima = 200;

        } catch (Exception e) {
            System.out.println("No se puede cambiar velocidad directamente.");
        }

        carro1.acelerar(20);
        carro1.acelerar(-10); // No se puede utilizar aceleración negativa.

        System.out.println("Velocidad máxima: " + carro1.getVelocidadMaxima());

    }
}

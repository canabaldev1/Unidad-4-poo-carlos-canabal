package Taller10.Ejercicios;

/**
 *
 * @author lm-carlos
 */
public class PruebaTaller10 {

    public static void main(String[] args) {

        Persona persona = new Persona();
        Estudiante estudiante = new Estudiante();
        Profesor profesor = new Profesor();

        persona.presentarse();
        estudiante.presentarse();
        profesor.presentarse();

        Vehiculo vehiculo = new Vehiculo();
        Bicicleta bici = new Bicicleta();

        vehiculo.moverse();
        bici.moverse();

    }
}

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
        estudiante.presentarse("Juan");
        System.out.println("Cambié la firma y no avisó, asi que no es una sobreescritura verdaderamente.\nEn realidad ahora hay 2 metodos llamados igual pero que cambian según los argumentos");
        profesor.presentarse();

        Vehiculo vehiculo = new Vehiculo();
        Bicicleta bici = new Bicicleta();

        vehiculo.moverse();
        bici.moverse();

    }
}

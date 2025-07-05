package Taller8.Ejercicios;

/**
 *
 * @author lm-carlos
 */
public class Estudiante extends Persona {

    private String matricula;

    public Estudiante(String nombre, int edad, String matricula) {
        super(nombre, edad);
        this.matricula = matricula;
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Matricula: " + matricula);
    }
}

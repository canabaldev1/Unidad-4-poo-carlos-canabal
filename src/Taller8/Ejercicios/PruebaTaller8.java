package Taller8.Ejercicios;

/**
 *
 * @author lm-carlos
 */
public class PruebaTaller8 {

    public static void main(String[] args) {
        Coche coche = new Coche("Toyota Hilux", 220, 4);
        coche.mostrarInformacion();

        Estudiante estudiante = new Estudiante("Carlos", 32, "tercer semestre");

        estudiante.mostrarInformacion();

        Gerente gerente = new Gerente("Matias", 9, "administrativo");

        gerente.mostrarDetalles();

    }
}

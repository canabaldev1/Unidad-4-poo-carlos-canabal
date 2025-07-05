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

        try {
            Practicante pr1 = new Practicante("Pedro", 20, "Final");

        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("No se puede instanciar un objeto ya que la clase de no puede heredar de 2 clases");
        }
    }
}

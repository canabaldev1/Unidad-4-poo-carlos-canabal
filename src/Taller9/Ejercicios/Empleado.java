package Taller9.Ejercicios;

/**
 *
 * @author lm-carlos
 */
public class Empleado extends Persona {

    private String departamento;

    public Empleado(String nombre, int edad, String departamento) {
        super(nombre, edad); // Llama al constructor de Persona
        this.departamento = departamento;
    }

    @Override
    public void mostrarDetalles() {
        super.mostrarDetalles(); // Llama al método mostrarDetalles de Persona
        System.out.println("Departamento: " + departamento);
    }
}

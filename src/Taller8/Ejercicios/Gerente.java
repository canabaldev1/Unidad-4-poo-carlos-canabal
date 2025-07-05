package Taller8.Ejercicios;

/**
 *
 * @author lm-carlos
 */
public class Gerente extends Empleado {

    private String departamento;

    public Gerente(String nombre, double edad, String departamento) {
        super(nombre, edad);
        this.departamento = departamento;
    }

    @Override
    public void mostrarDetalles() {
        super.mostrarDetalles();
        System.out.println("Departamento: " + departamento);
    }
}

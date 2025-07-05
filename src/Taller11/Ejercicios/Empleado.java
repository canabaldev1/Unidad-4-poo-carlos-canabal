package Taller11.Ejercicios;

/**
 *
 * @author lm-carlos
 */
public abstract class Empleado {

    private int dias;

    public Empleado(int dias) {
        this.dias = dias;
    }

    public abstract double calcularSalario(int dias);

    public void mostrarDetalles() {
        System.out.println("Salario: $" + calcularSalario(dias));
    }
}

package Taller11.Ejemplos;

/**
 *
 * @author lm-carlos
 */
public abstract class Empleado {

    protected String nombre;

    public Empleado(String nombre) {
        this.nombre = nombre;
    }

    public abstract void calcularSalario(); // Método abstracto

    public void mostrarNombre() {
        System.out.println("Nombre: " + nombre);
    }

}

package Taller2.Ejercicios;

/**
 *
 * @author lm-carlos
 */
public class Estudiante {

    private String nombre;
    private int edad;

    public Estudiante(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public Estudiante() {
        this("nombre no definido", 0);
    }

    @Override
    public String toString() {
        return ("Estudiante\n" + "--------------------------\n"
                + "nombre:      " + nombre + "\n"
                + "edad:        " + edad + "\n");
    }
}

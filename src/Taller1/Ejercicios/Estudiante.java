package Taller1.Ejercicios;

/**
 *
 * @author lm-carlos
 */
public class Estudiante {

    private String nombre;
    private int edad;
    private String curso;

    public Estudiante() {
        this.nombre = "no definido";
        this.edad = 0;
        this.curso = "no definido";
    }

    public Estudiante(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public Estudiante(String nombre, int edad, String curso) {
        this(nombre, edad);
        this.curso = curso;
    }

    @Override
    public String toString() {
        return ("Estudiante\n" + "--------------------------\n"
                + "nombre:          " + nombre + "\n"
                + "edad:            " + edad + "\n"
                + "curso:           " + curso + "\n");
    }
}

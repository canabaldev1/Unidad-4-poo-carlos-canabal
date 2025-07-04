package Taller4.Ejercicios;

/**
 *
 * @author lm-carlos
 */
public class Estudiante {

    private String nombre;
    private int edad;
    private double notaPromedio;
    private String apellido;

    public Estudiante() {
    }

    // Getters
    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public double getNotaPromedio() {
        return notaPromedio;
    }

    // Setters con validaciones
    public void setNombre(String nombre) {
        if (nombre != null && !nombre.trim().isEmpty()) {
            this.nombre = nombre;
        } else {
            System.out.println("Nombre inválido.");
        }
    }

    public void setEdad(int edad) {
        if (edad >= 0 && edad <= 110) {
            this.edad = edad;
        } else {
            System.out.println("Edad inválida. Debe estar entre 0 y 110.");
        }
    }

    public void setNotaPromedio(double notaPromedio) {
        if (notaPromedio >= 0 && notaPromedio <= 5.0) {
            this.notaPromedio = notaPromedio;
        } else {
            System.out.println("Nota inválida. Debe estar entre 0 y 5.0");
        }
    }
}

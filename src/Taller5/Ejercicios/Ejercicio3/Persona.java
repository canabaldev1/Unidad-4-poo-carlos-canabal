package Taller5.Ejercicios.Ejercicio3;

/**
 *
 * @author lm-carlos
 */
public class Persona {

    private String nombre;
    int edad; // acceso de paquete
    
    public Persona (String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (nombre != null && !nombre.isEmpty()) {
            this.nombre = nombre;
        }
    }
}

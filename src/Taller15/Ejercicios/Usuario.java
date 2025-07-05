package Taller15.Ejercicios;

import Taller15.Ejemplos.*;

/**
 *
 * @author lm-carlos
 */
public class Usuario {

    private String nombre;
    private String contrasena;

    public Usuario(String nombre, String contrasena) {
        this.nombre = nombre;
        this.contrasena = contrasena;
    }

    public String getNombre() {
        return nombre;
    }

    String getContrasena() {
        return contrasena;
    }

}

package Taller1.Ejemplos;

/**
 *
 * @author lm-carlos
 */
public class Coche {

    String marca;
    String modelo;

    // Constructor por defecto
    public Coche() {
        marca = "Desconocida";
    }

    // Contructor con parámetros
    public Coche(String marca) {
        this.marca = marca;
    }

    // Constructor sobrecargado
    public Coche(String marca, String modelo) {
        this(marca);
        this.modelo = modelo;
    }

}

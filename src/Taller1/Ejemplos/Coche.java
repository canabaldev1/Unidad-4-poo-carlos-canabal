package Taller1.Ejemplos;

/**
 *
 * @author lm-carlos
 */
public class Coche extends Vehiculo{

    String marca;
    String modelo;

    // Constructor por defecto
    public Coche() {
        marca = "Desconocida";
    }

    // Contructor con parámetros
    public Coche(String tipo, String marca) {
        super(tipo);
        this.marca = marca;
    }

    // Constructor sobrecargado
    public Coche(String tipo, String marca, String modelo) {
        this(tipo, marca);
        this.modelo = modelo;
    }

}

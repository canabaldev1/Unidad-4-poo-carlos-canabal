package Taller6.Ejemplos.Vehiculos;

/**
 *
 * @author lm-carlos
 */
public class Coche extends Vehiculo {

    private int puertas;

    public Coche(String marca, double velocidad, int puertas) {
        super(marca, velocidad);
        this.puertas = puertas;
    }

    public void mostrarInformacion() {
        mostrarDetalles();
        System.out.println("Número de puertas: " + puertas);
    }

}

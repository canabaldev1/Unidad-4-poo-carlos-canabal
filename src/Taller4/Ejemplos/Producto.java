package Taller4.Ejemplos;

/**
 *
 * @author lm-carlos
 */
public class Producto {

    private double precio;

    public Producto(double precio) {
        this.precio = precio;
    }

    public void actualizarPrecio(double nuevoPrecio) {
        precio = nuevoPrecio;
    }

    public double getPrecio() {
        return precio;
    }

}

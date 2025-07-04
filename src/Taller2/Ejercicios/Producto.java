package Taller2.Ejercicios;

/**
 *
 * @author lm-carlos
 */
public class Producto {

    private String nombre;
    private double precio;

    // Constructor
    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public void mostrarProducto() {
        System.out.println("Nombre del producto: " + nombre);
        System.out.println("Precio: $" + precio);
    }

    @Override
    public String toString() {
        return ("Producto\n" + "--------------------------\n"
                + "nombre:      " + nombre + "\n"
                + "precio:        " + precio + "\n");
    }

}

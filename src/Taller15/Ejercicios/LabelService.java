package Taller15.Ejercicios;

/**
 *
 * @author lm-carlos
 */
public class LabelService {

    public String generarEtiqueta(Producto p) {
        return "Producto: " + p.getNombre() + " - Precio: $" + p.getPrecioBase();
    }
}

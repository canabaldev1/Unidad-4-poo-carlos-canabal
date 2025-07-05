package Taller15.Ejercicios;

/**
 *
 * @author lm-carlos
 */
public class PriceService {

    public double calcularPrecioConIVA(Producto p) {
        return p.getPrecioBase() * 1.19;
    }

    public double calcularPrecioConDescuento(Producto p, double descuento) {
        return p.getPrecioBase() * descuento * 1.19;
    }
}

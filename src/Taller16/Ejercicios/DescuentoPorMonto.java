package Taller16.Ejercicios;

/**
 *
 * @author lm-carlos
 */
public class DescuentoPorMonto extends Descuento {

    double montoDeDescuento;

    public DescuentoPorMonto(double montoDeDescuento) {
        super();
        this.montoDeDescuento = montoDeDescuento;
    }

    @Override
    public double calcularDescuento(double valorProducto) {
        return valorProducto - montoDeDescuento;
    }

}

package Taller15.Ejemplos;

/**
 *
 * @author lm-carlos
 */
public class CalculoTotalService {

    public double calcularImpuestos(Pedido pedido) {
        return pedido.getTotal() * 0.15;
    }

}

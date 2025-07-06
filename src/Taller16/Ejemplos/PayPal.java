package Taller16.Ejemplos;

/**
 *
 * @author lm-carlos
 */
public class PayPal extends Pago {

    @Override
    public void procesarPago(double monto) {
        System.out.println("Procesando pago con PayPal: $" + monto);
    }

}

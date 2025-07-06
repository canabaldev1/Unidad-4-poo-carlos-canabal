package Taller17.Ejercicios;

/**
 *
 * @author lm-carlos
 */
public class CuentaAhorros extends CuentaBancaria {

    public CuentaAhorros(String numeroCuenta, double saldo) {
        super(numeroCuenta, saldo);
    }

    @Override
    public void tipoDeCuenta() {
        System.out.println("Esta es una cuenta de ahorros");
    }
}

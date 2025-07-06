package Taller17.Ejercicios;

/**
 *
 * @author lm-carlos
 */
public abstract class CuentaBancaria {

    String numeroCuenta;
    double saldo;

    public CuentaBancaria(String numeroCuenta, double saldo) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
    }

    public abstract void tipoDeCuenta();

}

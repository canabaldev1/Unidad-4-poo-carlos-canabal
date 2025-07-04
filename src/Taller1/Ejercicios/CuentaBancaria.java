package Taller1.Ejercicios;

/**
 *
 * @author lm-carlos
 */
public class CuentaBancaria {

    String numeroCuenta;
    Long saldo;
    String tipoCuenta;

    public CuentaBancaria() {
    }

    public CuentaBancaria(String numeroCuenta, String tipoCuenta) {
        this.numeroCuenta = numeroCuenta;
        this.tipoCuenta = tipoCuenta;
    }

    public CuentaBancaria(String numeroCuenta, String tipoCuenta, Long saldo) {
        this.numeroCuenta = numeroCuenta;
        this.tipoCuenta = tipoCuenta;
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return ("Cuenta Bancaria\n" + "--------------------------\n"
                + "número de cuenta :      " + numeroCuenta + "\n"
                + "saldo:                  " + saldo + "\n"
                + "tipo de cuenta:         " + tipoCuenta + "\n");
    }

}

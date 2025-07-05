package Taller7.Ejercicios.Ejercicio2;

/**
 *
 * @author lm-carlos
 */
public class CuentaBancaria {

    private String numeroCuenta;
    private double saldo;
    public String tipoCuenta;

    public CuentaBancaria(String numeroCuenta, double saldo, String tipoCuenta) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
        this.tipoCuenta = tipoCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void mostrarDetalle() {
        System.out.println("Numero de cuenta: " + numeroCuenta);
        System.out.println("Saldo: " + saldo);
        System.out.println("Tipo de cuenta: " + tipoCuenta);
    }
}

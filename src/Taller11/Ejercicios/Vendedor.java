package Taller11.Ejercicios;

/**
 *
 * @author lm-carlos
 */
public class Vendedor extends Empleado {

    public Vendedor(int dias) {
        super(dias);
    }

    @Override
    public double calcularSalario(int dias) {
        return dias * 150000;
    }
}

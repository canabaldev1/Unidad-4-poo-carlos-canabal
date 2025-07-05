package Taller11.Ejercicios;

/**
 *
 * @author lm-carlos
 */
public class Gerente extends Empleado {

    public Gerente(int dias) {
        super(dias);
    }

    @Override
    public double calcularSalario(int dias) {
        return dias * 200000;
    }
}

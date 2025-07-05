package Taller10.Ejemplos;

/**
 *
 * @author lm-carlos
 */
public class Coche extends Vehiculo {
    // Error de compilación: Diferente firma del método

    @Override
    public void acelerar() {
        System.out.println("El coche acelera");
    }
}

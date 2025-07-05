package Taller10.Ejercicios;

/**
 *
 * @author lm-carlos
 */
public class Bicicleta extends Vehiculo {

    @Override
    public void moverse(String velocidad) {
        System.out.println("Me muevo en dos llantas a " + velocidad + " km/h");
    }
}

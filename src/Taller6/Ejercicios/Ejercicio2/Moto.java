package Taller6.Ejercicios.Ejercicio2;

/**
 *
 * @author lm-carlos
 */
public class Moto extends Vehiculo {

    protected int cilindrada;

    public Moto(String tipo, String marca, int cilindrada) {
        super(tipo, marca);
        this.cilindrada = cilindrada;
    }

}

package Taller17.Ejemplos;

/**
 *
 * @author lm-carlos
 */
public class CocheElectrico extends Vehiculo {

    @Override
    public void mover() {
        throw new UnsupportedOperationException("Coche eléctrico necesita recarga.");
    }
}

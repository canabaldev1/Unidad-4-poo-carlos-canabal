package Taller17.Ejemplos;

/**
 *
 * @author lm-carlos
 */
public class Cuadrado extends Rectangulo {

    public Cuadrado(double lado) {
        super(lado, lado);
    }

    @Override
    public void setAlto(double alto) {
        super.setAlto(alto);
        super.setAncho(alto);
    }

    @Override
    public void setAncho(double ancho) {
        super.setAncho(ancho);
        super.setAlto(ancho);
    }

}

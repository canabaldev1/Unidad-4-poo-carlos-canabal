package Taller16.Ejercicios;

/**
 *
 * @author lm-carlos
 */
public class DescuentoPorPorcentaje extends Descuento {

    double porcentaje;
    
    public DescuentoPorPorcentaje (double porcentaje) {
        super();
        this.porcentaje = porcentaje;
    }
    
    @Override
    public double calcularDescuento (double valorProducto){
        return valorProducto*porcentaje;
    }
    
}

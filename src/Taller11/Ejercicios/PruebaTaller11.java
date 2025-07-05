package Taller11.Ejercicios;

/**
 *
 * @author lm-carlos
 */
public class PruebaTaller11 {

    public static void main(String[] args) {
        Figura f1 = new Circulo(5);
        Figura f2 = new Rectangulo(4, 6);

        f1.mostrarArea();
        f2.mostrarArea();
        
        Gerente g1 = new Gerente(10);
        Vendedor v1 = new Vendedor(10);
        
        g1.mostrarDetalles();
        v1.mostrarDetalles();
    }
}

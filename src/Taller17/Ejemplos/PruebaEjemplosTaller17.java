package Taller17.Ejemplos;

/**
 *
 * @author lm-carlos
 */
public class PruebaEjemplosTaller17 {

    public static void main(String[] args) {
        Vehiculo vehiculo = new Vehiculo();
        Vehiculo coche = new Coche();
        vehiculo.mover();
        coche.mover();

        Animal miPato = new Pato();
        Animal miPerro = new Perro();
        miPato.hacerSonido();
        miPerro.hacerSonido();

        Vehiculo cocheElectrico = new CocheElectrico();
        cocheElectrico.mover();
    }
}

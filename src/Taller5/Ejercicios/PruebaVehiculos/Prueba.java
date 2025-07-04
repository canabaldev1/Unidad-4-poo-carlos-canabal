package Taller5.Ejercicios.PruebaVehiculos;

import Taller5.Ejercicios.Vehiculos.Moto;

/**
 *
 * @author lm-carlos
 */
public class Prueba {

    public static void main(String[] args) {

        try {
            Moto moto = new Moto("Motocicleta", "2006");

        } catch (Exception e) {
            System.out.println("Error al crear moto: "+e.getMessage());
            System.out.println("No se puede crear porque el constructor tiene acceso de \npaquete, y este es otro paquete diferente");
            
        }
    }
}

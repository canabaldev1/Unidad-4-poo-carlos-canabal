package Taller6.Ejercicios.Ejercicio2Prueba;

/**
 *
 * @author lm-carlos
 */
public class PruebaEjercicio2 {

    public static void main(String[] args) {

        try {
            Vehiculo v1 = new Vehiculo("Auto", "Toyota");
            Moto m1 = new Moto("Moto", "Yamaha", 200);

        } catch (Exception e) {
            System.out.println("No se pudo acceder a las clases no relacionadas");
        }

    }
}

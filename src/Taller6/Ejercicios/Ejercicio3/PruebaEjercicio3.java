package Taller6.Ejercicios.Ejercicio3;

/**
 *
 * @author lm-carlos
 */
public class PruebaEjercicio3 {

    public static void main(String[] args) {
        BancoConError b1 = new BancoConError(15000);
        Banco b2 = new Banco(45000);

        try {
            System.out.println("Saldo: " + b1.saldo);
        } catch (Exception e) {
            System.out.println("No se puede mostrar saldo. No hay acceso.");
        }

        try {
            System.out.println("Saldo: " + b2.saldo);
        } catch (Exception e) {
            System.out.println("No se puede mostrar saldo. No hay acceso.");
        }

        System.out.println("Es mejor definir el atributo como private, ya que de\nesta manera no se puede acceder desde fuera de la clase.");
    }
}

package Taller3.Ejercicios;

/**
 *
 * @author lm-carlos
 */
public class IntegradorTaller3 {

    public static void main(String[] args) {

        Coche c1 = new Coche("Toyota", "Corolla");
        Coche c2 = new Coche("Honda", "Civic");
        Coche c3 = new Coche("Ford", "Focus");

        Coche.mostrarCantidadDeCoches();

        System.out.println("Suma: " + Matematicas.sumar(10, 5));
        System.out.println("Resta: " + Matematicas.restar(10, 5));
        System.out.println("Multiplicación: " + Matematicas.multiplicar(10, 5));
        System.out.println("División: " + Matematicas.dividir(10, 5));

        try {
            Coche.metodoEstaticoConError();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            System.out.println("El error sucede porque el metodo es estático, y las variables no.\npor lo tanto, no hay un objeto instanciado con esa clase\nque tenga los atributos a los que quiere acceder el método");
        }

        c1.metodoEstaticoCorregido();
        c2.metodoEstaticoCorregido();
        c3.metodoEstaticoCorregido();

        System.out.println("Ahora se ejecuta el método con los objetos instanciados anteriormente.");

    }
}

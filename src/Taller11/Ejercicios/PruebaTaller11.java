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

        try {
            Empleado e1 = new Empleado(10);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("No se puede instanciar un objeto con esta clase directamente");
        }

        System.out.println(g1.mostrarDias());
        System.out.println("Este metodo no lo sobreescribí y no me da problemas.\nLos metodos que hay que sobreescribir obligatoriamente deben ser abstractos");
    }
}

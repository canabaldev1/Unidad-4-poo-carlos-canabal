package Taller3.Ejemplos;

/**
 *
 * @author lm-carlos
 */
public class IntegradorEjemplosTaller3 {

    public static void main() {
        Contador c1 = new Contador();
        Contador c2 = new Contador();
        Contador c3 = new Contador();
// Se accede al método estático usando el nombre de la clase
        Contador.mostrarContador(); // Muestra: Contador global: 3

        int resultado = Calculadora.sumar(5, 7);
        System.out.println("Resultado: " + resultado);

        try {
            Persona.mostrarNombre();
        } catch (Exception e) {
            System.out.println("Error al mostrar nombre");
        }

        try {
            Banco.modificarTasa(0.1);
            System.out.println("Cambiada tasa con exito");
        } catch (Exception e) {
            System.out.println("Error al cambiar tasa de interes");
        }

        try {
            Banco.cambiarSaldo(500);
            System.out.println("Se cambia el saldo, pero es el mismo parámetro de la función, asi que esto no tiene sentido");
        } catch (Exception e) {
            System.out.println("Error al cambiar saldo");
        }

    }
}

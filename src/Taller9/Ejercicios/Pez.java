package Taller9.Ejercicios;

/**
 *
 * @author lm-carlos
 */
public class Pez extends Animal {

    private String tipoDeAgua;

    public Pez(String especie, String tipoDeAgua) {
        super(especie);
        this.tipoDeAgua = tipoDeAgua;
    }

    public void mostrarDetalles() {
        super.mostrarEspecie();
        System.out.println("Tipo de agua: " + tipoDeAgua);
    }
}

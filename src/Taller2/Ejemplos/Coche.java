package Taller2.Ejemplos;

/**
 *
 * @author lm-carlos
 */
public class Coche {

    private String marca;
    private int velocidadMaxima;

    public Coche() {
        this("Desconocida", 0);
    }

    public Coche(String marca, int velocidadMaxima) {
        this.marca = marca;
        this.velocidadMaxima = velocidadMaxima;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void mostrarMarca() {
        System.out.println("Marca: " + this.marca);
    }

    public void mostrarInformacion() {
        System.out.println("Marca: " + this.marca + ", Velocidad máxima: " + this.velocidadMaxima);
    }

}

package Taller1.Ejercicios;

/**
 *
 * @author lm-carlos
 */
public class Libro {

    String titulo;
    String autor;
    int numeroPaginas;

    public Libro() {
        this.titulo = "no definido";
        this.autor = "no definido";
        this.numeroPaginas = 0;
    }

    public Libro(String titulo, String autor, int numeroPaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    @Override
    public String toString() {
        return ("Libro\n" + "--------------------------\n"
                + "titulo :                " + titulo + "\n"
                + "autor:                  " + autor + "\n"
                + "número de páginas:      " + numeroPaginas + "\n");
    }

}

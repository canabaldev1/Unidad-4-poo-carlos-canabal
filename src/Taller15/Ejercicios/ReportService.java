package Taller15.Ejercicios;

/**
 *
 * @author lm-carlos
 */
public class ReportService {

    public String generarReporte(Libro libro) {
        return "REPORTE DEL LIBRO: " + libro.getTitulo().toUpperCase();
    }
}

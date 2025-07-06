package Taller16.Ejemplos;

/**
 *
 * @author lm-carlos
 */
public class NotificacionEmail extends Notificacion {

    @Override
    public void enviar(String mensaje) {
        System.out.println("Enviando email: " + mensaje);
    }

}

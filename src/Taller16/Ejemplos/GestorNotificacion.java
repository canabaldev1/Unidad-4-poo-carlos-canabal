package Taller16.Ejemplos;

/**
 *
 * @author lm-carlos
 */
public class GestorNotificacion {

    public void notificar(Notificacion notificacion, String mensaje) {
        notificacion.enviar(mensaje);
    }

}

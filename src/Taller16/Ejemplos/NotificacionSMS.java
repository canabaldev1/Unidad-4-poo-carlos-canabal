package Taller16.Ejemplos;

/**
 *
 * @author lm-carlos
 */
public class NotificacionSMS extends Notificacion {

    @Override
    public void enviar(String mensaje) {
        System.out.println("Enviando SMS: " + mensaje);
    }

}

package Taller15.Ejercicios;

/**
 *
 * @author lm-carlos
 */
public class ValidationService {

    public boolean validar(Usuario usuario) {
        return usuario.getNombre() != null && usuario.getContrasena().length() >= 8;
    }
}

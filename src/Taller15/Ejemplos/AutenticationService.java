package Taller15.Ejemplos;

/**
 *
 * @author lm-carlos
 */
public class AutenticationService {

    public boolean autenticar(Usuario usuario, String contrasena) {
        return usuario.getNombre().equals("admin") && contrasena.equals("1234");
    }

}

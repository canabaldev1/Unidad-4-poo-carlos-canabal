package Taller12.Ejemplos;

/**
 *
 * @author lm-carlos
 */
public class Anfibio implements Volador, Nadador {
    @Override
    public void volar(){
        System.out.println("Los anfibios no vuelan");
    }

    @Override
    public void nadar(){
        System.out.println("Los anfibios si nadan");
    }
}

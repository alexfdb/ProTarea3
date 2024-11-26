package es.ies.puerto;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/**
 * @author alexfdb
 * @version 1.0.0
 * Métodos a utilizar: remove
 * Elimina el cuarto elemento del ArrayList utilizando el método remove.
 * Imprime la lista para confirmar que el elemento fue eliminado correctamente.
 */
public class Ejercicio4 {
    public static void main(String[] args) {
        List<String> nombres = new ArrayList<>(Arrays.asList("Bilbo", "Frodo", "Sam", "Pipim", "Merry"));
        nombres.remove(3);
        System.out.println(nombres);
    }
}
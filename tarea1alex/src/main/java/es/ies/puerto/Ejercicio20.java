package es.ies.puerto;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/**
 * @author alexfdb
 * @version 1.0.0
 * Métodos a utilizar: remove
 * Usa el método remove para eliminar un elemento del ArrayList basado en su índice.
 * Imprime la lista tras la eliminación.
 */
public class Ejercicio20 {
    public static void main(String[] args) {
        List<String> hobbits = new ArrayList<>(Arrays.asList("Bilbo", "Frodo", "Sam", "Pipim", "Merry"));
        hobbits.remove(0);
        System.out.println(hobbits);
    }
}
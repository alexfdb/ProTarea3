package es.ies.puerto;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/**
 * @author alexfdb
 * @version 1.0.0
 * Métodos a utilizar: isEmpty
 * Usa el método isEmpty para verificar si el ArrayList está vacío.
 * Imprime un mensaje indicando si lo está o no.
 */
public class Ejercicio16 {
    public static void main(String[] args) {
        List<String> hobbits = new ArrayList<>(Arrays.asList("Bilbo", "Frodo", "Sam", "Pipim", "Merry"));
        System.out.println(hobbits.isEmpty());
    }
}
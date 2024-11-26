package es.ies.puerto;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/**
 * @author alexfdb
 * @version 1.0.0
 * Métodos a utilizar: subList
 * Usa el método subList para obtener una sublista con los tres primeros elementos del ArrayList.
 * Imprime la sublista.
 */
public class Ejercicio18 {
    public static void main(String[] args) {
        List<String> hobbits = new ArrayList<>(Arrays.asList("Bilbo", "Frodo", "Sam", "Pipim", "Merry"));
        System.out.println(hobbits.subList(0, 3));
    }
}
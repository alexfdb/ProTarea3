package es.ies.puerto;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
/**
 * @author alexfdb
 * @version 1.0.0
 * Métodos a utilizar: Collections.sort
 * Ordena el ArrayList en orden alfabético utilizando el método Collections.sort.
 * Imprime la lista ordenada.
 */
public class Ejercicio9 {
    public static void main(String[] args) {
        List<String> nombres = new ArrayList<>(Arrays.asList("Bilbo", "Frodo", "Sam", "Pipim", "Merry"));
        Collections.sort(nombres);
        System.out.println(nombres);
    }
}
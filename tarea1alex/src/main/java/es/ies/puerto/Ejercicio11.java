package es.ies.puerto;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
/**
 * @author alexfdb
 * @version 1.0.0
 * Métodos a utilizar: Collections.reverse
 * Invierte el orden de los elementos del ArrayList utilizando el método Collections.reverse.
 * Imprime la lista invertida.
 */
public class Ejercicio11 {
    public static void main(String[] args) {
        List<String> nombres = new ArrayList<>(Arrays.asList("Bilbo", "Frodo", "Sam", "Pipim", "Merry"));
        Collections.reverse(nombres);
        System.out.println(nombres);
    }
}
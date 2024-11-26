package es.ies.puerto;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/**
 * @author alexfdb
 * @version 1.0.0
 * Métodos a utilizar: replaceAll
 * Usa el método replaceAll para reemplazar todos los elementos del ArrayList con el valor "Sin Nombre".
 * Imprime la lista resultante.
 */
public class Ejercicio17 {
    public static void main(String[] args) {
        List<String> hobbits = new ArrayList<>(Arrays.asList("Bilbo", "Frodo", "Sam", "Pipim", "Merry"));
        hobbits.replaceAll(nombre -> "Sin Nombre");
        System.out.println(hobbits);
    }
}
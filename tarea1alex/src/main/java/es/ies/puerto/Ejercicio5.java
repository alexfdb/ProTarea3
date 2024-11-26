package es.ies.puerto;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/**
 * @author alexfdb
 * @version 1.0.0
 * Métodos a utilizar: contains
 * Verifica si el nombre "Ana" está presente en el ArrayList.
 * Imprime un mensaje indicando si el elemento está o no en la lista.
 */
public class Ejercicio5 {
    public static void main(String[] args) {
        List<String> nombres = new ArrayList<>(Arrays.asList("Bilbo", "Frodo", "Sam", "Pipim", "Merry"));
        System.out.println(nombres.contains("Ana"));
    }
}
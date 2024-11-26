package es.ies.puerto;
import java.util.ArrayList;
import java.util.Arrays;
/**
 * @author alexfdb
 * @version 1.0.0
 * Métodos a utilizar: clone
 * Crea una copia exacta del ArrayList utilizando el método clone.
 * Imprime la lista clonada.
 */
public class Ejercicio15 {
    public static void main(String[] args) {
        ArrayList<String> hobbits = new ArrayList<>(Arrays.asList("Bilbo", "Frodo", "Sam", "Pipim", "Merry"));
        ArrayList<String> hobbits2 = (ArrayList)hobbits.clone();
        System.out.println(hobbits2);
    }
}
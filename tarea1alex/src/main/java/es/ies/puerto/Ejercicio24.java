package es.ies.puerto;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/**
 * @author alexfdb
 * @version 1.0.0
 * Métodos a utilizar: retainAll
 * Crea dos ArrayList<String> con algunos elementos en común.
 * Usa el método retainAll para conservar solo los elementos comunes en el primer ArrayList.
 * Imprime la lista resultante.
 */
public class Ejercicio24 {
    public static void main(String[] args) {
        List<String> hobbits = new ArrayList<>(Arrays.asList("Bilbo", "Frodo", "Sam", "Pipim", "Merry"));
        List<String> hobbits2 = new ArrayList<>(Arrays.asList("Bilbo", "Sotomonte", "Sam", "Pipim", "Merry"));
        hobbits.retainAll(hobbits2);
        System.out.println(hobbits);
    }
}
package es.ies.puerto;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/**
 * @author alexfdb
 * @version 1.0.0
 * Métodos a utilizar: equals
 * Crea dos ArrayList<String> con elementos iguales.
 * Usa el método equals para verificar si ambas listas son iguales.
 * Imprime el resultado de la comparación.
 */
public class Ejercicio22 {
    public static void main(String[] args) {
        List<String> hobbits = new ArrayList<>(Arrays.asList("Bilbo", "Frodo", "Sam", "Pipim", "Merry"));
        List<String> hobbits2 = new ArrayList<>(Arrays.asList("Bilbo", "Frodo", "Sam", "Pipim", "Merry"));
        System.out.println(hobbits.equals(hobbits2));
    }
}
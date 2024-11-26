package es.ies.puerto;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/**
 * @author alexfdb
 * @version 1.0.0
 * Métodos a utilizar: forEach
 * Usa el método forEach para recorrer y mostrar todos los elementos del ArrayList.
 */
public class Ejercicio8 {
    public static void main(String[] args) {
        List<String> nombres = new ArrayList<>(Arrays.asList("Bilbo", "Frodo", "Sam", "Pipim", "Merry"));
        for (String nombre : nombres) {
            System.out.println(nombre);
        }
    }
}
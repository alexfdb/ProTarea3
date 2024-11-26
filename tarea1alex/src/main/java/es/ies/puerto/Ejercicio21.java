package es.ies.puerto;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/**
 * Métodos a utilizar: clear
 * Vacía completamente el contenido del ArrayList utilizando el método clear.
 * Verifica si está vacío con el método isEmpty e imprime un mensaje.
 */
public class Ejercicio21 {
    public static void main(String[] args) {
        List<String> hobbits = new ArrayList<>(Arrays.asList("Bilbo", "Frodo", "Sam", "Pipim", "Merry"));
        hobbits.clear();
        System.out.println(hobbits.isEmpty());
    }
}
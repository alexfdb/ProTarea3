package es.ies.puerto;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/**
 * @author alexfdb
 * @version 1.0.0
 * Métodos a utilizar: addAll
 * Crea un segundo ArrayList<String> con cinco nombres diferentes.
 * Usa el método addAll para agregar todos los elementos de esta lista al primer ArrayList.
 * Imprime la lista combinada.
 */
public class Ejercicio14 {
public static void main(String[] args) {
        List<String> hobbits = new ArrayList<>(Arrays.asList("Bilbo", "Frodo", "Sam", "Pipim", "Merry"));
        List<String> elfos = new ArrayList<>(Arrays.asList("Elrond", "Galadriel", "Celebor", "Arwen", "Glorfindel"));
        hobbits.addAll(elfos);
        System.out.println(hobbits);
    }
}
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
        ArrayList<Object> hobitsClonados = clonar(hobbits);
        System.out.println(hobitsClonados);
    }

    /**
     * Función para clonar una lista.
     * @param list a clonar.
     * @return una lista vacia si la lista a clonar es null o esta vacia.
     */
    public static ArrayList<Object> clonar(ArrayList list) {
        if(list == null || list.isEmpty()) {
            return new ArrayList<>();
        }
        return (ArrayList)list.clone();
    }
}
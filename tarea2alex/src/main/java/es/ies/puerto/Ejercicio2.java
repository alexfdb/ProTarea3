package es.ies.puerto;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
/**
 * @author alexfdb
 * @version 1.0.0
 * Agrega elementos a una lista solo si no están presentes, usando contains(). 
 * Luego, ordena la lista alfabéticamente con Collections.sort().
 */
public class Ejercicio2 {
    public static void main(String[] args) {
        List<String> diasDeLaSemana = new ArrayList<>(Arrays.asList(
    "Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo"
    ));
    addSinRepetir(diasDeLaSemana, null);
    addSinRepetir(diasDeLaSemana, "Domingo");
    addSinRepetir(diasDeLaSemana, "Septiembre");
    Collections.sort(diasDeLaSemana);
    System.out.println(diasDeLaSemana);
    }

    /**
     * Función para añadir un elemento si no esta en la lista.
     * @param lista a la que añadir un elemento.
     * @param elemento a añadir a la lista.
     * @return
     */
    public static boolean addSinRepetir(List<String> lista, String elemento) {
        if(!lista.contains(elemento)) {
            addSinNull(lista, elemento);
            return true;
        }
        return false;
    }

    /**
     * Método que añade un elemento si este no es null.
     * @param lista a la que añadir un elemento.
     * @param elemento a añadir a la lista.
     */
    public static void addSinNull(List<String> lista, String elemento) {
        if (elemento != null) {
            lista.add(elemento);
        }
    }
}
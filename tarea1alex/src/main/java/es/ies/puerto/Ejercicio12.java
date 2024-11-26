package es.ies.puerto;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/**
 * @author alexfdb
 * @version 1.0.0
 * Métodos a utilizar: indexOf
 * Busca el índice de un elemento específico en el ArrayList utilizando el método indexOf.
 * Imprime el elemento encontrado.
 */
public class Ejercicio12 {
    public static void main(String[] args) {
        List<String> nombres = new ArrayList<>(Arrays.asList("Bilbo", "Frodo", "Sam", "Pipim", "Merry"));
        int posicionFrodo = nombres.indexOf("Frodo");
        System.out.println(nombres.get(posicionFrodo));
    }
}
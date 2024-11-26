package es.ies.puerto;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/**
 * @author alexfdb
 * @version 1.0.0
 * Métodos a utilizar: removeIf
 * Usa el método removeIf para eliminar todos los nombres del ArrayList que tengan más de 5 caracteres.
 * Imprime la lista resultante.
 */
public class Ejercicio13 {
    public static void main(String[] args) {
        List<String> nombres = new ArrayList<>(Arrays.asList("Bilbo", "Frodo", "Sam", "Pipim", "Merry"));
            nombres.removeIf(nombre -> nombre.length() > 5);
            System.out.println(nombres);
    }
}
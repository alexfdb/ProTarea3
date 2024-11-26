package es.ies.puerto;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/**
 * @author alexfdb
 * @version 1.0.0
 * Métodos a utilizar: toArray
 * Convierte el ArrayList a un array utilizando el método toArray.
 * Imprime los elementos del array utilizando un bucle for.
 */
public class Ejercicio10 {
    public static void main(String[] args) {
        List<String> nombres = new ArrayList<>(Arrays.asList("Bilbo", "Frodo", "Sam", "Pipim", "Merry"));
        Object[] nombresArray = nombres.toArray();
        for (int i = 0; i < nombresArray.length; i++) {
            System.out.println(nombresArray[i]);
        }
    }
}
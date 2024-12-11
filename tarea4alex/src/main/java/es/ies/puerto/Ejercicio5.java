package es.ies.puerto;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Vector;
/**
 * @author alexfdb
 * @version 1.0.0
 * Descripción: Ordenar un vector con números aleatorios en orden ascendente.
 * Métodos a utilizar: add(), sort() (de Collections).
 * Resultado esperado: Antes: [4, 2, 5, 1, 3]. Después: [1, 2, 3, 4, 5].
 */
public class Ejercicio5 {
    static Vector<Integer> numeros = new Vector<>(Arrays.asList(4, 2, 5, 1, 3));
    public static void main(String[] args) {
        ordenarVector(numeros);
        System.out.println(numeros);
    }

    /**
     * Ordena una lista si esta no es null ni esta vacía.
     * @param lista a ordenar.
     * @return true si la lista fue ordenada.
     */
    public static Boolean ordenarVector(List<Integer> lista) {
        if(lista == null || lista.isEmpty()) return false;
        Collections.sort(lista);
        return true;
    }
}
package es.ies.puerto;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
/**
 * @author alexfdb
 * @version 1.0.0
 * Función: List<Integer> ordenarLista(List<Integer> lista)
 * Lista de entrada: List<Integer> lista
 * Ejemplo: [4, 1, 3, 2]
 * Descripción: Ordena la lista en orden ascendente y la devuelve.
 * Resultado esperado: [1, 2, 3, 4].
 */
public class Ejercicio6 {
    static List<Integer> lista = new ArrayList<>(Arrays.asList(4, 3, 2, 1));
    public static void main(String[] args) {
        List<Integer> listaOrdenada = ordenarLista(lista);
        System.out.println(listaOrdenada);
    }

    /**
     * Ordena una lista en orden ascendente.
     * @param lista a ordenar.
     * @return lista ordenada.
     */
    public static List<Integer> ordenarLista(List<Integer> lista) {
        if(lista == null || lista.isEmpty()) return new ArrayList<>();
        Collections.sort(lista);
        return lista;
    }
}
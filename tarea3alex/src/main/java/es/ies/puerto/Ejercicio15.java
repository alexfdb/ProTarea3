package es.ies.puerto;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/**
 * @author alexfdb
 * @version 1.0.0
 * Función: List<Integer> rotarLista(List<Integer> lista, int posiciones)
 * Lista de entrada: List<Integer> lista
 * Ejemplo: [1, 2, 3, 4]
 * Descripción: Rota la lista hacia la derecha posiciones veces y la devuelve.
 * Resultado esperado con posiciones=1: [4, 1, 2, 3].
 */
public class Ejercicio15 {
    static List<Integer> lista = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
    public static void main(String[] args) {
        List<Integer> listaRotada = rotarLista(lista, 1);
        System.out.println(listaRotada);
    }

    /**
     * Toma una lista y la devuelve rotada tantas posiciones a la derecha como se indique.
     * @param lista a rotar.
     * @param posiciones que rotar.
     * @return una nueva lista rotada.
     */
    public static List<Integer> rotarLista(List<Integer> lista, int posiciones) {
        if(lista == null || lista.isEmpty()) return new ArrayList<>();
        if(posiciones > lista.size() || posiciones < 0) return new ArrayList<>();
        List<Integer> subLista1 = lista.subList(0, lista.size() - posiciones);
        List<Integer> subLista2 = lista.subList(lista.size() - posiciones, lista.size());
        List<Integer> listaRotada = new ArrayList<>();
        listaRotada.addAll(subLista2);
        listaRotada.addAll(subLista1);
        return listaRotada;
    }
}
package es.ies.puerto;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
/**
 * @author alexfdb
 * @version 1.0.0
 * Función: List<Integer> invertirLista(List<Integer> lista)
 * Lista de entrada: List<Integer> lista
 * Ejemplo: [1, 2, 3, 4]
 * Descripción: Invierte los elementos de la lista y la devuelve.
 * Resultado esperado: [4, 3, 2, 1].
 */
public class Ejercicio8 {
    static List<Integer> lista = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
    public static void main(String[] args) {
        System.out.println(invertirLista(lista));
    }

    /**
     * Invierte el orden de la lista.
     * @param lista a la que invertir el orden.
     * @return lista en orden invertido.
     */
    public static List<Integer> invertirLista(List<Integer> lista) {
        if(lista == null || lista.isEmpty()) return new ArrayList<>();
        Collections.reverse(lista);
        return lista;
    }
}
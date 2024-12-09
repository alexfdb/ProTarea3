package es.ies.puerto;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
/**
 * @author alexfdb
 * @version 1.0.0
 * Función: List<Integer> eliminarDuplicados(List<Integer> lista)
 * Lista de entrada: List<Integer> lista
 * Ejemplo: [1, 2, 2, 3, 3, 4]
 * Descripción: Devuelve la lista sin duplicados, manteniendo el orden original.
 * Resultado esperado: [1, 2, 3, 4].
 */
public class Ejercicio17 {
    static List<Integer> lista = new ArrayList<>(Arrays.asList(1, 2, 2, 3, 3, 4));
    public static void main(String[] args) {
        List<Integer> listaSinDuplicados = eliminarDuplicados(lista);
        System.out.println(listaSinDuplicados);
    }

    /**
     * Toma una lista y devuelve otra sin los duplicados de la primera.
     * @param lista de origen.
     * @return lista sin duplicados.
     */
    public static List<Integer> eliminarDuplicados(List<Integer> lista) {
        if(lista == null || lista.isEmpty()) return new ArrayList<>();
        return new ArrayList<>(new HashSet<>(lista));
    }
}
package es.ies.puerto;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/**
 * @author alexfdb
 * @version 1.0.0
 * Función: List<Integer> eliminarSi(List<Integer> lista, int limite)
 * Lista de entrada: List<Integer> lista
 * Ejemplo: [10, 20, 30, 40]
 * Descripción: Elimina todos los elementos mayores que limite de la lista.
 * Resultado esperado con limite=25: [10, 20].
 */
public class Ejercicio9 {
    static List<Integer> lista = new ArrayList<>(Arrays.asList(10, 20, 30, 40));
    public static void main(String[] args) {
        System.out.println(eliminarSi(lista, 25));
    }

    /**
     * Elimina los elementos que tengan un valor mayor que el especificado.
     * @param lista en la que eliminar.
     * @param limite a partir del cual se elminaran los elementos de valor superior.
     * @return la lista con los nuevos cambios si los hubiera.
     */
    public static List<Integer> eliminarSi(List<Integer> lista, int limite) {
        if(lista == null || lista.isEmpty()) return new ArrayList<>();
        lista.removeIf(numero -> numero > limite );
        return lista;
    }
}
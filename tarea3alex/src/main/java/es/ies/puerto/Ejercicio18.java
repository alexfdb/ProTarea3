package es.ies.puerto;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/**
 * @author alexfdb
 * @version 1.0.0
 * Función: List<Integer> interseccionListas(List<Integer> lista1, List<Integer> lista2)
 * Lista de entrada: List<Integer> lista1, List<Integer> lista2
 * Ejemplo: lista1 = [1, 2, 3, 4], lista2 = [3, 4, 5, 6]
 * Descripción: Devuelve una nueva lista con los elementos comunes entre lista1 y lista2.
 * Resultado esperado: [3, 4].
 */
public class Ejercicio18 {
    static List<Integer> lista1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
    static List<Integer> lista2 = new ArrayList<>(Arrays.asList(3, 4, 5, 6));
    public static void main(String[] args) {
        List<Integer> solucion = interseccionListas(lista1, lista2);
        System.out.println(solucion);
    }

    /**
     * Toma dos listas y devuleve una tercera con los elementos que se repitan de las dos primeras.
     * @param lista1 de origen.
     * @param lista2 de origen.
     * @return lista solo con los elementos que se repitan entre las listas de origen.
     */
    public static List<Integer> interseccionListas(List<Integer> lista1, List<Integer> lista2) {
        if(lista1 == null || lista1.isEmpty()) return new ArrayList<>();
        if(lista2 == null || lista2.isEmpty()) return new ArrayList<>();
        List<Integer> solucion = new ArrayList<>(lista1);
        solucion.retainAll(lista2);
        return solucion;
    }
}
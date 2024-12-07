package es.ies.puerto;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/**
 * @author alexfdb
 * @version 1.0.0
 * Función: boolean contieneValor(List<Integer> lista, int valor)
 * Lista de entrada: List<Integer> lista
 * Ejemplo: [1, 2, 3, 4]
 * Descripción: Verifica si el valor dado está en la lista y devuelve true o false.
 * Resultado esperado con valor=3: true.
 */
public class Ejercicio5 {
    static List<Integer> lista = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
    public static void main(String[] args) {
        System.out.println(contieneValor(lista, 3));
    }

    /**
     * Buscar un elemento en una lista.
     * @param lista en la que buscar el elemento.
     * @param valor elemento a buscar en la lista.
     * @return true si el elemento esta en la lista.
     */
    public static boolean contieneValor(List<Integer> lista, int valor) {
        if(lista == null || lista.isEmpty()) return false;
        return (lista.contains(valor));
    }
}
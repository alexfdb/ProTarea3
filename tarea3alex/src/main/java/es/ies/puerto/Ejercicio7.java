package es.ies.puerto;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/**
 * @author alexfdb
 * @version 1.0.0
 * Función: int indiceDe(List<String> lista, String valor)
 * Lista de entrada: List<String> lista
 * Ejemplo: ["Java", "Python", "C++"]
 * Descripción: Devuelve el índice de la primera aparición de 
 * valor en la lista. Si no está presente, devuelve -1.
 * Resultado esperado con valor="Python": 1.
 */
public class Ejercicio7 {
    static List<String> lista = new ArrayList<>(Arrays.asList("Java", "Python", "C++"));
    public static void main(String[] args) {
        System.out.println(indiceDe(lista, "Python"));
    }

    /**
     * Buscar el indice de la primera aparición de un elemento en una lista.
     * @param lista en la que se busca.
     * @param valor del elemento cuyo indice se desea buscar.
     * @return el indice del elemento indicado si esta presente, sino retorna -1.
     */
    public static int indiceDe(List<String> lista, String valor) {
        if(lista == null || lista.isEmpty()) return -1;
        return lista.indexOf(valor);
    }
}
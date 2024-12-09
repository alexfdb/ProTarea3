package es.ies.puerto;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/**
 * @author alexfdb
 * @version 1.0.0
 * Función: List<Integer> intercambiar(List<Integer> lista, int indice1, int indice2)
 * Lista de entrada: List<Integer> lista
 * Ejemplo: [1, 2, 3, 4]
 * Descripción: Intercambia los valores en los índices indice1 e indice2 y devuelve la lista modificada.
 * Resultado esperado con indice1=0, indice2=2: [3, 2, 1, 4].
 */
public class Ejercicio16 {
    static List<Integer> lista = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
    public static void main(String[] args) {
        intercambiar(lista, 0, 2);
        System.out.println(lista);
    }

    /**
     * Intercambia los elementos indicados en una lista.
     * @param lista en la que intercambiar los valores.
     * @param indice1 del que intercambiar el valor.
     * @param indice2 del que intercambiar el valor.
     * @return la lista con los elementos intercambiados.
     */
    public static List<Integer> intercambiar(List<Integer> lista, int indice1, int indice2) {
        if(lista == null || lista.isEmpty()) return new ArrayList<>();
        if(indice1 < 0 || indice2 < 0) return new ArrayList<>();
        if(indice1 >= lista.size() || indice2 >= lista.size()) return new ArrayList<>();
        int temp = lista.get(indice1);
        lista.set(indice1, lista.get(indice2));
        lista.set(indice2, temp);
        return lista;
    }
}
package es.ies.puerto;
import java.util.ArrayList;
import java.util.List;
/**
 * @author alexfdb
 * @version 1.0.0
 * Llena una lista con números. Toma una sublista del índice 5 al 10, elimina todos los 
 * números que no sean múltiplos de 3 y reemplázalos por el número 0 en la lista principal.
 */
public class Ejercicio14 {
    public static void main(String[] args) {
        List<Integer> numeros = crearListaEnteros(20);

        procesarSublista(numeros, 5, 10);

        System.out.println(numeros);
    }

    /**
     * Función para crear una lista de números enteros.
     * @param tamanio de la lista a crear.
     * @return lista con números consecutivos del 1 al tamaño especificado.
     */
    public static List<Integer> crearListaEnteros(int tamanio) {
        List<Integer> numeros = new ArrayList<>();
        for (int i = 1; i <= tamanio; i++) {
            numeros.add(i);
        }
        return numeros;
    }

    /**
     * Método que toma una sublista de la lista principal, 
     * elimina todos los números que no sean múltiplos 
     * de 3 y reemplaza estos números por el valor 0 en la lista principal.
     * @param lista principal.
     * @param inicio de la sublista (incluido).
     * @param fin de la sublista (excluido).
     */
    public static void procesarSublista(List<Integer> lista, int inicio, int fin) {
        if (inicio < 0 || fin > lista.size() || inicio >= fin) {
            return;
        }

        List<Integer> sublista = lista.subList(inicio, fin);

        for (int i = 0; i < sublista.size(); i++) {
            if (sublista.get(i) % 3 != 0) {
                sublista.set(i, 0);
            }
        }
    }
}
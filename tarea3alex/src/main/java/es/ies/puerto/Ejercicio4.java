package es.ies.puerto;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
/**
 * @author alexfdb
 * @version 1.0.0
 * Función: boolean eliminarElemento(List<Integer> lista, int valor)
 * Lista de entrada: List<Integer> lista
 * Ejemplo: [1, 2, 3, 4]
 * Descripción: Elimina la primera aparición de valor de la lista y devuelve 
 * true si se eliminó correctamente, o false en caso contrario.
 * Resultado esperado con valor=3: [1, 2, 4].
 */
public class Ejercicio4 {
    static List<Integer> lista = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
    public static void main(String[] args) {
        eliminarElemento(lista, 3);
        System.out.println(lista);
    }

    /**
     * Elimina la primera aparicion del elemento indicado.
     * @param lista en la que eliminar.
     * @param valor que eliminar de la lista.
     * @return true si el elemento fue eliminado.
     */
    public static boolean eliminarElemento(List<Integer> lista, int valor) {
        if(lista == null || lista.isEmpty()) return false;
        return lista.remove((Integer)valor);
    }
}
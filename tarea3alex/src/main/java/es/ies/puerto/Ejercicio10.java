package es.ies.puerto;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
/**
 * @author alexfdb
 * @version 1.0.0
 * Función: int[] obtenerExtremos(List<Integer> lista)
 * Lista de entrada: List<Integer> lista
 * Ejemplo: [5, 2, 8, 1, 9]
 * Descripción: Devuelve un arreglo de tamaño 2 donde el 
 * primer elemento es el mínimo y el segundo el máximo.
 * Resultado esperado: [1, 9].
 */
public class Ejercicio10 {
    static List<Integer> lista = new ArrayList<>(Arrays.asList(5, 2, 8, 1, 9));
    public static void main(String[] args) {
        System.out.println(Arrays.toString(obtenerExtremos(lista)));
    }

    /**
     * Obtiene los extremos de una lista.
     * @param lista de la que obtener los extremos.
     * @return un array con el minimo y el maximo.
     */
    public static int[] obtenerExtremos(List<Integer> lista) {
        if(lista == null || lista.isEmpty()) return new int[0];
        int minimo = Collections.min(lista);
        int maximo = Collections.max(lista);
        return new int[] {minimo, maximo};
    }
}
package es.ies.puerto;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/**
 * @author alexfdb
 * @version 1.0.0
 * Función: int sumarElementos(List<Integer> lista)
 * Lista de entrada: List<Integer> lista
 * Ejemplo: [1, 2, 3, 4]
 * Descripción: Devuelve la suma de todos los elementos en la lista.
 * Resultado esperado: 10.
 */
public class Ejercicio13 {
    static List<Integer> lista = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
    public static void main(String[] args) {
        int listaSumada = sumarElementos(lista);
        System.out.println(listaSumada);
    }

    /**
     * Suma los valores de los elementos de una lista.
     * @param lista de la que sumar el valor de sus elementos.
     * @return el resultado de la suma.
     */
    public static int sumarElementos(List<Integer> lista) {
        if(lista == null || lista.isEmpty()) return 0;
        int suma = lista.stream().mapToInt(Integer::intValue).sum();
        return suma;
    }
}
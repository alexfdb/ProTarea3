package es.ies.puerto;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/**
 * @author alexfdb
 * @version 1.0.0
 * Función: int contarMayores(List<Integer> lista, int limite)
 * Lista de entrada: List<Integer> lista
 * Ejemplo: [10, 20, 30, 40]
 * Descripción: Devuelve la cantidad de elementos en la lista que son mayores que limite.
 * Resultado esperado con limite=25: 2.
 */
public class Ejercicio12 {
    static List<Integer> lista = new ArrayList<>(Arrays.asList(null));
    public static void main(String[] args) {
        int resiltado = contarMayores(lista, 25);
        System.out.println(resiltado);
    }

    /**
     * Cuenta los elementos con un valor mayor que el indicado.
     * @param lista en la que contar.
     * @param limite a partir del cual contar.
     * @return el numero de elementos los cuales su valor supera el limite.
     */
    public static int contarMayores(List<Integer> lista, int limite) {
        if(lista == null || lista.isEmpty()) return -1;
        return (int) lista.stream()
                          .filter(numero -> numero != null && numero > limite)
                          .count();
    }
}
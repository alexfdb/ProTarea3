package es.ies.puerto;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/**
 * @author alexfdb
 * @version 1.0.0
 * Función: List<Integer> duplicarElementos(List<Integer> lista)
 * Lista de entrada: List<Integer> lista
 * Ejemplo: [1, 2, 3]
 * Descripción: Duplica todos los elementos de la lista original y devuelve la lista modificada.
 * Resultado esperado: [2, 4, 6].
 */
public class Ejercicio3 {
    static List<Integer> lista = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
    public static void main(String[] args) {
        System.out.println(duplicarElementos(lista));
    }

    /**
     * Duplica el valor de los elmentos de una lista.
     * @param lista a la que duplicar el valor de sus elementos.
     * @return una nueva lista con los valores de la original duplicados.
     */
    public static List<Integer> duplicarElementos(List<Integer> lista) {
        List<Integer> duplicado = new ArrayList<>();
        if(lista == null || lista.isEmpty()) return lista;
        for (Integer numero : lista) {
            duplicado.add(numero * 2);
        }
        return duplicado;
    }
}
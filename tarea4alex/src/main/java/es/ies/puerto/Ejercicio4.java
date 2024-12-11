package es.ies.puerto;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Vector;
import java.util.stream.Collectors;
/**
 * @author alexfdb
 * @version 1.0.0
 * Descripción: Copiar números pares de un vector a otro.
 * Métodos a utilizar: add(), get(), addAll().
 * Resultado esperado: Vector original: [1, 2, 3, 4, 5]. Vector pares: [2, 4].
 */
public class Ejercicio4 {
    static Vector<Integer> numeros1 = new Vector<>(Arrays.asList(1, 2, 3, 4, 5));
    public static void main(String[] args) {
        Vector<Integer> numeros2 = new Vector<>(copiarElementosPares(numeros1));
        System.out.println(numeros2);
    }

    /**
     * Copia en una nueva lista solo los números pares si los hubiera.
     * @param lista de la que copiar los números pares.
     * @return una nueva lista solo con los números pares de la lista original.
     */
    public static List<Integer> copiarElementosPares(List<Integer> lista) {
        if(lista == null || lista.isEmpty()) return new ArrayList<>();
        return lista.stream()
                    .filter(numero -> numero % 2 == 0)
                    .collect(Collectors.toList());
    }
}
package es.ies.puerto;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/**
 * @author alexfdb
 * @version 1.0.0
 * Función: List<Integer> copiarLista(List<Integer> lista)
 * Lista de entrada: List<Integer> lista
 * Ejemplo: [1, 2, 3]
 * Descripción: Crea y devuelve una copia exacta de la lista original.
 * Resultado esperado: [1, 2, 3].
 */
public class Ejercicio11 {
    static List<Integer> lista = new ArrayList<>(Arrays.asList(1, 2, 3));
    public static void main(String[] args) {
        List<Integer> listaCopia = copiarLista(lista);
        System.out.println(listaCopia);
    }

    /**
     * Copia una lista y devuelve su copia.
     * @param lista a la que copiar.
     * @return la copia de la lista original.
     */
    public static List<Integer> copiarLista(List<Integer> lista) {
        if(lista == null || lista.isEmpty()) return new ArrayList<>();
        return new ArrayList<>(lista);
    }
}
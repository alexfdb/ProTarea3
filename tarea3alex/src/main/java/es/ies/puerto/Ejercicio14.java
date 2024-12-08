package es.ies.puerto;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/**
 * @author alexfdb
 * @version 1.0.0
 * Función: List<Integer> encontrarDuplicados(List<Integer> lista)
 * Lista de entrada: List<Integer> lista
 * Ejemplo: [1, 2, 2, 3, 3, 4]
 * Descripción: Devuelve una nueva lista con los elementos que aparecen más de una vez.
 * Resultado esperado: [2, 3].
 */
public class Ejercicio14 {
    static List<Integer> lista = new ArrayList<>(Arrays.asList(1, 2, 2, 3, 3, 4));
    public static void main(String[] args) {
        List<Integer> listaDeDuplicados = encontrarDuplicados(lista);
        System.out.println(listaDeDuplicados);
    }

    /**
     * Encuentra duplicados en una lista y crea una nueva lista con ellos.
     * @param lista en la que buscar los duplicados.
     * @return una nueva lista solo con los duplicados.
     */
    public static List<Integer> encontrarDuplicados(List<Integer> lista) {
        if(lista == null || lista.isEmpty()) return new ArrayList<>();
        List<Integer> listaDuplicados = new ArrayList<>();
        for (int i = 0; i < lista.size(); i++) {
            Integer numero = lista.get(i);
            if(!listaDuplicados.contains(numero)) {
                for (int j = i + 1; j < lista.size(); j++) {
                    if(lista.get(j).equals(numero)) {
                        listaDuplicados.add(numero);
                        break;
                    }
                }
            }
        }
        
        return listaDuplicados;
    }
}
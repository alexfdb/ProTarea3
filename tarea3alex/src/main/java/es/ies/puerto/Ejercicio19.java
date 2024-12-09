package es.ies.puerto;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/**
 * @author alexfdb
 * @version 1.0.0
 * Función: boolean esSublista(List<Integer> lista, List<Integer> sublista)
 * Lista de entrada: List<Integer> lista, List<Integer> sublista
 * Ejemplo: lista = [1, 2, 3, 4, 5], sublista = [3, 4]
 * Descripción: Devuelve true si sublista es una subsecuencia de lista.
 * Resultado esperado con sublista=[3, 4]: true.
 */
public class Ejercicio19 {
    static List<Integer> lista = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
    static List<Integer> subLista = new ArrayList<>(Arrays.asList(3, 4));
    public static void main(String[] args) {
        System.out.println(esSublista(lista, subLista));
    }

    /**
     * Comprueba si una sublista pertenece a una lista.
     * @param lista en la que buscar.
     * @param sublista que buscar.
     * @return true si encuentra la sublista en la lista.
     */
    public static boolean esSublista(List<Integer> lista, List<Integer> sublista) {
        if(lista == null || lista.isEmpty()) return false;
        if(sublista == null || sublista.isEmpty()) return false;
        for (int i = 0; i < lista.size() - sublista.size(); i++) {
            boolean coincide = true;
            for (int j = 0; j < sublista.size(); j++) {
                if(!lista.get(i + j).equals(sublista.get(j))) {
                    coincide = false;
                    break;
                }
            }
            
            if(coincide) return true;
        }

        return false;
    }
}
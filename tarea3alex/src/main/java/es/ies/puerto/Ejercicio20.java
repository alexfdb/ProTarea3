package es.ies.puerto;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
/**
 * @author alexfdb
 * @version 1.0.0
 * Función: List<Integer> barajarLista(List<Integer> lista)
 * Lista de entrada: List<Integer> lista
 * Ejemplo: [1, 2, 3, 4]
 * Descripción: Reorganiza los elementos de la lista en un orden aleatorio y la devuelve.
 * Resultado esperado: [4, 3, 1, 2] (El orden puede variar).
 */
public class Ejercicio20 {
    static List<Integer> lista = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
    public static void main(String[] args) {
        barajarLista(lista);
        System.out.println(lista);
    }

    /**
     * Aleatoriza las posiciones de los elementos de la lista.
     * @param lista cuyos elementos se deben aleatorizar.
     * @return la lista con los elementos en orden aleatorio.
     */
    public static List<Integer> barajarLista(List<Integer> lista) {
        if(lista == null || lista.isEmpty()) return new ArrayList<>();
        Collections.shuffle(lista);
        return lista;
    }
}
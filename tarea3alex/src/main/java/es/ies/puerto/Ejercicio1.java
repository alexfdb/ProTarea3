package es.ies.puerto;
import java.util.ArrayList;
import java.util.List;
/**
 * @author alexfdb
 * @version 1.0.0
 * Función: List<Integer> crearListaConsecutiva(int inicio, int cantidad)
 * Lista de entrada: N/A
 * Descripción: Crea una lista de cantidad números consecutivos comenzando desde inicio y la devuelve.
 */
public class Ejercicio1 {
    public static void main(String[] args) {
        List<Integer> listaConsecutiva = crearListaConsecutiva(0, 0);
        System.out.println(listaConsecutiva);
    }

    /**
     * Función que crea una lista de numeros consecutivos.
     * @param inicio con que numero comienza la lista.
     * @param cantidad de números en la lista.
     * @return la lista con los números consecutivos especificados.
     */
    public static List<Integer> crearListaConsecutiva(int inicio, int cantidad) {
        List<Integer> lista = new ArrayList<>();
        for (int i = inicio; i < (cantidad + inicio); i++) {
            lista.add(i);
        }
        return lista;
    }

}
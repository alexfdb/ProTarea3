package es.ies.puerto;
import java.util.ArrayList;
import java.util.List;
/**
 * @author alexfdb
 * @version 1.0.0
 * Llena una lista con números del 1 al 30. Divide la lista en 
 * sublistas de 5 elementos cada una usando un bucle y subList().
 */
public class Ejercicio11 {
    public static void main(String[] args) {
        List<Integer> enteros = crearListaEnteros(30);
        List<List<Integer>> sublistas = dividirLista(enteros, 5);
        for (List<Integer> sublista : sublistas) {
            System.out.println(sublista);
        }

    }

    /**
     * Función que crea una lista de números enteros.
     * @param tamanio de la lista.
     * @return una lista con los números especificados
     */
    public static List<Integer> crearListaEnteros(int tamanio) {
        List<Integer> numeros = new ArrayList<>();
        for (int i = 1; i <= tamanio; i++) {
            numeros.add(i);
        }
        return numeros;
    }

    /**
     * Función que divide una lista en tantas como sean especificadas.
     * @param lista a operar.
     * @param tamanio de las sublistas.
     * @return las sublistas creadas.
     */
    public static List<List<Integer>> dividirLista(List<Integer> lista, int tamanio) {
        List<List<Integer>> sublistas = new ArrayList<>();
        for (int i = 0; i < lista.size(); i += tamanio) {
            int fin = Math.min(i + tamanio, lista.size());
            sublistas.add(lista.subList(i, fin));
        }
        return sublistas;
    }

}
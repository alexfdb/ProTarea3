package es.ies.puerto;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/**
 * @author alexfdb
 * @version 1.0.0
 * Función: String obtenerElemento(List<String> lista, int indice)
 * Lista de entrada: List<String> lista
 * Ejemplo: ["Hola", "Mundo", "Java"]
 * Descripción: Devuelve el elemento en el índice especificado de la lista. Si el índice es inválido, lanza el mensaje "Error".
 */
public class Ejercicio2 {
    static List<String> lista = new ArrayList<>(Arrays.asList("Hola", "Mundo", "Java"));
    public static void main(String[] args) {
        System.out.println(obtenerElemento(lista, 0));
    }

    /**
     * Obtiene un elemento de una lista por medio de su indice.
     * @param lista en la que buscar.
     * @param indice en el cual buscar el elemento.
     * @return el elemento buscado.
     */
    public static String obtenerElemento(List<String> lista, int indice) {
        String vacio = "";
        if(lista == null || lista.isEmpty()) return vacio;
        if(indice < 0 || indice > lista.size()) return vacio;
        return lista.get(indice);
    }

}
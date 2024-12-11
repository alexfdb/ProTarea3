package es.ies.puerto;
import java.util.Arrays;
import java.util.List;
import java.util.Vector;
/**
 * @author alexfdb
 * @version 1.0.0
 * Descripción: Verificar si un país ingresado por el usuario está en el vector.
 * Métodos a utilizar: add(), contains().
 * Resultado esperado: País: "España". Resultado: true o false.
 */
public class Ejercicio6 {
    static Vector<String> paises = new Vector<>(Arrays.asList("España", "Italia"));
    public static void main(String[] args) {
        System.out.println(verificarPresenciaElemento(paises, "España"));
    }

    /**
     * Verifica la presencia de un elemento en la lista.
     * @param lista en la que buscar el elemento.
     * @param elemento a buscar en la lista.
     * @return true si el elemento se encuentra en la lista.
     */
    public static boolean verificarPresenciaElemento(List<String> lista, String elemento) {
        if(lista == null || lista.isEmpty()) return false;
        if(elemento == null || elemento.isEmpty()) return false;
        return lista.contains(elemento);
    }

}
package es.ies.puerto;
import java.util.Arrays;
import java.util.List;
import java.util.Vector;
/**
 * @author alexfdb
 * @version 1.0.0
 * Descripción: Contar cuántos nombres tienen más de cinco caracteres.
 * Métodos a utilizar: add(), size(), length().
 * Resultado esperado: [Ana, Francisco, María, Alejandro]. Resultado: 2.
 */
public class Ejercicio7 {
    static Vector<String> nombres = new Vector<>(Arrays.asList("Ana", "Francisco", "María", "Alejandro"));
    public static void main(String[] args) {
    }

    /**
     * Cuenta cuantos nombres exceden de la cantidad indicada.
     * @param lista en la que buscar.
     * @param cantidad por la cual si el tamanio del nombre la excede cuenta uno.
     * @return el conteo de los nombres que exceden la cantidad indicada.
     */
    public static int contarNombresLargos(List<String> lista, int cantidad) {
        if(lista == null || lista.isEmpty()) return -1;
        if(cantidad < 0) return -1;
        int contador = 0;
        for (String string : lista) {
            if(string.length() > cantidad) {
                contador += 1;
            }
        }
        return contador;
    }
}
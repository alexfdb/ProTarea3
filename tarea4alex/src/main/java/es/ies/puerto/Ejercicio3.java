package es.ies.puerto;
import java.util.Arrays;
import java.util.List;
import java.util.Vector;
/**
 * @author alexfdb
 * @version 1.0.0
 * Descripción: Eliminar colores que comiencen con "A".
 * Métodos a utilizar: add(), remove(), startsWith().
 * Resultado esperado: Vector antes: [Azul, Amarillo, Verde, Anaranjado]. Vector después: [Verde].
 */
public class Ejercicio3 {
        static Vector<String> colores = new Vector<>(Arrays.asList("Azul", "Amarillo", "Verde", "Anaranjado"));
        public static void main(String[] args) {
            eliminarPorCondicion(colores, "a");
            System.out.println(colores);
    }

    /**
     * Elimina los elementos que comiencen por la inicial indicada.
     * @param lista a la que eliminar por condicion.
     * @param inicial por la cual se elminaran las palabras que comiencen por ella.
     * @return true si se han eliminado elementos.
     */
    public static Boolean eliminarPorCondicion(List<String> lista, String inicial) {
        if(lista == null || lista.isEmpty()) return false;
        if(inicial == null || inicial.isEmpty()) return false;
        return lista.removeIf(palabra -> palabra.toLowerCase().startsWith(inicial));
    }
}
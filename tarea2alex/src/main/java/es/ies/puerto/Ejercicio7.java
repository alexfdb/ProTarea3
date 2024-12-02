package es.ies.puerto;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/**
 * @author alexfdb
 * @version 1.0.0
 * Llena una lista con palabras repetidas. Usa una List temporal para identificar 
 * y eliminar duplicados, manteniendo el orden de aparición original.
 */
public class Ejercicio7 {
    public static void main(String[] args) {
        List<String> palabras = new ArrayList<>(Arrays.asList("Paisaje", "Martes","Paisaje"));
        List<String> palabrasSinDuplicar = eliminarDuplicados(palabras);
        System.out.println(palabrasSinDuplicar);
    }

    /**
     * Función que retorna una lista sin duplicados.
     * @param lista a copiar para retornar otra sin duplicados.
     * @return una nueva lista sin duplicados.
     */
    public static List<String> eliminarDuplicados(List<String> lista) {
        if(lista == null) return null;
        List<String> listaTemporal = new ArrayList<>();
        for (String palabra : lista) {
            if(!listaTemporal.contains(palabra)) {
                listaTemporal.add(palabra);
            }
        }
        return listaTemporal;
    }
}
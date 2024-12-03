package es.ies.puerto;
import java.util.ArrayList;
import java.util.List;
/**
 * @author alexfdb
 * @version 1.0.0
 * Llena una lista con nombres. Usa set() para reemplazar todos los 
 * nombres que comienzan con una letra específica con un nuevo valor.
 */
public class Ejercicio19 {
    public static void main(String[] args) {
        List<String> nombres = new ArrayList<>();
        nombres.add("Ana");
        nombres.add("Carlos");
        nombres.add("Alejandro");
        nombres.add("Juan");
        nombres.add("Amalia");

        char letraEspecifica = 'A';
        String nuevoNombre = "Generico";

        reemplazarNombres(nombres, letraEspecifica, nuevoNombre);

        System.out.println(nombres);
    }

    /**
     * Reemplaza todos los nombres que comienzan con una letra específica por un nuevo valor.
     * @param lista La lista de nombres.
     * @param letra La letra con la que comienza el nombre.
     * @param nuevoNombre El nombre con el que se reemplazará.
     */
    public static void reemplazarNombres(List<String> lista, char letra, String nuevoNombre) {
        for (int i = 0; i < lista.size(); i++) {
            String nombre = lista.get(i);
            if (nombre.charAt(0) == letra) {
                lista.set(i, nuevoNombre);
            }
        }
    }
}
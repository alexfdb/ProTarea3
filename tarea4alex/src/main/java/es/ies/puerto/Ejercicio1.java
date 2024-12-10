package es.ies.puerto;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
/**
 * @author alexfdb
 * @version 1.0.0
 * Descripción: Crear un vector de tipo String y agregar cinco nombres de frutas.
 * Métodos a utilizar: add(), toString().
 * Resultado esperado: [Manzana, Banana, Cereza, Mango, Uva].
 */
public class Ejercicio1 {
    public static void main(String[] args) {
        Vector<String> frutas = new Vector<>(crearVectorFrutas());
        System.out.println(frutas);
    }

    /**
     * Añade si el elemento no es null.
     * @param lista al que añadir.
     * @param elemento que añadir.
     * @return true si el elemento fue añadido.
     */
    public static Boolean addSinNull(List<String> lista, String elemento) {
        if(lista == null) return false;
        if(elemento == null || elemento.isEmpty()) return false;
        lista.add(elemento);
        return true;
    }

    /**
     * Crea un vector con las frutas indicadas en el ejercicio.
     * @return el vector con las frutas indicadas en el jercicio.
     */
    public static List<String> crearVectorFrutas() {
        List<String> frutas = new ArrayList<>();
        addSinNull(frutas, "manzana");
        addSinNull(frutas, "Banana");
        addSinNull(frutas, "Cereza");
        addSinNull(frutas, "Mango");
        addSinNull(frutas, "Uva");
        return frutas;
    }
}
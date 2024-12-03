package es.ies.puerto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/**
 * @author alexfdb
 * @version 1.0.0
 * Crea una lista de listas. Agrega elementos a sublistas específicas según su 
 * posición. Permite mover elementos entre sublistas y elimina sublistas vacías.
 */
public class Ejercicio20 {
    public static void main(String[] args) {
        List<List<String>> listaDeListas = new ArrayList<>();
        
        listaDeListas.add(creaLista());
        listaDeListas.add(creaLista());
        listaDeListas.add(creaLista());

        addElemento(listaDeListas.get(0), "Elemento1");
        addElemento(listaDeListas.get(1), "Elemento2");
        addElemento(listaDeListas.get(2), "Elemento3");

        System.out.println("Lista de listas después de agregar elementos:");
        System.out.println(listaDeListas);

        moverElemento(listaDeListas.get(0), listaDeListas.get(1), "Elemento1");

        System.out.println("\nLista de listas después de mover el elemento:");
        System.out.println(listaDeListas);

        deleteProducto(listaDeListas.get(0), "Elemento2");

        System.out.println("\nLista de listas después de eliminar sublistas vacías:");
        System.out.println(listaDeListas);
    }

    /**
     * Función que crea una lista.
     * @return una lista vacía.
     */
    static List<String> creaLista() {
        return new ArrayList<>();
    }

    /**
     * Función que agrega un producto a una lista.
     * @param lista a la que añadir.
     * @param producto a añadir.
     * @return false si la lista o el producto es null.
     */
    static boolean addElemento(List<String> lista, String elemento) {
        if(lista == null || elemento == null) return false;
        return lista.add(elemento);
    }

    /**
     * Función que elimina un producto de una lista.
     * @param lista donde eliminar el producto
     * @param producto a eliminar.
     * @return
     */
    static boolean deleteProducto(List<String> lista, String producto) {
        if(lista == null || lista.isEmpty() || producto == null) return false;
        return lista.remove(producto);
    }

    /**
     * Funcíon que mueve un producto de una lista a otra.
     * @param listaOrigen
     * @param listaDestino
     * @param producto a mover.
     * @return true si el prducto fue movido.
     */
    static boolean moverElemento(List<String> listaOrigen, List<String> listaDestino, String producto) {
        if(!listaOrigen.contains(producto) || listaDestino.contains(producto)) return false;
        deleteProducto(listaOrigen, producto);
        return addElemento(listaDestino, producto);
    }
}
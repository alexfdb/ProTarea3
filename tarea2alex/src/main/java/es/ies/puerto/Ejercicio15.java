package es.ies.puerto;
import java.util.ArrayList;
import java.util.List;
/**
 * @author alexfdb
 * @version 1.0.0
 * Crea una lista de listas donde cada sublista representa una categoría de productos. 
 * Implementa métodos para agregar productos a una categoría, mover un producto entre 
 * categorías, y eliminar categorías vacías.
 */
public class Ejercicio15 {
    static List<List<String>> productos = new ArrayList<>();
    static int electronica = 0;
    static int libro = 1;
    static int ropa = 2;
    public static void main(String[] args) {
        productos.add(crearLista());
        productos.add(crearLista());
        productos.add(crearLista());
        addProducto(productos.get(ropa),"Pantalón");
        addProducto(productos.get(ropa),"Camiseta");
        addProducto(productos.get(ropa),"Polo");
        addProducto(productos.get(electronica),"Cascos");
        System.out.println(productos);
    }

    /**
     * Función que crea una lista.
     * @return una lista vacía.
     */
    static List<String> crearLista() {
        return new ArrayList<>();
    }

    /**
     * Función que agrega un producto a una lista.
     * @param lista a la que añadir.
     * @param producto a añadir.
     * @return false si la lista o el producto es null.
     */
    static boolean addProducto(List<String> lista, String producto) {
        if(lista == null || producto == null) return false;
        return lista.add(producto);
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
    static boolean moverProducto(List<String> listaOrigen, List<String> listaDestino, String producto) {
        if(!listaOrigen.contains(producto) || listaDestino.contains(producto)) return false;
        deleteProducto(listaOrigen, producto);
        return addProducto(listaDestino, producto);
    }

    /**
     * Función que elimina una sublista si sta vacía.
     * @param lista madre.
     * @param posicion de la sublista.
     * @return true si la sublista fue eliminada.
     */
    static boolean deleteSubListaEmpty(List<List<String>> lista, int posicion) {
        if(lista == null || lista.isEmpty()) return false;
        if(lista.get(posicion).isEmpty()) {
            lista.remove(posicion);
            return true;
        }
        return false;
    }
}
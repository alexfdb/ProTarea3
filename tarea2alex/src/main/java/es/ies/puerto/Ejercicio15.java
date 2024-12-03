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
    public static void main(String[] args) {
        List<List<String>> categorias = new ArrayList<>();
        categorias.add(new ArrayList<>());
        categorias.add(new ArrayList<>());
        categorias.add(new ArrayList<>());

        agregarProducto(categorias, 0, "Manzanas");
        agregarProducto(categorias, 1, "Leche");
        agregarProducto(categorias, 1, "Queso");
        System.out.println("Estado inicial: " + categorias);

        moverProducto(categorias, 1, 2, "Leche");
        System.out.println("Después de mover: " + categorias);

        eliminarCategoriasVacias(categorias);
        System.out.println("Después de eliminar vacías: " + categorias);
    }

    /**
     * Agrega un producto a la categoría indicada.
     * @param categorias Lista de categorías.
     * @param indiceCategoría Índice de la categoría.
     * @param producto Producto a agregar.
     */
    public static void agregarProducto(List<List<String>> categorias, int indiceCategoría, String producto) {
        if (indiceCategoría >= 0 && indiceCategoría < categorias.size()) {
            categorias.get(indiceCategoría).add(producto);
        }
    }

    /**
     * Mueve un producto de una categoría a otra.
     * @param categorias Lista de categorías.
     * @param origen Índice de la categoría de origen.
     * @param destino Índice de la categoría de destino.
     * @param producto Producto a mover.
     */
    public static void moverProducto(List<List<String>> categorias, int origen, int destino, String producto) {
        if (origen >= 0 && origen < categorias.size() && destino >= 0 && destino < categorias.size()) {
            List<String> categoriaOrigen = categorias.get(origen);
            List<String> categoriaDestino = categorias.get(destino);

            if (categoriaOrigen.remove(producto)) {
                categoriaDestino.add(producto);
            }
        }
    }

    /**
     * Método que elimina todas las categorías vacías de la lista principal.
     * @param categorias Lista de categorías.
     */
    public static void eliminarCategoriasVacias(List<List<String>> categorias) {
        categorias.removeIf(List::isEmpty);
    }
}
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
        
        listaDeListas.add(new ArrayList<>());
        listaDeListas.add(new ArrayList<>());
        listaDeListas.add(new ArrayList<>());

        agregarElementoSublista(listaDeListas, 0, "Elemento 1");
        agregarElementoSublista(listaDeListas, 1, "Elemento 2");
        agregarElementoSublista(listaDeListas, 2, "Elemento 3");

        System.out.println("Lista de listas después de agregar elementos:");
        System.out.println(listaDeListas);

        moverElemento(listaDeListas, 0, 1, "Elemento 1");

        System.out.println("\nLista de listas después de mover el elemento:");
        System.out.println(listaDeListas);

        eliminarSublistasVacias(listaDeListas);

        System.out.println("\nLista de listas después de eliminar sublistas vacías:");
        System.out.println(listaDeListas);
    }

    /**
     * Agrega un elemento a una sublista específica dentro de la lista de listas.
     * @param listaDeListas La lista que contiene las sublistas.
     * @param sublistaIndex El índice de la sublista donde se agregará el elemento.
     * @param elemento El elemento que se agregará a la sublista.
     */
    public static void agregarElementoSublista(List<List<String>> listaDeListas, int sublistaIndex, String elemento) {
        if (sublistaIndex >= 0 && sublistaIndex < listaDeListas.size()) {
            listaDeListas.get(sublistaIndex).add(elemento);
        } else {
            System.out.println("Índice de sublista no válido.");
        }
    }

    /**
     * Mueve un elemento de una sublista a otra.
     * @param listaDeListas La lista que contiene las sublistas.
     * @param fromIndex El índice de la sublista de origen.
     * @param toIndex El índice de la sublista de destino.
     * @param elemento El elemento que se moverá.
     */
    public static void moverElemento(List<List<String>> listaDeListas, int fromIndex, int toIndex, String elemento) {
        if (fromIndex >= 0 && fromIndex < listaDeListas.size() &&
            toIndex >= 0 && toIndex < listaDeListas.size()) {
            List<String> fromSublista = listaDeListas.get(fromIndex);
            List<String> toSublista = listaDeListas.get(toIndex);
            
            if (fromSublista.contains(elemento)) {
                fromSublista.remove(elemento);
                toSublista.add(elemento);
            } else {
                System.out.println("El elemento no existe en la sublista de origen.");
            }
        } else {
            System.out.println("Índice de sublistas no válido.");
        }
    }

    /**
     * Elimina las sublistas vacías de la lista de listas.
     * @param listaDeListas La lista que contiene las sublistas.
     */
    public static void eliminarSublistasVacias(List<List<String>> listaDeListas) {
        Iterator<List<String>> iterator = listaDeListas.iterator();
        while (iterator.hasNext()) {
            List<String> sublista = iterator.next();
            if (sublista.isEmpty()) {
                iterator.remove();
            }
        }
    }
}
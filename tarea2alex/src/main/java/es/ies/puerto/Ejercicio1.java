package es.ies.puerto;
import java.util.ArrayList;
import java.util.List;
/**
 * @author alexfdb
 * @version 1.0.0
 * Verifica si una lista está vacía utilizando isEmpty(). Si está vacía, rellénala 
 * con números del 1 al 10 . Si no está vacía, elimina todos los números menores 
 * que 5 usando removeIf().
 */
public class Ejercicio1 {
    public static void main(String[] args) {
        List<Integer> listaVacia = new ArrayList<>();
        modificarLista(listaVacia);
        System.out.println("Lista vacía.");
        System.out.println(listaVacia);

        List<Integer> listaConElementos = new ArrayList<>(List.of(1, 2, 3, 6, 7, 8));
        modificarLista(listaConElementos);
        System.out.println("Lista con elementos.");
        System.out.println(listaConElementos);
    }

    /**
     * Método que verifica si una lista está vacía antes de agregar elementos.
     * Si está vacía, rellena la lista con números del 1 al 10.
     * Si no está vacía, elimina todos los números menores que 5.
     * @param lista a modificar.
     */
    public static void modificarLista(List<Integer> lista) {
        if(lista == null) return;
        if(lista.isEmpty()) {
            for (int i = 1; i <= 10; i++) {
                lista.add(i);
            }
        } else {
            lista.removeIf(entero -> entero < 5);
        }
    }
}
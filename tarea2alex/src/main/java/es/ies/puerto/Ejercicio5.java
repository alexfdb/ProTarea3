package es.ies.puerto;
import java.util.ArrayList;
import java.util.List;
/**
 * @author alexfdb
 * @version 1.0.0
 * Llena una lista con números del 1 al 20 (forEach y add). Muestra el tamaño 
 * inicial con size(). Elimina los múltiplos de 3 utilizando removeIf(). Muestra 
 * el tamaño de la lista después de la operación.
 */
public class Ejercicio5 {
    public static void main(String[] args) {
        List<Integer> lista = new ArrayList<>();
        agregarNumerosDel1Al20(lista);
        eliminarSiEsMultiplo(lista, 3);
        System.out.println(lista);
    }

    /**
     * Método para añadir 20 numeros a una lista. 
     * @param lista lista a la que añadir.
     */
    public static void agregarNumerosDel1Al20(List<Integer> lista) {
        for (int i = 1; i <= 20; i++) {
            lista.add(i);
        }
    }

    /**
     * Método para eliminar los elementos de la lista que sean multiplos del valor indicado.
     * @param lista a operar.
     * @param valor del multiplo.
     */
    public static void eliminarSiEsMultiplo(List<Integer> lista, int valor) {
        if(lista == null || lista.isEmpty()) return;
        lista.removeIf(numero -> numero % valor == 0);
    }
}
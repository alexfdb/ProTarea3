package es.ies.puerto;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/**
 * @author alexfdb
 * @version 1.0.0
 * Crea dos listas de enteros, genera auna tercera lista solo los elementos que 
 * están en una de las dos listas pero no en ambas, usando addAll(), retainAll() 
 * y removeAll().
 */
public class Ejercicio4 {
    public static void main(String[] args) {
        List<Integer> enteros1 = new ArrayList<>(Arrays.asList(1, 2, 3));
        List<Integer> enteros2 = new ArrayList<>(Arrays.asList(1, 2, 4));
        List<Integer> listaSinRepetidos = obtenerUnicosDeDosListas(enteros1, enteros2);
        System.out.println(listaSinRepetidos);
        System.out.println(enteros1);
        System.out.println(enteros2);
    }

    /**
     * Función que crea una lista con los elementos que no se repiten.
     * @param lista1 a copiar sin repetir.
     * @param lista2 a copiar sin repetir.
     * @return la nueva lista sin elementos repetidos.
     */
    public static List<Integer> obtenerUnicosDeDosListas(List<Integer> lista1, List<Integer> lista2) {
        List<Integer> lista1Copia = new ArrayList<>(lista1);
        List<Integer> lista2Copia = new ArrayList<>(lista2);
        List<Integer> listaNueva = new ArrayList<>();
        listaNueva.addAll(lista1Copia);
        listaNueva.removeAll(lista2Copia);
        lista2Copia.removeAll(lista1Copia);
        listaNueva.addAll(lista2Copia);
        return listaNueva;
    }
}
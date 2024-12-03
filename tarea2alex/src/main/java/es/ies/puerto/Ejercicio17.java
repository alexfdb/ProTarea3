package es.ies.puerto;
import java.util.ArrayList;
import java.util.List;
/**
 * @author alexfdb
 * @version 1.0.0
 * Llena dos listas con nombres. Crea una tercera lista que contenga 
 * solo los nombres de la primera lista que no están en la segunda.
 */
public class Ejercicio17 {
    public static void main(String[] args) {
        List<String> lista1 = new ArrayList<>();
        lista1.add("Alex");
        lista1.add("Nico");
        lista1.add("Barbara");
        lista1.add("Lucía");
        lista1.add("Jorge");

        List<String> lista2 = new ArrayList<>();
        lista2.add("Barbara");
        lista2.add("Lucía");

        List<String> lista3 = new ArrayList<>(lista1);
        lista3.removeAll(lista2);

        System.out.println("Lista 1: " + lista1);
        System.out.println("Lista 2: " + lista2);
        System.out.println("Lista 3 (nombres de lista1 que no están en lista2): " + lista3);
    }
}
package es.ies.puerto;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Vector;
/**
 * @author alexfdb
 * @version 1.0.0
 * Descripción: Combinar dos vectores y eliminar duplicados.
 * Métodos a utilizar: add(), contains().
 * Resultado esperado: Vector A: [Perro, Gato]. Vector B: [Gato, Caballo]. Combinado: [Perro, Gato, Caballo].
 */
public class Ejercicio8 {
    static Vector<String> listaA = new Vector<>(Arrays.asList("Perro", "Gato"));
    static Vector<String> listaB = new Vector<>(Arrays.asList("Gato", "Caballo"));
    public static void main(String[] args) {
        Vector<String> solucion = new Vector<>(fusionarVectores(listaB, listaA));
        System.out.println(solucion);
    }

    /**
     * Fusiona dos listas eliminando sus duplicados.
     * @param lista1 
     * @param lista2
     * @return una nueva lista sin duplicados.
     */
    public static List<String> fusionarVectores(List<String> lista1, List<String> lista2) {
        if(lista1 == null || lista1.isEmpty()) return new ArrayList<>();
        if(lista2 == null || lista2.isEmpty()) return new ArrayList<>();
        List<String> resultado = new ArrayList(Arrays.asList(lista1));
        for (String objeto : lista2) {
            if(!resultado.contains(objeto)) {
                resultado.add(objeto);
            }
        }
        return new ArrayList<>(new HashSet<>(resultado));
    }
}
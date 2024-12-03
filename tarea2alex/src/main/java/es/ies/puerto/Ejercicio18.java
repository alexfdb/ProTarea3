package es.ies.puerto;
import java.util.ArrayList;
import java.util.List;
/**
 * @author alexfdb
 * @version 1.0.0
 * Llena una lista con números. Implementa un método que tome un 
 * número k y rote la lista k posiciones hacia la izquierda.
 */
public class Ejercicio18 {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>(crearListaEnteros(10));

        System.out.println("Lista original: " + numeros);

        rotarLista(numeros, 3);

        System.out.println("Lista rotada: " + numeros);
    }

    /**
     * Función que crea una lista de números enteros.
     * @param tamanio de la lista.
     * @return una lista con los números especificados
     */
    public static List<Integer> crearListaEnteros(int tamanio) {
        List<Integer> numeros = new ArrayList<>();
        for (int i = 1; i <= tamanio; i++) {
            numeros.add(i);
        }
        return numeros;
    }

    /**
     * Método que rota una lista k posiciones hacia la izquierda.
     * @param lista La lista que se desea rotar.
     * @param k El número de posiciones hacia la izquierda a rotar.
     */
    public static boolean rotarLista(List<Integer> lista, int k) {
        if(lista == null || lista.isEmpty()) return false; 
        if(k == lista.size() || k < 0) return false;

        List<Integer> sublistaIzquierda = new ArrayList<>(lista.subList(0, k));
        List<Integer> sublistaDerecha = new ArrayList<>(lista.subList(k, lista.size()));

        lista.clear();
        lista.addAll(sublistaDerecha);
        lista.addAll(sublistaIzquierda);
        return true;
    }
}
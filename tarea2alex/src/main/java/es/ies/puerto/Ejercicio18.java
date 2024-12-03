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
        List<Integer> numeros = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            numeros.add(i);
        }

        System.out.println("Lista original: " + numeros);

        int k = 3;

        rotarLista(numeros, k);

        System.out.println("Lista después de rotar " + k + " posiciones: " + numeros);
    }

    /**
     * Método que rota una lista k posiciones hacia la izquierda.
     * @param lista La lista que se desea rotar.
     * @param k El número de posiciones hacia la izquierda a rotar.
     */
    public static void rotarLista(List<Integer> lista, int k) {
        int size = lista.size();
        if (size == 0 || k % size == 0) {
            return;
        }
    
        k = k % size;
    
        List<Integer> sublistaIzquierda = new ArrayList<>(lista.subList(0, k));
        List<Integer> sublistaDerecha = new ArrayList<>(lista.subList(k, size));
    
        lista.clear();
        lista.addAll(sublistaDerecha);
        lista.addAll(sublistaIzquierda);
    }
}
package es.ies.puerto;
import java.util.ArrayList;
import java.util.List;
/**
 * @author alexfdb
 * @version 1.0.0
 * Llena una lista con números. Crea dos sublistas: una con números pares y otra con números 
 * impares. Fusiona ambas sublistas en la lista original, colocando los impares primero.
 */
public class Ejercicio13 {
    public static void main(String[] args) {
        List<Integer> numeros = crearListaEnteros(20);

        System.out.println(numeros);

        separarYFusionar(numeros);

        System.out.println(numeros);
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
     * Método que separa una lista en números pares e impares. 
     * Fusiona las sublistas de modo que los impares
     * aparezcan primero en la lista original.
     * @param lista a operar.
     */
    public static void separarYFusionar(List<Integer> lista) {
        List<Integer> impares = new ArrayList<>();
        List<Integer> pares = new ArrayList<>();

        for (Integer numero : lista) {
            if (numero % 2 == 0) {
                pares.add(numero);
            } else {
                impares.add(numero);
            }
        }

        lista.clear();
        lista.addAll(impares);
        lista.addAll(pares);
    }
}
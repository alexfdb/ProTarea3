package es.ies.puerto;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/**
 * @author alexfdb
 * @version 1.0.0
 * Escribe un método que reciba dos listas de enteros. Si alguna está vacía (isEmpty()), 
 * rellénala con números impares del 1 al 10. Si ambas están llenas, crea una tercera 
 * lista con el producto de los elementos en las mismas posiciones.
 */
public class Ejercicio6 {
    public static void main(String[] args) {
        List<Integer> enteros1 = new ArrayList<>();
        List<Integer> enteros2 = new ArrayList<>(Arrays.asList(1, 2, 3));
        agregarDe1A10SiListaVacia(enteros1);
        agregarDe1A10SiListaVacia(enteros2);
        List<Integer> enterosMultiplicados = productoDeLosElementos(enteros1, enteros2);
        System.out.println(enterosMultiplicados);
    }

    /**
     * Fusnción que agrega del 1 al 10 si la lista esta vacía.
     * @param lista a agregar los números del 1 al 10 si esta vacía..
     * @return true si la lista esta vacía y se le agregan los números del 1 al 10.
     */
    public static boolean agregarDe1A10SiListaVacia(List<Integer> lista) {
        if(lista == null) return false;
        if(lista.isEmpty()) {
            for (int i = 1; i <= 10; i++) {
                lista.add(i);
            }
            return true;
        }
        return false;
    }

    /**
     * Función que multiplica dos listas y retorna una tercera con los resultados.
     * @param lista1
     * @param lista2
     * @return la lista con los resultados.
     */
    public static List<Integer> productoDeLosElementos(List<Integer> lista1, List<Integer> lista2) {
        if(lista1 == null || lista2 == null) return null;
        if(lista1.isEmpty() && lista2.isEmpty()) return null;
        int tamanioMinimo = Math.min(lista1.size(), lista2.size());
        List<Integer> listaNueva = new ArrayList<>();
            for (int i = 0; i < tamanioMinimo; i++) {
                int producto = lista1.get(i) * lista2.get(i);
                listaNueva.add(producto);
            }
        return listaNueva;
    }
}
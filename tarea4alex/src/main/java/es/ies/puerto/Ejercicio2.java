package es.ies.puerto;
import java.util.Arrays;
import java.util.List;
import java.util.Vector;
/**
 * @author alexfdb
 * @version 1.0.0
 * Descripción: Crear un vector de números enteros, mostrar el tercer elemento y cambiarlo.
 * Métodos a utilizar: get(), set().
 * Resultado esperado: Antes: 5, Después: [1, 2, 10, 4, 5].
 */
public class Ejercicio2 {
    static Vector<Integer> numeros = new Vector<>(Arrays.asList(1, 2, 3));
    public static void main(String[] args) {
        System.out.println(numeros.get(2));
        modificarElementoVector(numeros, 2, 5);
        System.out.println(numeros);
    }

    /**
     * Modifica el elemento de una posicion especifica.
     * @param lista en el que cambiar el elemento. 
     * @param posicion donde se encuentra el elemento a cambiar.
     * @param valor a cambiar del elemento
     * @return true si se modifica el elemento.
     */
    public static Boolean modificarElementoVector(List<Integer> lista, int posicion, int valor){
        if(lista == null || lista.isEmpty()) return false;
        if(posicion < 0 || posicion > lista.size()) return false;
        lista.set(posicion, valor);
        return true;
    }
}
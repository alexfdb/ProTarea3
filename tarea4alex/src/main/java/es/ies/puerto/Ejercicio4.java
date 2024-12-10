package es.ies.puerto;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Vector;
/**
 * @author alexfdb
 * @version 1.0.0
 * Descripción: Copiar números pares de un vector a otro.
 * Métodos a utilizar: add(), get(), addAll().
 * Resultado esperado: Vector original: [1, 2, 3, 4, 5]. Vector pares: [2, 4].
 */
public class Ejercicio4 {
    static Vector<Integer> numeros1 = new Vector<>(Arrays.asList(1, 2, 3, 4, 5));
    public static void main(String[] args) {
    }

    public static Boolean copiarElementosPares(List<Integer> lista) {
        if(lista == null || lista.isEmpty()) return false;
        List<String> listaPares = new ArrayList<>();
        for (Integer palabra : lista) {
            if(lista.get(palabra) % 2 == 0){
            }
        }
        return true;
    }
}
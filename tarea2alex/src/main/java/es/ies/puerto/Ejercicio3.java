package es.ies.puerto;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/**
 * @author alexfdb
 * @version 1.0.0
 * Llena una lista con números aleatorios (Utiliza Math). Elimina todos los 
 * números mayores que 50 utilizando removeIf(). Después, verifica si la lista 
 * contiene números pares con contains() o recorriéndola con un bucle.
 */
public class Ejercicio3 {
    public static void main(String[] args) {
        List<Integer> enteros = new ArrayList<>(Arrays.asList(numeroAleatorio(), 
        numeroAleatorio(), numeroAleatorio(), numeroAleatorio(), numeroAleatorio()));
        System.out.println("¿La lista contiene pares?\n" + contienePares(enteros));
        System.out.println(enteros);
        eliminarNumerosMayorQue(enteros, 50);
        System.out.println("Lista desdpues de eliminar mayores de 50 \n" + enteros);
    }

    /**
     * Función que devuelve un numero aleatorio.
     * @return un numero del 1 al 100.
     */
    public static int numeroAleatorio() {
        return (int) (Math.random() * 100) + 1;
    }

    /**
     * Función para verificar si la lista contiene números pares.
     * @param lista a verificar.
     * @return true si contiene numeros pares.
     */
    public static boolean contienePares(List<Integer> lista) {
        if(lista == null || lista.isEmpty()) return false;
        for(int numero : lista) {
            if(numero % 2 == 0) {
                return true;
            }
        }
        return false;
    }

    /**
     * Método que elimina los numeros mayores que el especificado.
     * @param lista a operar.
     * @param valor del cual se eliminara de la lista si es mayor.
     */
    public static void eliminarNumerosMayorQue(List<Integer> lista, int valor) {
        if(lista == null) return;
        lista.removeIf(numero -> numero > valor);
    }
}
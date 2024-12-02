package es.ies.puerto;
import java.util.ArrayList;
import java.util.List;
/**
 * @author alexfdb
 * @version 1.0.0
 * Llena una lista con números aleatorios entre 90 y 110, con Math. Escribe un método que 
 * elimine números negativos y mayores que 100 en una sola operación con removeIf(). Verifica 
 * si la lista resultante no está vacía antes de imprimirla.
 */
public class Ejercicio8 {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();
        numeros.add(numeroAleatorioDel90Al110());
        numeros.add(numeroAleatorioDel90Al110());
        numeros.add(numeroAleatorioDel90Al110());
        numeros.add(numeroAleatorioDel90Al110());
        numeros.add(numeroAleatorioDel90Al110());
        eliminarNegativosYMayorQue100(numeros);
        if(!numeros.isEmpty()) {
            System.out.println(numeros);
        }
    }

    /**
     * Función para generar un numero aleatorio del 90 al 110.
     * @return el numero aleatorio.
     */
    public static int numeroAleatorioDel90Al110() {
        return (int) (Math.random() * 20) + 90;
    }

    /**
     * Método que elimina los numeros negativos y los mayores de 100.
     * @param lista a comprobar.
     */
    public static void eliminarNegativosYMayorQue100(List<Integer> lista) {
        if(lista == null) return;
        lista.removeIf(numero -> numero > 100 || numero < 0);
    }
}
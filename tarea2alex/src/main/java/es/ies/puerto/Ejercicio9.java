package es.ies.puerto;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/**
 * @author alexfdb
 * @version 1.0.0
 * Llena dos listas con números iguales. Realiza operaciones en ambas (por ejemplo, agrega elementos 
 * en posiciones específicas o elimina elementos pares) y verifica si las listas siguen siendo iguales 
 * usando equals().
 */
public class Ejercicio9 {
    public static void main(String[] args) {
        List<Integer> numeros1 = new ArrayList<>(Arrays.asList(1, 2, 3));
        List<Integer> numeros2 = new ArrayList<>(Arrays.asList(1, 2, 3));
        numeros1.set(1, 4);
        System.out.println(numeros1.equals(numeros2));
    }
}
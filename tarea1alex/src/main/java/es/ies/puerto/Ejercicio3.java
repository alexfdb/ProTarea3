package es.ies.puerto;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/**
 * @author alexfdb
 * @version 1.0.0
 * Métodos a utilizar: set
 * Cambia el segundo elemento del ArrayList por otro nombre utilizando el método set.
 * Imprime la lista completa para verificar el cambio.
 */
public class Ejercicio3 {
    public static void main(String[] args) {
        List<String> nombres = new ArrayList<>(Arrays.asList("Bilbo", "Frodo", "Sam", "Pipim", "Merry"));
        nombres.set(1, "Sotomonte");
        System.out.println(nombres);
    }
}
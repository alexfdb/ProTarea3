package es.ies.puerto;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/**
 * @author alexfdb
 * @version 1.0.0
 * Métodos a utilizar: get
 * Usa el ArrayList creado en el ejercicio 1.
 * Obtén el tercer elemento de la lista utilizando el método get.
 * Imprime el elemento obtenido.
 */
public class Ejercicio2 {
    public static void main(String[] args) {
        List<String> nombres = new ArrayList<>(Arrays.asList("Bilbo", "Frodo", "Sam", "Pipim", "Merry"));
            String tercerNombre = nombres.get(2);
            System.out.println(tercerNombre);
    }
}
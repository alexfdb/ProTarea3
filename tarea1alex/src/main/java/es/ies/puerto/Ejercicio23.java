package es.ies.puerto;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
/**
 * @author alexfdb
 * @version 1.0.0
 * Métodos a utilizar: hashCode
 * Usa el método hashCode para obtener un código hash del ArrayList.
 * Imprime el código hash obtenido.
 */
public class Ejercicio23 {
    public static void main(String[] args) {
        System.out.println(hobbits.hashCode());
    }

    static List<String> hobbits = new ArrayList<>(Arrays.asList("Bilbo", "Frodo", "Sam", "Pipim", "Merry"));
    
    @Override
    public int hashCode() {
        return Objects.hash(hobbits);
    }

}
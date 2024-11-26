package es.ies.puerto;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/* 
 * @author alexfdb
 * @version 1.0.0
 * Métodos a utilizar: size, get
 * Usa un bucle for para recorrer el ArrayList.
 * Imprime cada elemento en una línea diferente accediendo a ellos con el método get.
 * Realiza el mismo ejercicio utilizando el método toString de listacreada, y compara las diferencias.
 */
public class Ejercicio7 {
    public static void main(String[] args) {
        List<String> nombres = new ArrayList<>(Arrays.asList("Bilbo", "Frodo", "Sam", "Pipim", "Merry"));
        for (int i = 0; i < nombres.size(); i++) {
            System.out.println(nombres.get(i));
        }
        System.out.println(nombres);
    }
}
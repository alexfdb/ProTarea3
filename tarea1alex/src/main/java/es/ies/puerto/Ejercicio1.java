package es.ies.puerto;
import java.util.ArrayList;
/**
 * @author alexfdb
 * @version 1.0.0
 * Métodos a utilizar: add
 * Crea un ArrayList<String> vacío.
 * Añade cinco nombres al ArrayList usando el método add.
 * Imprime la lista completa para verificar los elementos añadidos.
 */
public class Ejercicio1 {
    public static void main(String[] args) {
        ArrayList<String> nombres = new ArrayList<>();
        nombres.add("Bilbo");
        nombres.add("Frodo");
        nombres.add("Sam");
        nombres.add("Pipim");
        nombres.add("Merry");
        System.out.println(nombres);
    }

}
package es.ies.puerto;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/**
 * @author alexfdb
 * @version 1.0.0
 * Llena una lista con palabras. Encuentra la sublista que comienza con "Inicio" y termina con "Fin". 
 * Invierte el orden de la sublista utilizando Collections.reverse() sin alterar el resto de la lista.
 */
public class Ejercicio12 {
    public static void main(String[] args) {

        List<String> palabras = new ArrayList<>();
        palabras.add("Hola");
        palabras.add("Inicio");
        palabras.add("Palabra1");
        palabras.add("Palabra2");
        palabras.add("Fin");
        palabras.add("Adiós");

        invertirSublista(palabras, "Inicio", "Fin");

        System.out.println(palabras);
    }

    /**
     * Método que busca una sublista y la invierte.
     * @param lista en la que buscar.
     * @param inicio de la sublista.
     * @param fin de la sublista.
     */
    public static void invertirSublista(List<String> lista, String inicio, String fin) {
        int indiceInicio = lista.indexOf(inicio);
        int indiceFin = lista.indexOf(fin);

        if (indiceInicio != -1 && indiceFin != -1 && indiceInicio < indiceFin) {
            List<String> sublista = lista.subList(indiceInicio, indiceFin + 1);

            Collections.reverse(sublista);
        }
    }
}
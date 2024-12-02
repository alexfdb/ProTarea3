package es.ies.puerto;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/**
 * @author alexfdb
 * @version 1.0.0
 * Llena una lista con nombres. Usa un bucle para reemplazar cualquier nombre con más de 5 caracteres 
 * por "GENÉRICO". Valida si los cambios fueron aplicados correctamente con contains().
 */
public class Ejercicio10 {
    public static void main(String[] args) {
        List<String> nombres = new ArrayList<>(Arrays.asList("Nico", "Alex", "Barbara"));
        nombreAGenerico(nombres, 5);
        System.out.println(nombres);

    }

    /**
     * Función para cambiar un elemento a 'GENÉRICO' si su tamaño excede del valor indicado.
     * @param lista a operar.
     * @param valor que indica cuanto tamaño a de tener la elemento para cambiar.
     * @return true si el elemento fue modificado.
     */
    public static boolean nombreAGenerico(List<String> lista, int valor) {
        if(lista == null) return false;
        for (String elemento : lista) {
            if(elemento.length() > valor) {
                elemento = "GENÉRICO";
            }
        }
        return true;
    }
}
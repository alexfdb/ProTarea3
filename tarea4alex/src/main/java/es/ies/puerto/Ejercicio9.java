package es.ies.puerto;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Vector;
/**
 * @author alexfdb
 * @version 1.0.0
 * Descripción: Crear un vector vacío y agregar números hasta que el usuario ingrese "0".
 * Métodos a utilizar: add(), toString().
 * Resultado esperado: Entrada: 1, 2, 3, 0. Vector: [1, 2, 3].
 */
public class Ejercicio9 {
    static Scanner sc = new Scanner(System.in);
    static Vector<Integer> numeros = new Vector<>();
    public static void main(String[] args) {
        crearVectorDinamico(numeros);
        System.out.println(numeros);
    }

    /**
     * Crear un vector vacío y agregar números hasta que el usuario ingrese "0".
     * @param lista vacia a la que añadir los elementos.
     * @return la lista una vez añadidos los elementos.
     */
    public static List<Integer> crearVectorDinamico(List<Integer> lista) {
        if(lista == null) return new ArrayList<>();
        int numero = sc.nextInt();
        while (numero != 0) {
            lista.add(numero);
            numero = sc.nextInt();
        }
        return lista;
    }

}
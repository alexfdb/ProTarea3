package es.ies.puerto;
import java.util.Arrays;
import java.util.List;
import java.util.Vector;
/**
 * @author alexfdb
 * @version 1.0.0
 * Descripción: Calcular el promedio de calificaciones almacenadas en un vector.
 * Métodos a utilizar: add(), size(), get().
 * Resultado esperado: Calificaciones: [80.0, 90.0, 70.0]. Promedio: 80.0.
 */
public class Ejercicio10 {
    static Vector<Float> calificaciones = new Vector<>(Arrays.asList(80.0f, 90.0f, 70.0f));
    public static void main(String[] args) {
        System.out.println(calcularPromedio(calificaciones));
    }

    /**
     * Calcular el promedio de calificaciones almacenadas en una lista.
     * @param lista
     * @return
     */
    public static float calcularPromedio(List<Float> lista) {
        if(lista == null || lista.isEmpty()) return -1.0f;
        float suma = 0.0f;
        for (float numeros : lista) {
            suma += numeros;
        }
        return suma / lista.size();
    }
}
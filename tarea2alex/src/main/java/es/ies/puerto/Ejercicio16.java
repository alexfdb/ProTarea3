package es.ies.puerto;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
/**
 * @author alexfdb
 * @version 1.0.0
 * Llena una lista con resultados de exámenes (ResultadoExamen con nombreAlumno y nota). Genera 
 * listas separadas con los tres mejores estudiantes y los que están por debajo del promedio.
 */
public class Ejercicio16 {
        public static void main(String[] args) {
        List<ResultadoExamen> resultados = new ArrayList<>();
        resultados.add(new ResultadoExamen("Alex", 8));
        resultados.add(new ResultadoExamen("Nico", 7));
        resultados.add(new ResultadoExamen("Barbara", 9));
        resultados.add(new ResultadoExamen("Lucía", 6));
        resultados.add(new ResultadoExamen("Jorge", 8));
        resultados.add(new ResultadoExamen("Ana", 5));

        List<ResultadoExamen> mejoresEstudiantes = obtenerTresMejores(resultados);

        List<ResultadoExamen> porDebajoDelPromedio = filtrarPorDebajoDelPromedio(resultados);

        System.out.println("Tres mejores estudiantes:");
        for (ResultadoExamen estudiante : mejoresEstudiantes) {
            System.out.println(estudiante);
        }

        System.out.println("\nEstudiantes por debajo del promedio:");
        for (ResultadoExamen estudiante : porDebajoDelPromedio) {
            System.out.println(estudiante);
        }
    }

    /**
     * Obtiene los tres mejores estudiantes según las notas.
     * @param resultados Lista de resultados de exámenes.
     * @return Lista con los tres mejores estudiantes.
     */
    public static List<ResultadoExamen> obtenerTresMejores(List<ResultadoExamen> resultados) {
        Collections.sort(resultados, Comparator.comparingInt(ResultadoExamen::getNota).reversed());

        List<ResultadoExamen> mejores = new ArrayList<>();
        for (int i = 0; i < Math.min(3, resultados.size()); i++) {
            mejores.add(resultados.get(i));
        }
        return mejores;
    }

    /**
     * Filtra los estudiantes con notas por debajo del promedio.
     * @param resultados Lista de resultados de exámenes.
     * @return Lista de estudiantes con notas inferiores al promedio.
     */
    public static List<ResultadoExamen> filtrarPorDebajoDelPromedio(List<ResultadoExamen> resultados) {
        double promedio = calcularPromedio(resultados);

        List<ResultadoExamen> porDebajoDelPromedio = new ArrayList<>();
        for (ResultadoExamen estudiante : resultados) {
            if (estudiante.getNota() < promedio) {
                porDebajoDelPromedio.add(estudiante);
            }
        }
        return porDebajoDelPromedio;
    }

    /**
     * Calcula el promedio de notas de los resultados.
     * @param resultados Lista de resultados de exámenes.
     * @return Promedio de las notas.
     */
    public static double calcularPromedio(List<ResultadoExamen> resultados) {
        int suma = 0;
        for (ResultadoExamen estudiante : resultados) {
            suma += estudiante.getNota();
        }
        return resultados.isEmpty() ? 0 : (double) suma / resultados.size();
    }
}

/**
 * Clase para representar el resultado de un examen.
 */
class ResultadoExamen {
    private String nombreAlumno;
    private int nota;

    public ResultadoExamen(String nombreAlumno, int nota) {
        this.nombreAlumno = nombreAlumno;
        this.nota = nota;
    }

    public String getNombreAlumno() {
        return nombreAlumno;
    }

    public int getNota() {
        return nota;
    }

    @Override
    public String toString() {
        return nombreAlumno + ": " + nota;
    }
}
package es.ies.puerto;
import java.util.ArrayList;
/**
 * @author alexfdb
 * @version 1.0.0
 * Métodos a utilizar: add
 * Crea una clase Persona con atributos nombre, edad y dni.
 * Crea una List<Persona> y añade cinco objetos Persona al ArrayList utilizando el método add.
 * Usa un bucle para imprimir la información de todas las personas.
 * Utiliza el if para encontrar a una persona especifica por su dni.
 */
public class Ejercicio19 {
    static ArrayList<Persona> personas = new ArrayList<>();
    public static void main(String[] args) {
        personas.add(new Persona("Alex", 30, "1"));
        personas.add(new Persona("Alex", 30, "2"));
        personas.add(new Persona("Alex", 30, "3"));
        personas.add(new Persona("Alex", 30, "4"));
        personas.add(new Persona("Alex", 30, "5"));
        for (Persona persona : personas) {
            System.out.println(persona);
        }
        System.out.println(buscarPersona("1"));
    }

    /**
     * Función que busca una persona por su dni.
     * @param dni de la persona a buscar.
     * @return null si el dni es null, esta vacio o no lo encuentra.
     */
    public static Persona buscarPersona(String dni) {
        if(personas == null || personas.isEmpty()) {
            return null;
        }
        Persona personaABuscar = new Persona(dni);
        int posicion = personas.indexOf(personaABuscar);
        if(posicion >= 0) {
            return personas.get(posicion);
        }
        return null;
    }
}
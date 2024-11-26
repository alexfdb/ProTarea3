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
    public static void main(String[] args) {
        Persona persona1 = new Persona("Alex", 30, "1");
        Persona persona2 = new Persona("Alex", 30, "2");
        Persona persona3 = new Persona("Alex", 30, "3");
        Persona persona4 = new Persona("Alex", 30, "4");
        Persona persona5 = new Persona("Alex", 30, "5");
        ArrayList<Persona> personas = new ArrayList<>();
        personas.add(persona1);
        personas.add(persona2);
        personas.add(persona3);
        personas.add(persona4);
        personas.add(persona5);
        for (Persona persona : personas) {
            System.out.println(persona);
        }
        for (Persona persona : personas) {
            if(persona.getDni().equals("1")) {
                System.out.println("Persona con dni '1': " + persona);
                return;
            }
        }
    }
}
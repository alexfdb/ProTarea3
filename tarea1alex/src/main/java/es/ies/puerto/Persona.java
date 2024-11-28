package es.ies.puerto;
import java.util.Objects;
/**
 * @author alexfdb
 * @version 1.0.0
 * Métodos a utilizar: add
 * Crea una clase Persona con atributos nombre, edad y dni.
 * Crea una List<Persona> y añade cinco objetos Persona al ArrayList utilizando el método add.
 * Usa un bucle para imprimir la información de todas las personas.
 * Utiliza el if para encontrar a una persona especifica por su dni.
 */
public class Persona {
    private String nombre;
    private int edad;
    private String dni;

    /**
     * Constructor vacio.
     */
    public Persona() {
    }

    /**
     * Constructor solo con dni.
     * @param dni
     */
    public Persona(String dni) {
        this.dni = dni;
    }

    /**
     * Constructor general.
     * @param nombre
     * @param edad
     * @param dni
     */
    public Persona(String nombre, int edad, String dni) {
        this.nombre = nombre;
        this.edad = edad;
        this.dni = dni;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return this.edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDni() {
        return this.dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public Persona nombre(String nombre) {
        setNombre(nombre);
        return this;
    }

    public Persona edad(int edad) {
        setEdad(edad);
        return this;
    }

    public Persona dni(String dni) {
        setDni(dni);
        return this;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) return true;
        if (!(obj instanceof Persona)) return false;
        Persona persona = (Persona) obj;
        return Objects.equals(this.dni, persona.dni);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, edad, dni);
    }

    @Override
    public String toString() {
        return "{" +
            " nombre='" + getNombre() + "'" +
            ", edad='" + getEdad() + "'" +
            ", dni='" + getDni() + "'" +
            "}";
    }
    
}

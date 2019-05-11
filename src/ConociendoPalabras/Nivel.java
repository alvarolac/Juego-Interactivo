package ConociendoPalabras;


import java.lang.String;
import java.util.*;

/**
 *
 * @author Miguel Martinez
 * @version 0
 */
public class Nivel {

    //Variables
    private String nombre; //primer o segundo grado?
    private Set<String> palabras;

    //Constructor
    public Nivel(String nombre_, Set<String> palabras_) {
        

    }

    //gets y sets
    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String value) {
        this.nombre = value;
    }

    public Set getSet() {
        return this.palabras;
    }

    public void setSet(Set value) {
        this.palabras = value;
    }
    

}

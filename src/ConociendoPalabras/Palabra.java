package ConociendoPalabras;


import java.awt.*;
import java.util.*;
import java.lang.String;

/**
 *
 * @author Miguel Martinez
 * @version 0
 */
public class Palabra {

    //Variables
    private Image imagen;
    private String urlImagen;
    private String etiqueta;
    private String nombre;
    private Set<Integer> set;

    //Constructor
    public Palabra(String nombre_, String url_) {
        this.nombre = nombre_;
        this.urlImagen = url_;
    }

    //gets y sets
    public Image getImagen() {
        return this.imagen;
    }

    public void setImagen(Image value) {
        this.imagen = value;
    }

    public String getURLImagen() {
        return this.urlImagen;
    }

    public void setURLImagen(String value) {
        this.urlImagen = value;
    }

    public String getEtiqueta() {
        return this.etiqueta;
    }

    public void setEtiqueta(String value) {
        this.etiqueta = value;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String value) {
        this.nombre = value;
    }

    public Set getSet() {
        return this.set;
    }

    public void setSet(Set value) {
        this.set = value;
    }

}

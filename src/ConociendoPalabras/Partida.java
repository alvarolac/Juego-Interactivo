package ConociendoPalabras;


import java.util.*;

/**
 *
 * @author Miguel Martinez
 * @version 0
 */
public class Partida {
    
    private AppManager manager;

    private Nivel palabras;
    private Set<Jugador> jugadores;
    private Set<String> correctas;
    private Set<String> incorrectas;
    
    private float tiempo;

    //constructor
    public Partida(String nivel_, String cat_) {
        //aqui se carga la base de datos para inicializar los att de la clase
        manager = AppManager.getInstance();
        
        

    }

    //gets y sets
    public Nivel getNivel() {
        return this.palabras;
    }

    public void setNivel(Nivel value) {
        this.palabras = value;
    }

    public Set getJugadores() {
        return this.jugadores;
    }

    public void setJugadores(Set value) {
        this.jugadores = value;
    }

    public float getTiempo() {
        return this.tiempo;
    }

    public void setTiempo(float value) {
        this.tiempo = value;
    }

    public Set getCorrectas() {
        return this.correctas;
    }

    public void setCorrectas(Set value) {
        this.correctas = value;
    }

    public Set getIncorrectas() {
        return this.incorrectas;
    }

    public void setIncorrectas(Set value) {
        this.incorrectas = value;
    }

}

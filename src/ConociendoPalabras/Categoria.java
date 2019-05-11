/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ConociendoPalabras;



/**
 *
 * @author Miguel Martinez
 */
public class Categoria {
    private int ID;
    private String nombre;
    public boolean checked = false;
    
    Categoria (int id_, String n_){
        this.ID = id_;
        this.nombre = n_;
        this.checked = false;
    }
    
    public int getID() {
        return this.ID;
    }
    
    public String getNombre(){
        return this.nombre;
    }    
}

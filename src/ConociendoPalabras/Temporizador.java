package ConociendoPalabras;

import javax.swing.Timer;
import java.awt.event.*;

/**
 *
 * @author Miguel Martinez
 */
public class Temporizador extends Timer {
    
    private int iTime; //Desde donde empieza el temporizador

    public Temporizador(int iTime, int delay, ActionListener listener) {
        super(delay, listener);
        
        if (iTime < 0) {
            this.iTime = 0;
        }else{
            this.iTime = iTime;
        }
    }
    
    public int getiTime(){
        return this.iTime;
    }
    
    public void tictoc(){
        this.iTime--;
    }
    
    public void startAt(int t){
        if (t < 0) {
            return;
        }
        
        this.iTime = t;
        this.start();
    }
    
}



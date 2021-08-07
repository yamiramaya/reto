
package juego;

import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author YAMIR AMAYA
 */
public class Funciones {
    
    public int suma(int x, int y, int h){
        h = (x+y);
        return h;
    }
    
    public float division(float x, float h){
        h = (x/1000);
        return h;
    }
    
    public int multiplicacion (int x){
        int h = (x*100);
        return h;
    }
    
    public int Random (){
        Random ram = new Random();
        int x = ram.nextInt(5);
        x = x+1;
        JOptionPane.showMessageDialog(null,x);
        return x;
        
    }
}

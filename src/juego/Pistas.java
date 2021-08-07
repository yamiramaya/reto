
package juego;

import javax.swing.JOptionPane;

/**
 *
 * @author YAMIR AMAYA
 */
public class Pistas {
    float Recorridocolombia = 2.5f;
    float Recorridoeeuu = 3.8f;
    float Recorridocanada = 5.5f;
    float Recorridoespaña = 5.1f;
    float Recorridoroma = 2.5f;
    
    public void Colombia (){
        String Pais = "COLOMBIA";
        float Recorrido = 2.5f;
        String Condiciones = "Clima Templado";
        JOptionPane.showMessageDialog(null,"Pais "+Pais+"\n kilometros de distancia " +Recorrido+"\n Condicion climantica " +Condiciones);
    }
     
    public void EEUU (){
        String Pais = "ESTADOS UNIDOS";
        float Recorrido = 3.8f;
        String Condiciones = "Clima Frio";
        JOptionPane.showMessageDialog(null,"Pais "+Pais+"\n kilometros de distancia " +Recorrido+"\n Condicion climantica " +Condiciones);
    }
     
    public void Canada (){
        String Pais = "CANADA";
        float Recorrido = 5.5f;
        String Condiciones = "Terreno mixto";
        JOptionPane.showMessageDialog(null,"Pais "+Pais+"\n kilometros de distancia " +Recorrido+"\n Condicion climantica " +Condiciones);
    }
     
    public void España (){
        String Pais = "ESPAÑA";
        float Recorrido = 5.1f;
        String Condiciones = "Terreno planicie";
        JOptionPane.showMessageDialog(null,"Pais "+Pais+"\n kilometros de distancia " +Recorrido+"\n Condicion climantica " +Condiciones);
    }
    
    public void Roma (){
        String Pais = "ROMA";
        float Recorrido = 2.5f;
        String Condiciones = "Terreno arido";
        JOptionPane.showMessageDialog(null,"Pais "+Pais+"\n kilometros de distancia " +Recorrido+"\n Condicion climantica " +Condiciones);
    }
    
}

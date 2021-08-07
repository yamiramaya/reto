package juego;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author YAMIR AMAYA
 */
public class Lista {
    
    ArrayList<Equipo> lista = new ArrayList();
    
   public String Entrada(String text){
       return JOptionPane.showInputDialog(text);
   }
   
   public void Agregar(){
       Equipo eq = new Equipo();
       eq.setNombre(Entrada("Nombre"));
       eq.setApellido(Entrada("Apellido"));
       eq.setEdad(Entrada("Edad"));
       eq.setCarro(Entrada("Carro"));
       lista.add(eq);
   }
   
   public void Salidad (){
       String st = "";
       for (int i=0;i<lista.size();i++){
           st += "Nombre: "+lista.get(i).getNombre()+"\n";
           st += "Apellido: "+lista.get(i).getApellido()+"\n";
           st += "Edad: "+lista.get(i).getEdad()+"\n";
           st += "Carro: "+lista.get(i).getCarro()+"\n";
       }
       JOptionPane.showMessageDialog(null,st);
   }
   
   public void Borrar(){
       lista.clear();
   }
}

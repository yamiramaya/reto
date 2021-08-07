
package juego;

import javax.swing.JOptionPane;
import java.io.*; 
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author YAMIR AMAYA
 */
public class JUEGO {

   
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
      
       File archivo;
       File escribir;
       File linea;
       
       archivo = new File("Datos.txt");
       if(!archivo.exists()){
           try {
               archivo.createNewFile();
               //escribir = new FileWrite(archivo);
               //linea = new PrintWriter(escribir);
           } catch (IOException ex) {
               Logger.getLogger(JUEGO.class.getName()).log(Level.SEVERE, null, ex);
           }
       }else{
           
       }
        
        
      Funciones fun = new Funciones();
      Pistas pis = new Pistas();
      Equipo equ = new Equipo(); 
      Lista lis = new Lista();
      
      JOptionPane.showMessageDialog(null," GAME CAR ");
      
      byte opcion;
      int j,x,y,z,f,l,distancia1 = 0,distancia2 = 0;
      int distancia3 = 0,distancia4 = 0;
      int ganador1 = 0, ganador2 = 0, ganador3 = 0, ganador4 = 0;
      do{
          opcion = Byte.parseByte(JOptionPane.showInputDialog("Menu principal\n"
                                                              +"1. Comenzar juego\n"
                                                              +"2. Historial\n"
                                                              +"3. Salir"));
          
          switch (opcion){
              case 1:
                    JOptionPane.showMessageDialog(null," COMENZAR JUEGO  ");
                   j = 1 ;
                   f=j;
                   j=j+3;
                   equ.setJugadores(j);
                   
                  switch (f){
                      case 1:
                          
                          for (x=0;x<=j;x++){
                              lis.Agregar();
                          }
       

                        pis.Colombia();
                        
                        for (z=1;z<=j;z++){
                            if(z==1&&distancia1<2500){
                                JOptionPane.showMessageDialog(null," Jugador: " +z+ "\n Lanza el dado ");
                                l = fun.Random();
                                l = fun.multiplicacion(l);
                                distancia1 = l + distancia1;
                                JOptionPane.showMessageDialog(null," Jugador: " +z+ "\n Avanzo " +l+ "\n TOTAL " +distancia1 );
                                if (distancia1>=2500){
                                    JOptionPane.showMessageDialog(null,"GANADOR 1");
                                    ganador1=ganador1+1;
                                }
                                } if(z==2&&distancia2<2500){
                                JOptionPane.showMessageDialog(null," Jugador: " +z+ "\n Lanza el dado ");
                                l = fun.Random();
                                l = fun.multiplicacion(l);
                                distancia2 = l + distancia2;
                                JOptionPane.showMessageDialog(null," Jugador: " +z+ "\n Avanzo " +l+ "\n TOTAL " +distancia2 );
                                }if (distancia2>=2500){
                                    JOptionPane.showMessageDialog(null,"GANADOR 2");
                                    ganador2=ganador2+1;
                                }
                                if(z==3&&distancia3<2500){
                                JOptionPane.showMessageDialog(null," Jugador: " +z+ "\n Lanza el dado ");
                                l = fun.Random();
                                l = fun.multiplicacion(l);
                                distancia3 = l + distancia3;
                                JOptionPane.showMessageDialog(null," Jugador: " +z+ "\n Avanzo " +l+ "\n TOTAL " +distancia1 );
                                }if (distancia3>=2500){
                                    JOptionPane.showMessageDialog(null,"GANADOR 3");
                                    ganador3=ganador3 +1;
                                }
                                if(z==4&&distancia4<2500){
                                JOptionPane.showMessageDialog(null," Jugador: " +z+ "\n Lanza el dado ");
                                l = fun.Random();
                                l = fun.multiplicacion(l);
                                distancia4 = l + distancia4;
                                JOptionPane.showMessageDialog(null," Jugador: " +z+ "\n Avanzo " +l+ "\n TOTAL " +distancia1 );
                                }if (distancia4>=2500){
                                    JOptionPane.showMessageDialog(null,"GANADOR 4");
                                    ganador4=ganador4 +1;
                                }
                                 
                                if (distancia1<2500&&distancia2<2500&&z==j&&distancia3<2500&&distancia4<2500){
                                z=0;
                                }
                                }
                                JOptionPane.showMessageDialog(null," Segunda Carrera ");
                                distancia1=0;
                                distancia2=0;
                                distancia3=0;
                                distancia4=0;
                                z=0;
                                
                                pis.Canada();
                                
                                for (z=1;z<=j;z++){
                            if(z==1&&distancia1<5500){
                                JOptionPane.showMessageDialog(null," Jugador: " +z+ "\n Lanza el dado ");
                                l = fun.Random();
                                l = fun.multiplicacion(l);
                                distancia1 = l + distancia1;
                                JOptionPane.showMessageDialog(null," Jugador: " +z+ "\n Avanzo " +l+ "\n TOTAL " +distancia1 );
                            }if (distancia1>=5500){
                                    JOptionPane.showMessageDialog(null,"GANADOR 1");
                                    ganador1=ganador1+1;
                                }
                                if(z==2&&distancia2<5500){
                                JOptionPane.showMessageDialog(null," Jugador: " +z+ "\n Lanza el dado ");
                                l = fun.Random();
                                l = fun.multiplicacion(l);
                                distancia2 = l + distancia2;
                                JOptionPane.showMessageDialog(null," Jugador: " +z+ "\n Avanzo " +l+ "\n TOTAL " +distancia2 );
                                }if (distancia2>=5500){
                                    JOptionPane.showMessageDialog(null,"GANADOR 2");
                                    ganador2=ganador2+1;
                                }
                                if(z==3&&distancia3<5500){
                                JOptionPane.showMessageDialog(null," Jugador: " +z+ "\n Lanza el dado ");
                                l = fun.Random();
                                l = fun.multiplicacion(l);
                                distancia3 = l + distancia3;
                                JOptionPane.showMessageDialog(null," Jugador: " +z+ "\n Avanzo " +l+ "\n TOTAL " +distancia1 );
                                }if (distancia3>=5500){
                                    JOptionPane.showMessageDialog(null,"GANADOR 3");
                                    ganador3=ganador3 +1;
                                }
                                if(z==4&&distancia4<5500){
                                JOptionPane.showMessageDialog(null," Jugador: " +z+ "\n Lanza el dado ");
                                l = fun.Random();
                                l = fun.multiplicacion(l);
                                distancia4 = l + distancia4;
                                JOptionPane.showMessageDialog(null," Jugador: " +z+ "\n Avanzo " +l+ "\n TOTAL " +distancia1 );
                                }if (distancia4>=5500){
                                    JOptionPane.showMessageDialog(null,"GANADOR 4");
                                    ganador4=ganador4 +1;
                                }
                                 
                                if (distancia1<5500&&distancia2<5500&&z ==j&&distancia3<5500&&distancia4<5500){
                                z=0;
                                }
                                }
                                JOptionPane.showMessageDialog(null," Tercera Carrera ");
                                distancia1=0;
                                distancia2=0;
                                distancia3=0;
                                distancia4=0;
                                z=0;
                                
                                pis.EEUU();
                                
                                for (z=1;z<=j ;z++){
                            if(z==1&&distancia1<3800){
                                JOptionPane.showMessageDialog(null," Jugador: " +z+ "\n Lanza el dado ");
                                l = fun.Random();
                                l = fun.multiplicacion(l);
                                distancia1 = l + distancia1;
                                JOptionPane.showMessageDialog(null," Jugador: " +z+ "\n Avanzo " +l+ "\n TOTAL " +distancia1 );
                            }if (distancia1>=3800){
                                    JOptionPane.showMessageDialog(null,"GANADOR 1");
                                    ganador1=ganador1+1;
                                }
                                if(z==2&&distancia2<3800){
                                JOptionPane.showMessageDialog(null," Jugador: " +z+ "\n Lanza el dado ");
                                l = fun.Random();
                                l = fun.multiplicacion(l);
                                distancia2 = l + distancia2;
                                JOptionPane.showMessageDialog(null," Jugador: " +z+ "\n Avanzo " +l+ "\n TOTAL " +distancia2 );
                                }if (distancia2>=3800){
                                    JOptionPane.showMessageDialog(null,"GANADOR 2");
                                    ganador2=ganador2+1;
                                }
                                if(z==3&&distancia3<3800){
                                JOptionPane.showMessageDialog(null," Jugador: " +z+ "\n Lanza el dado ");
                                l = fun.Random();
                                l = fun.multiplicacion(l);
                                distancia3 = l + distancia3;
                                JOptionPane.showMessageDialog(null," Jugador: " +z+ "\n Avanzo " +l+ "\n TOTAL " +distancia1 );
                                }if (distancia3>=3800){
                                    JOptionPane.showMessageDialog(null,"GANADOR 3");
                                    ganador3=ganador3+1;
                                }
                                if(z==4&&distancia4<3800){
                                JOptionPane.showMessageDialog(null," Jugador: " +z+ "\n Lanza el dado ");
                                l = fun.Random();
                                l = fun.multiplicacion(l);
                                distancia4 = l + distancia4;
                                JOptionPane.showMessageDialog(null," Jugador: " +z+ "\n Avanzo " +l+ "\n TOTAL " +distancia1 );
                                }if (distancia4>=3800){
                                    JOptionPane.showMessageDialog(null,"GANADOR 4");
                                    ganador4=ganador4+1;
                                }
                                
                                if (distancia1<3800&&distancia2<3800&&z==j&&distancia3<3800&&distancia4<3800){
                                z=0;
                                }
                                }
                                JOptionPane.showMessageDialog(null," Cuarta Carrera ");
                                distancia1=0;
                                distancia2=0;
                                distancia3=0;
                                distancia4=0;
                                z=0;
                                
                                
                                pis.España();
                                
                                for (z=1;z<=j;z++){
                            if(z==1&&distancia1<5100){
                                JOptionPane.showMessageDialog(null," Jugador: " +z+ "\n Lanza el dado ");
                                l = fun.Random();
                                l = fun.multiplicacion(l);
                                distancia1 = l + distancia1;
                                JOptionPane.showMessageDialog(null," Jugador: " +z+ "\n Avanzo " +l+ "\n TOTAL " +distancia1 );
                            }if (distancia1>=5100){
                                    JOptionPane.showMessageDialog(null,"GANADOR 1");
                                    ganador1=ganador1+1;
                                }
                                 if(z==2&&distancia2<5100){
                                JOptionPane.showMessageDialog(null," Jugador: " +z+ "\n Lanza el dado ");
                                l = fun.Random();
                                l = fun.multiplicacion(l);
                                distancia2 = l + distancia2;
                                JOptionPane.showMessageDialog(null," Jugador: " +z+ "\n Avanzo " +l+ "\n TOTAL " +distancia2 );
                                 }if (distancia2>=5100){
                                    JOptionPane.showMessageDialog(null,"GANADOR 2");
                                    ganador2=ganador2+1;
                                }
                                if(z==3&&distancia3<5100){
                                JOptionPane.showMessageDialog(null," Jugador: " +z+ "\n Lanza el dado ");
                                l = fun.Random();
                                l = fun.multiplicacion(l);
                                distancia3 = l + distancia3;
                                JOptionPane.showMessageDialog(null," Jugador: " +z+ "\n Avanzo " +l+ "\n TOTAL " +distancia1 );
                                }if (distancia3>=5100){
                                    JOptionPane.showMessageDialog(null,"GANADOR 3");
                                    ganador3=ganador3 +1;
                                }
                                if(z==4&&distancia4<5100){
                                JOptionPane.showMessageDialog(null," Jugador: " +z+ "\n Lanza el dado ");
                                l = fun.Random();
                                l = fun.multiplicacion(l);
                                distancia4 = l + distancia4;
                                JOptionPane.showMessageDialog(null," Jugador: " +z+ "\n Avanzo " +l+ "\n TOTAL " +distancia1 );
                                }if (distancia4>=5100){
                                    JOptionPane.showMessageDialog(null,"GANADOR 4");
                                    ganador4=ganador4 +1;
                                }
                                 
                                if (distancia1<5100&&distancia2<5100&&z==j&&distancia3<5100&&distancia4<5100){
                                z=0;
                                }
                                }
                                JOptionPane.showMessageDialog(null," Quinta Carrera ");
                                distancia1=0;
                                distancia2=0;
                                distancia3=0;
                                distancia4=0;
                                z=0;
                                
                                
                                pis.Roma();
                                
                                for (z=1;z<=j;z++){
                            if(z==1&&distancia1<2500){
                                JOptionPane.showMessageDialog(null," Jugador: " +z+ "\n Lanza el dado ");
                                l = fun.Random();
                                l = fun.multiplicacion(l);
                                distancia1 = l + distancia1;
                                JOptionPane.showMessageDialog(null," Jugador: " +z+ "\n Avanzo " +l+ "\n TOTAL " +distancia1 );
                            }if (distancia1>=2500){
                                    JOptionPane.showMessageDialog(null,"GANADOR 1");
                                    ganador1=ganador1+1;
                                }
                                 if(z==2&&distancia2<2500){
                                JOptionPane.showMessageDialog(null," Jugador: " +z+ "\n Lanza el dado ");
                                l = fun.Random();
                                l = fun.multiplicacion(l);
                                distancia2 = l + distancia2;
                                JOptionPane.showMessageDialog(null," Jugador: " +z+ "\n Avanzo " +l+ "\n TOTAL " +distancia2 );
                                }if (distancia2>=2500){
                                    JOptionPane.showMessageDialog(null,"GANADOR 2");
                                    ganador2=ganador2+1;
                                }
                                if(z==3&&distancia3<2500){
                                JOptionPane.showMessageDialog(null," Jugador: " +z+ "\n Lanza el dado ");
                                l = fun.Random();
                                l = fun.multiplicacion(l);
                                distancia3 = l + distancia3;
                                JOptionPane.showMessageDialog(null," Jugador: " +z+ "\n Avanzo " +l+ "\n TOTAL " +distancia1 );
                                }if (distancia3>=2500){
                                    JOptionPane.showMessageDialog(null,"GANADOR 3");
                                    ganador3=ganador3 +1;
                                }
                                if(z==4&&distancia4<2500){
                                JOptionPane.showMessageDialog(null," Jugador: " +z+ "\n Lanza el dado ");
                                l = fun.Random();
                                l = fun.multiplicacion(l);
                                distancia4 = l + distancia4;
                                JOptionPane.showMessageDialog(null," Jugador: " +z+ "\n Avanzo " +l+ "\n TOTAL " +distancia1 );
                                }if (distancia4>=2500){
                                    JOptionPane.showMessageDialog(null,"GANADOR 4");
                                    ganador4=ganador4 +1;
                                }
                                 
                                if (distancia1<2500&&distancia2<2500&&z==j&&distancia3<2500&&distancia4<2500){
                                z=0;
                                }
                                }
                                distancia1=0;
                                distancia2=0;
                                distancia3=0;
                                distancia4=0;
                                z=0;
                                JOptionPane.showMessageDialog(null,"PODIO FINAL"+"\n Jugador 1: " +lis.lista.get(1).getNombre()+"\n GANO: " +ganador1
                                                                                +"\n Jugador 2: " +lis.lista.get(2).getNombre()+"\n GANO: " +ganador2
                                                                                +"\n Jugador 3: " +lis.lista.get(3).getNombre()+"\n GANO: " +ganador3
                                                                                +"\n Jugador 4: " +lis.lista.get(4).getNombre()+"\n GANO: " +ganador4);
                                lis.lista.set(1, equ).setPuesto(ganador1);
                                lis.lista.set(2, equ).setPuesto(ganador2);
                                lis.lista.set(3, equ).setPuesto(ganador3);
                                lis.lista.set(4, equ).setPuesto(ganador4);
                                
                          break;
                  }
              case 2:
                  lis.Salidad();
                  break;
              case 3:
                  JOptionPane.showMessageDialog(null," ADIOS ");
                  break;
          }
      }while(opcion!=3);
      
      
    }
    
}

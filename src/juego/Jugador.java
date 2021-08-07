
package juego;

/**
 *
 * @author YAMIR AMAYA
 */
public class Jugador {
    
    public String Nombre;
    public String Apellido;
    public String Edad;

    public Jugador() {
    }

    public Jugador(String Nombre, String Apellido, String Edad) {
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Edad = Edad;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public String getEdad() {
        return Edad;
    }

    public void setEdad(String Edad) {
        this.Edad = Edad;
    }

    
}

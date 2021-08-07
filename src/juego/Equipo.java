/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juego;

/**
 *
 * @author halos
 */
public class Equipo extends Jugador {
    
    public String Carro;
    public int Puesto;
    public int Jugadores;

    public Equipo() {
    }

    public Equipo(String Carro, int Puesto, int Jugadores) {
        this.Carro = Carro;
        this.Puesto = Puesto;
        this.Jugadores = Jugadores;
    }

    public Equipo(String Carro, int Puesto, int Jugadores, String Nombre, String Apellido, String Edad) {
        super(Nombre, Apellido, Edad);
        this.Carro = Carro;
        this.Puesto = Puesto;
        this.Jugadores = Jugadores;
    }

    public String getCarro() {
        return Carro;
    }

    public void setCarro(String Carro) {
        this.Carro = Carro;
    }

    public int getPuesto() {
        return Puesto;
    }

    public void setPuesto(int Puesto) {
        this.Puesto = Puesto;
    }

    public int getJugadores() {
        return Jugadores;
    }

    public void setJugadores(int Jugadores) {
        this.Jugadores = Jugadores;
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

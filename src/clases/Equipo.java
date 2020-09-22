
package clases;

import java.util.ArrayList;

public class Equipo {
    private String nombreEquipo;
    private String dt;
    private int puntos;
    private ArrayList<Jugador> listaJugador;

    public Equipo() {
    }

    public Equipo(String nombreEquipo, String dt, int puntos, ArrayList listaJugador) {
        this.nombreEquipo = nombreEquipo;
        this.dt = dt;
        this.puntos = puntos;
        this.listaJugador = listaJugador;
    }

    public ArrayList getListaJugador() {
        return listaJugador;
    }

    public void setListaJugador(ArrayList listaJugador) {
        this.listaJugador = listaJugador;
    }

    public String getNombreEquipo() {
        return nombreEquipo;
    }

    public void setNombreEquipo(String nombreEquipo) {
        this.nombreEquipo = nombreEquipo;
    }

    public String getDt() {
        return dt;
    }

    public void setDt(String dt) {
        this.dt = dt;
    }

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }
    
}


package clases;

import lista.ListaDoble;

public class Equipo {
    private String nombreEquipo;
    private String dt;
    private int puntos;
    private ListaDoble<Jugador> listaJugador;

    public Equipo() {
    }

    public Equipo(String nombreEquipo, String dt, int puntos, ListaDoble listaJugador) {
        this.nombreEquipo = nombreEquipo;
        this.dt = dt;
        this.puntos = puntos;
        this.listaJugador = listaJugador;
    }

    public ListaDoble getListaJugador() {
        return listaJugador;
    }

    public void setListaJugador(ListaDoble listaJugador) {
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

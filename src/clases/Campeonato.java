
package clases;

import lista.ListaDobleEquipo;



public class Campeonato {
    private String Nombre;
    private String FechaInicio;
    private String FechaFin;
    private ListaDobleEquipo lista_equipos;
    private ListaDobleEquipo lista_posicion;
    
    
    public Campeonato(String Nombre, String FechaInicio, String FechaFin, ListaDobleEquipo lista_equipos) {
        this.Nombre = Nombre;
        this.FechaInicio = FechaInicio;
        this.FechaFin = FechaFin;
        this.lista_equipos = lista_equipos;
    }

    public Campeonato() {
    }

    public ListaDobleEquipo getLista_equipos() {
        return lista_equipos;
    }

    public void setLista_equipos(ListaDobleEquipo lista_equipos) {
        this.lista_equipos = lista_equipos;
    }

    public ListaDobleEquipo getLista_posicion() {
        return lista_posicion;
    }

    public void setLista_posicion(ListaDobleEquipo lista_posicion) {
        this.lista_posicion = lista_posicion;
    }


    

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getFechaInicio() {
        return FechaInicio;
    }

    public void setFechaInicio(String FechaInicio) {
        this.FechaInicio = FechaInicio;
    }

    public String getFechaFin() {
        return FechaFin;
    }

    public void setFechaFin(String FechaFin) {
        this.FechaFin = FechaFin;
    }
    
   
}

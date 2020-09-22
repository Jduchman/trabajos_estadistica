
package nodo;

import clases.Equipo;

public class NodoDobleEquipo {
    public Equipo equipo;
    public NodoDobleEquipo anterior;
    public NodoDobleEquipo siguiente;
    
    public NodoDobleEquipo(Equipo equipo) {
        this.equipo = equipo;
        anterior =  siguiente = null;
        
    }

    public Equipo getDato() {
        return equipo;
    }

    public void setDato(Equipo dato) {
        this.equipo = dato;
    }

    public NodoDobleEquipo getAnterior() {
        return anterior;
    }

    public void setAnterior(NodoDobleEquipo anterior) {
        this.anterior = anterior;
    }

    public NodoDobleEquipo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoDobleEquipo siguiente) {
        this.siguiente = siguiente;
    }
    
    
}

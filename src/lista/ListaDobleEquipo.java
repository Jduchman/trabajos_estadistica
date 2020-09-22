package lista;

import clases.Equipo;
import nodo.NodoDobleEquipo;

public class ListaDobleEquipo {

    NodoDobleEquipo primero;

    public ListaDobleEquipo() {
        primero = null;
    }

    public ListaDobleEquipo ingresarInicio(Equipo equipo) {

        NodoDobleEquipo nuevo = new NodoDobleEquipo(equipo);
        if (primero != null) {
            nuevo.setSiguiente(primero);
            primero.setAnterior(nuevo);
        }

        primero = nuevo;

        return this;
    }
public ListaDobleEquipo eliminarPrimero() {

        if (primero != null) {
            if (primero.getSiguiente() == null) {
                primero = null;
            } else {

                primero = primero.getSiguiente();
                primero.setAnterior(null);
            }

        }
        return this;
    }

    public ListaDobleEquipo eliminarFinal() {

        if (primero.getSiguiente() != null) {
            NodoDobleEquipo aux = primero;
            NodoDobleEquipo aux1 = primero;
            while (aux.getSiguiente() != null) {
                aux1 = aux;
                aux = aux.getSiguiente();
            }
            aux.setAnterior(null);
            aux1.setSiguiente(null);
        } else {
            primero = null;
        }
        
        return this;
    }

    public ListaDobleEquipo ordenarPorPuntos(){
        
        
        
        
        return this;
    }

    public void imprimirDeInicio() {
        if (primero == null) {
            System.out.println("LISTA VACIA");
        } else {
            NodoDobleEquipo actual;
            for (actual = primero; actual != null; actual = actual.getSiguiente()) {
                System.out.print("{" + actual.getDato() + "}\n");
            }
        }
    }
    public int tamaño(){
        int longitud = 0;
        if (primero == null) {
            return longitud;
        } else {
            NodoDobleEquipo aux = primero;
            while(aux.getSiguiente() != null){
                aux = aux.getSiguiente();
                longitud++;
            }
            return longitud +1 ;
        }
    }
    public Equipo devuelveElementoPorIndice(int indice) {
        
        if (primero == null) {
            return null;
        } else {
            
            NodoDobleEquipo actual = primero;
            
            int contador = 0;
            
            while (contador < indice && actual.siguiente != null) {
                
                actual = actual.siguiente;
                contador++;
            }
            
            if (contador != indice) {
                return null;
            } else {
                return (Equipo) actual.getDato();
            }
        }
    }
}
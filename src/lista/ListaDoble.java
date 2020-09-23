package lista;

import nodo.NodoDoble;



public class ListaDoble <Tipo> {

    NodoDoble primero;

    public ListaDoble() {
        primero = null;
    }

    public ListaDoble ingresarInicio(Tipo jugador) {

        NodoDoble nuevo = new NodoDoble(jugador);
        if (primero != null) {
            nuevo.setSiguiente(primero);
            primero.setAnterior(nuevo);
        }

        primero = nuevo;

        return this;
    }
    public ListaDoble eliminarPrimero() {

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

    public ListaDoble eliminarTodo(){
        if (primero != null) {
            if (primero.getSiguiente() == null) {
                primero = null;
            } else {

                primero.setSiguiente(null);
                primero.setAnterior(null);
                primero = null;
            }

        }
        return this;
    }
    
    public String imprimirDeInicio() {
        String cadena = "";
        if (primero == null) {
        } else {
            NodoDoble actual;
            for (actual = primero; actual != null; actual = actual.getSiguiente()) {
                cadena += ("{" + actual.getDato() + "}\n");
            }
        }return cadena;
    }
    
    public int tamaño(){
        int longitud = 0;
        if (primero == null) {
            return longitud;
        } else {
            NodoDoble aux = primero;
            while(aux.getSiguiente() != null){
                aux = aux.getSiguiente();
                longitud++;
            }
            return longitud +1 ;
        }
    }
    public Tipo devuelveElementoPorIndice(int indice) {
        
        if (primero == null) {
            return null;
        } else {
            
            NodoDoble actual = primero;
            int contador = 0;           
            while (contador < indice && actual.siguiente != null) {
                
                actual = actual.siguiente;
                contador++;
            }           
            if (contador != indice) {
                return null;
            } else {
                return (Tipo) actual.getDato();
            }
        }
    }
}

package nodo;


public class NodoDoble<Tipo> {
    public Tipo dato;
    public NodoDoble anterior;
    public NodoDoble siguiente;
    
    public NodoDoble(Tipo dato) {
        this.dato = dato;
        anterior =  siguiente = null;
        
    }

    public Tipo getDato() {
        return dato;
    }

    public void setDato(Tipo dato) {
        this.dato = dato;
    }

    public NodoDoble getAnterior() {
        return anterior;
    }

    public void setAnterior(NodoDoble anterior) {
        this.anterior = anterior;
    }

    public NodoDoble getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoDoble siguiente) {
        this.siguiente = siguiente;
    }

    
}

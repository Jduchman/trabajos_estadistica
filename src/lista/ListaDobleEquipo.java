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
/*
    public ListaDobleEquipo ordenarPorPuntos(){
        boolean cambio = false;
        do { 
            NodoDobleEquipo aux = primero;
            NodoDobleEquipo aux1 = primero;
            while(aux.getSiguiente() != null){
                aux1 =aux ;
                aux =aux.getSiguiente();
                if(aux .getDato().getPuntos()>= aux1.getDato().getPuntos()){
                    cambio = true;
                    if(aux1.getAnterior() == null){
                        aux.getSiguiente().setAnterior(aux1);
                        aux.setAnterior(null);
                        aux.setSiguiente(aux1);
                        aux1.setAnterior(aux);
                        aux1.setSiguiente(aux.getSiguiente());
                        aux = primero;
                        
                    }else if(aux.getSiguiente() == null){
                        aux.setSiguiente(aux1);
                        aux.setAnterior(aux1.getAnterior());
                        aux1.getAnterior().setSiguiente(aux);
                        aux1.setAnterior(aux);
                        aux1.setSiguiente(null);
                        
                    }else{
                        aux.setSiguiente(aux1);
                        aux.setAnterior(aux1.getAnterior());
                        aux1.getAnterior().setSiguiente(aux);
                        aux1.setAnterior(aux);
                        aux1.setSiguiente(aux.getSiguiente());
                      
                    }
                }else{
                    cambio= false;
                    break;
                }
            }
        } while (cambio != true);

        return this;
    }
    */
    public ListaDobleEquipo asignarPuntaje(String equipo1, String equipo2){
        NodoDobleEquipo aux = primero;
        NodoDobleEquipo aux1 = primero;
        
        if(primero == null){
            System.out.println("Lista Vacia");
        }else{
            int result = (int) (Math.random()*3);
            if(result == 0){
                
                while(aux.getDato().getNombreEquipo() != equipo1 ){
                    aux = aux.getSiguiente();
                }
                while(aux1.getDato().getNombreEquipo() != equipo2 ){
                    aux1 = aux1.getSiguiente();
                }
                aux.getDato().setPuntos(1);
                aux1.getDato().setPuntos(1);
            }
            if(result == 1){
                
                while(aux.getDato().getNombreEquipo() != equipo1 ){
                    aux = aux.getSiguiente();
                }
                while(aux1.getDato().getNombreEquipo() != equipo2 ){
                    aux1 = aux1.getSiguiente();
                }
                aux.getDato().setPuntos(3);
                aux1.getDato().setPuntos(0);
            } 
            if(result == 2){
                
                while(aux.getDato().getNombreEquipo() != equipo1 ){
                    aux = aux.getSiguiente();
                }
                while(aux1.getDato().getNombreEquipo() != equipo2 ){
                    aux1 = aux1.getSiguiente();
                }
                aux.getDato().setPuntos(0);
                aux1.getDato().setPuntos(3);
            } 
        }

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
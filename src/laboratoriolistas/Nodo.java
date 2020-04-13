
package laboratoriolistas;

public class Nodo {
    private int dato; 
    private Nodo enlace; 

    public Nodo() {
        this.dato = 0;
        this.enlace = null;
    }
    
    public Nodo(int dato) {
        this.dato = dato;
        this.enlace = null;
    }

    public int getDato() {
        return dato;
    }

    public Nodo getEnlace() {
        return enlace;
    }

    public void setDato(int dato) {
        this.dato = dato;
    }

    public void setEnlace(Nodo enlace) {
        this.enlace = enlace;
    }

    String setDato(){
        throw new UnsupportedOperationException("Not supported yet"); 
    }
}

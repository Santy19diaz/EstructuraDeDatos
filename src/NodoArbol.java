public class NodoArbol {
    private int valor;
    private NodoArbol nodoIzq;
    private NodoArbol nodoDer;

    public NodoArbol(int valor){
        this.valor = valor;
        this.nodoIzq = null;
        this.nodoDer = null;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public void setNodoIzq(NodoArbol nodoIzq) {
        this.nodoIzq = nodoIzq;
    }

    public void setNodoDer(NodoArbol nodoDer) {
        this.nodoDer = nodoDer;
    }

    public NodoArbol getNodoIzq() {
        return nodoIzq;
    }
    public NodoArbol getNodoDer() {
        return nodoDer;
    }
    public void insertar(int dato){
        if(dato< this.valor){//Insertar Nodo lado izquierdo
            if(this.nodoIzq==null){
                this.nodoIzq = new NodoArbol(dato);
            }
            else{
                this.nodoIzq.insertar(dato);
            }
        }else{
            if(this.nodoDer == null){//InsertarNodo lado derecho
                this.nodoDer = new NodoArbol(dato);
            }else{
                this.nodoDer.insertar(dato);
            }
        }
    }
}

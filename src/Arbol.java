public class Arbol {
    NodoArbol inicial;

    public Arbol(){
        this.inicial = null;
    }
    public void insertar(int valor){
        if(inicial == null){
            this.inicial = new NodoArbol(valor);
        }else{
            this.inicial.insertar(valor);
        }
    }

    public void LanzarPreOrden(){
        this.preOrden(this.inicial);
    }
    public void preOrden(NodoArbol nodo){
        if(nodo==null){
            return;//detener recursividad
        }else {
            System.out.print(nodo.getValor()+", ");
            preOrden(nodo.getNodoDer());
            preOrden(nodo.getNodoIzq());
        }

    }

    public void LanzarInOrden(){
        this.inOrden(this.inicial);
    }
    public void inOrden(NodoArbol nodo){
        if(nodo==null){
            return;//detener recursividad
        }else {
            inOrden(nodo.getNodoIzq());
            System.out.print(nodo.getValor()+", ");
            inOrden(nodo.getNodoDer());
        }

    }
    public void LanzarPostOrden(){
        this.postOrden(this.inicial);
    }
    public void postOrden(NodoArbol nodo){
        if(nodo==null){
            return;//detener recursividad
        }else {
            postOrden(nodo.getNodoIzq());
            postOrden(nodo.getNodoDer());
            System.out.print(nodo.getValor()+", ");

        }

    }
}

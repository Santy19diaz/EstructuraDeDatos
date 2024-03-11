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
    private void preOrden(NodoArbol nodo){
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
    private void inOrden(NodoArbol nodo){
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
    private void postOrden(NodoArbol nodo){
        if(nodo==null){
            return;//detener recursividad
        }else {
            postOrden(nodo.getNodoIzq());
            postOrden(nodo.getNodoDer());
            System.out.print(nodo.getValor()+", ");

        }

    }
    public void borrar(int valor) {
        this.inicial = borrarNodo(this.inicial, valor);
    }

    private NodoArbol borrarNodo(NodoArbol nodo, int valor) {
        if (nodo == null) {
            System.out.println("dato no encontrado");
            return null; // Nodo no encontrado
        }

        if (valor < nodo.getValor()) {
            nodo.setNodoIzq(borrarNodo(nodo.getNodoIzq(), valor));
        } else if (valor > nodo.getValor()) {
            nodo.setNodoDer(borrarNodo(nodo.getNodoDer(), valor));
        } else {
            // Nodo encontrado, realizar la eliminación
            if (nodo.getNodoIzq() == null) {
                return nodo.getNodoDer(); // Caso 1: Nodo con un hijo o sin hijos
            } else if (nodo.getNodoDer() == null) {
                return nodo.getNodoIzq(); // Caso 2: Nodo con un hijo
            } else {
                // Caso 3: Nodo con dos hijos
                NodoArbol sucesor = encontrarSucesor(nodo.getNodoDer());
                nodo.setValor(sucesor.getValor());
                nodo.setNodoDer(borrarNodo(nodo.getNodoDer(), sucesor.getValor()));
            }
        }
        return nodo;
    }

    private NodoArbol encontrarSucesor(NodoArbol nodo) {
        NodoArbol actual = nodo;
        while (actual.getNodoIzq() != null) {
            actual = actual.getNodoIzq();
        }
        return actual;
    }
}

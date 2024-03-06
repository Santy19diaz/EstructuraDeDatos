public class Main {
    public static void main(String[] args) {
        Arbol arbol = new Arbol();
        arbol.insertar(38);
        arbol.insertar(27);
        arbol.insertar(11);
        arbol.insertar(16);
        arbol.insertar(39);
        arbol.insertar(56);
        arbol.insertar(47);
        System.out.println("InOrden : ");
        arbol.LanzarInOrden();
        System.out.println("\nPreOrden: ");
        arbol.LanzarPreOrden();
        System.out.println("\nPosOrden: ");
        arbol.LanzarPostOrden();


    }
}

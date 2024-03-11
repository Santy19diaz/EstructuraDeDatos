import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int dato;
        Scanner scan = new Scanner(System.in);
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
        System.out.println("\nIngrese el dato a borrar");
        dato = scan.nextInt();
        arbol.borrar(dato);

        // Mostrar el árbol después de borrar el nodo
        System.out.println("\nÁrbol después de borrar:");
        arbol.LanzarInOrden(); // Mostrar en orden


    }
}

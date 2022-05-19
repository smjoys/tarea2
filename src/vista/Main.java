package vista;

import kdtree.KDNodo;
import kdtree.KDTree;

public class Main {
    public static void main(String[] args) {
        KDTree arbol = new KDTree();
        arbol.insertar(45,70,3);
        arbol.insertar(12,20,5);

        arbol.factor(45,70);
    }

}

public class Invertido {
    public Nodo invertir(Nodo root){
        if (root == null) {
            return null;
        }
        Nodo temporal = root.izquierdo;
        root.izquierdo = invertir(root.derecho);
        root.derecho = invertir(temporal);
        return root;
    }
}

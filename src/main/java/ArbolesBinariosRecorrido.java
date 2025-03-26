public class ArbolesBinariosRecorrido {
    public void test(){
        Nodo root=new Nodo( 1);
        root.izquierdo = new Nodo(2);
        root.derecho = new Nodo(3);

        root.izquierdo.izquierdo = new Nodo(4);
        root.izquierdo.derecho = new Nodo(5);
        root.derecho.derecho = new Nodo(6);
        root.izquierdo.izquierdo.izquierdo = new Nodo(7);
        root.izquierdo.derecho.izquierdo= new Nodo(8);

        System.out.print("IN-ORDER ");
        Recorridos.inorder(root);
        System.out.println();

        System.out.print("PRE-ORDER ");
        Recorridos.preorder(root);
        System.out.println();

            System.out.print("POST-ORDER ");
            Recorridos.postorder(root);
            System.out.println();
    }
    public static void main(String[] args) {
        ArbolesBinariosRecorrido programa = new ArbolesBinariosRecorrido();
        programa.test();
    }
}
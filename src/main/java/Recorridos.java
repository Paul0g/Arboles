public class Recorridos  {
    public static void inorder(Nodo nodo){
        if(nodo!=null){
            inorder(nodo.izquierdo);
            System.out.print(nodo.valor+ " ");
            inorder(nodo.derecho);
        }
    }

    public  static void preorder(Nodo nodo){
        if (nodo !=null){
            System.out.print(nodo.valor+" ");
            preorder(nodo.izquierdo);
            preorder(nodo.derecho);
        }
    }

    public  static void postorder(Nodo nodo){
        if(nodo != null){
            postorder(nodo.izquierdo);
            postorder(nodo.derecho);
            System.out.print(nodo.valor+" ");
        }
    }
}


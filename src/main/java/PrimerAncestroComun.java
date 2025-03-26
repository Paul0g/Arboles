public class PrimerAncestroComun {
    class NodoAncestro{
        boolean nodoEncontrado;
        Nodo ancestro;
    }

    public  Nodo PrimerAncestroComun(Nodo root, Nodo primerNodo, Nodo segundoNodo){
        return posrOrderSearch(root, primerNodo, segundoNodo).ancestro;
    }

    private NodoAncestro posrOrderSearch(Nodo root, Nodo primerNodo, Nodo segundoNodo){
        if(root == null){
            return new NodoAncestro();
        }
        NodoAncestro leftResult = posrOrderSearch(root.izquierdo,primerNodo,segundoNodo);
        if (leftResult.ancestro!=null) return leftResult;
        NodoAncestro rightResult = posrOrderSearch(root.derecho,primerNodo,segundoNodo);
        if (rightResult.ancestro!=null) return rightResult;

        NodoAncestro result = new NodoAncestro();
        if (leftResult.nodoEncontrado && rightResult.nodoEncontrado){
            result.ancestro = root;
            return result;
        }
        result.nodoEncontrado = root == primerNodo || root == segundoNodo || leftResult.nodoEncontrado || rightResult.nodoEncontrado;
        return result;
    }

}

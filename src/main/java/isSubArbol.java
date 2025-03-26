public class isSubArbol {
    public boolean isSubArbol(Nodo primero, Nodo segundo){
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();

        preOrder(primero,sb1);
        preOrder(segundo, sb2);
        return sb1.toString().contains(sb2.toString());

    }

    private void preOrder(Nodo nodo, StringBuilder sb){
        if(nodo == null){
            sb.append("X");
            return;
        }
        sb.append(nodo.valor);
        preOrder(nodo.izquierdo, sb);
        preOrder(nodo.derecho, sb);
    }
}

public class TrueFalse {
    public boolean EsValido(Nodo root){
        return EsValido(root, null, null);
    }

    public boolean EsValido(Nodo root, Integer min, Integer max){
        if (root == null) return true;
        if ((min != null && root.valor <= min || (max != null && root.valor > max))) {
        return false;
        }

        return EsValido(root.izquierdo, min, root.valor) && EsValido(root.derecho, root.valor, max);

    }
}

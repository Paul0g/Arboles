public class Profundidad {
    public int maxPro(Nodo root){
        if(root == null){
            return 0;
        }
        int proizquierda = maxPro(root.izquierdo)+1;
        int proderecha = maxPro(root.derecho)+1;
        return Math.max(proizquierda, proderecha);
    }
}

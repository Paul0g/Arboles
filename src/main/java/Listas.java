
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Listas {
    public List<LinkedList<Nodo>> Listas(Nodo root){
        List<LinkedList<Nodo>> resultado = new ArrayList<>();
        LinkedList<Nodo> current = new LinkedList<>();
        current.add(root);
        while (!current.isEmpty()){
            resultado.add(current);
            LinkedList<Nodo> parent = current;
            current = new LinkedList<>();

            for(Nodo node : parent){
                if(node.izquierdo != null){
                    current.add(node.izquierdo);
                }
                if (node.derecho != null){
                    current.add(node.derecho);
                }
            }
        }
        return resultado;
    }
}

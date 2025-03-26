import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestProfundidad {
    public void profundidadtest(){

        Profundidad pfo = new Profundidad();
        Nodo root = new Nodo(4);
        root.izquierdo = new Nodo(2);
        root.derecho = new Nodo(7);
        root.izquierdo.izquierdo = new Nodo(1);
        root.izquierdo.derecho = new Nodo(3);

        int profundo = pfo.maxPro(root);
        assertEquals(3, pfo.maxPro(root));
        root.izquierdo.izquierdo.izquierdo = new Nodo(8);
        profundo = pfo.maxPro(root);
        System.out.println("La profundidad del árbol después de agregar un nodo es: " + profundo);
        assertEquals(4, pfo.maxPro(root));
    }
    public static void main(String[] args) {
        TestProfundidad pro= new TestProfundidad();
        pro.profundidadtest();
    }
}

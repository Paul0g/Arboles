import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class TestInvertir {
    public void invertirTest(){
        Invertido invertido = new Invertido();
        Nodo root = new Nodo(4);
        root.izquierdo = new Nodo(2);
        root.derecho = new Nodo(7);
        root.izquierdo.izquierdo = new Nodo (1);
        root.izquierdo.derecho = new Nodo (3);
        root.derecho.izquierdo = new Nodo(6);
        root.derecho.derecho = new Nodo(9);

        Nodo newRot = invertido.invertir(root);

        assertEquals(4, newRot.valor);
        assertEquals(7, newRot.izquierdo.valor);
        assertEquals(2, newRot.derecho.valor);
        assertEquals(9, newRot.izquierdo.izquierdo.valor);
        assertEquals(6, newRot.izquierdo.derecho.valor);
        assertEquals(3, newRot.derecho.izquierdo.valor);
        assertEquals(1, newRot.derecho.derecho.valor);

        System.out.print("PRE-ORDER ");
        Recorridos.preorder(root);
        System.out.println();

}
    public static void main(String[] args) {
        TestInvertir programa = new TestInvertir();
        programa.invertirTest();
    }
}

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;



public class TestSub {
    @Test
    public  void TestSub(){
        isSubArbol sub = new isSubArbol();
        Nodo primero = new Nodo(4);
        primero.izquierdo = new Nodo(5);
        primero.derecho = new Nodo(7);
        primero.izquierdo.izquierdo= new Nodo(1);
        primero.izquierdo.derecho = new Nodo(3);
        primero.izquierdo.izquierdo.izquierdo = new Nodo(8);

        Nodo segundo = new Nodo(5);
        segundo.izquierdo = new Nodo(1);
        segundo.derecho = new Nodo(3);
        segundo.izquierdo.izquierdo = new Nodo(8);
        assertTrue(sub.isSubArbol(primero, segundo));

        segundo.derecho.derecho = new Nodo(12);
        assertFalse(sub.isSubArbol(primero, segundo));

    }

}

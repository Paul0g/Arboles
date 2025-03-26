import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.*;
public class testancestro {
    @Test
    public void primerancestroencomunTest(){
        PrimerAncestroComun Primer = new PrimerAncestroComun();
        Nodo root = new Nodo(4);
        root.izquierdo = new Nodo(5);
        root.derecho = new Nodo(7);
        root.izquierdo.izquierdo= new Nodo(1);
        root.izquierdo.derecho = new Nodo(3);
        root.izquierdo.izquierdo.izquierdo = new Nodo(8);

        assertEquals(4, Primer.PrimerAncestroComun(root, root.izquierdo.izquierdo.izquierdo, root.derecho).valor);
        assertEquals(5, Primer.PrimerAncestroComun(root, root.izquierdo.izquierdo, root.izquierdo.derecho).valor);
        assertNull(Primer.PrimerAncestroComun(root, root, root.derecho));
    }
}

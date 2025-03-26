import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestBusqueda {
    @Test
    public void validateBstTest(){
    TrueFalse valido = new TrueFalse();
    Nodo root = new Nodo(4);
    root.izquierdo = new Nodo(5);
    root.derecho = new Nodo(7);
    root.izquierdo.izquierdo= new Nodo(1);
    root.izquierdo.derecho = new Nodo(3);
    root.izquierdo.izquierdo.izquierdo = new Nodo(8);

    assertFalse(valido.EsValido(root));

    root.izquierdo.valor=2;
    root.izquierdo.izquierdo.izquierdo= null;
    assertTrue(valido.EsValido(root));
    }
}

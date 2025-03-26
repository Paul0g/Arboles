import java.util.LinkedList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestListaArbol {


    public void ListaArbol() {
        Listas listas = new Listas();

        // Crear el árbol
        Nodo root = new Nodo(4);
        root.izquierdo = new Nodo(2);
        root.derecho = new Nodo(7);
        root.izquierdo.izquierdo = new Nodo(1);
        root.izquierdo.derecho = new Nodo(3);
        root.derecho.izquierdo = new Nodo(6);
        root.derecho.derecho = new Nodo(9);

        // Obtener las listas de nodos por nivel
        List<LinkedList<Nodo>> resultado = listas.Listas(root);

        // Verificar los valores de cada nivel
        assertEquals(4, resultado.get(0).get(0).valor); // Nivel 0
        assertEquals(2, resultado.get(1).get(0).valor); // Nivel 1
        assertEquals(7, resultado.get(1).get(1).valor); // Nivel 1
        assertEquals(1, resultado.get(2).get(0).valor); // Nivel 2
        assertEquals(3, resultado.get(2).get(1).valor); // Nivel 2
        assertEquals(6, resultado.get(2).get(2).valor); // Nivel 2
        assertEquals(9, resultado.get(2).get(3).valor); // Nivel 2
    }

    public static void main(String[] args) {
        TestListaArbol lista = new TestListaArbol();
        lista.ListaArbol();
    }
}

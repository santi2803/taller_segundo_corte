import java.util.ArrayList;
import java.util.Iterator;

public class Lista<T> implements Iterable<T> {
    private ArrayList lista = new ArrayList<T>();

    public Lista() {
        super();
    }

    public void add(T obj) {

        lista.add(obj);
    }

    public Iterator<T> iterator() {
        return lista.iterator();
    }
}

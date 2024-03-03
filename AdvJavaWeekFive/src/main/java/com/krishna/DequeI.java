import java.util.List;

public interface DequeI<T> {
    public void addFirst(T p);
    public void addLast(T p);
    public T removeFirst();
    public T removeLast();
    public T peekFirst();
    public T peekLast();
    public boolean isEmpty();
    public int size();
    public void clear();
    public boolean contains(T p);
    public List<T> asList();
}

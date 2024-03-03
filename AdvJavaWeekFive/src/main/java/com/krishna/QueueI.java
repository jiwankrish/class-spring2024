import java.util.List;

public interface QueueI<T> {
    public void enqueue(T p);
    public T dequeue();
    public T peek();
    public boolean isEmpty();
    public int size();
    public void clear();
    public boolean contains(T p);
    public List<T> asList();
}

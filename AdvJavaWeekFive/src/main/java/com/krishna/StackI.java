import java.util.List;

public interface StackI<T> { // These are the methods that Stack.java must implement
    public void push(T p);
    public T pop();
    public T peek();
    public boolean isEmpty();
    public int size();
    public void clear();
    public boolean contains(T p);
    public List<T> asList();
}

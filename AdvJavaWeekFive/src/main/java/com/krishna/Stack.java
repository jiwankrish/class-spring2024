import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Stack<T> implements StackI<T>{
    private T[] stack;
    private int size;
    private final int cap = 100;

    public Stack() {
        clear();
    }

    @Override
    public void push(T p) {
        if (size == cap)
            throw new RuntimeException("Stack is full");
        stack[size] = p;
        size++;
    }

    @Override
    public T pop() {
        T data = peek();
        size--;
        return data;
    }

    @Override
    public T peek() {
        return !isEmpty() ? stack[size - 1] : null;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void clear() {
        stack = (T[]) new Object[cap];
        size = 0;
    }

    @Override
    public boolean contains(T p) {
        for (T n : stack) {
               if (n.equals(p))
                    return true;
            }
        return false;
    }

    @Override
    public List<T> asList() {
        return new ArrayList<>(Arrays.asList(stack));
    }
}

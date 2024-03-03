package com.krishna;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Deque<T> implements DequeI<T> {
    private T[] deque;
    private int size;
    private final int cap = 100;

    public Deque() {
        clear();
    }

    @Override
    public void addFirst(T p) {
        if (size == cap)
            throw new RuntimeException("Deque is full");
        System.arraycopy(deque, 0, deque, 1, size++);
        deque[0] = p;
    }

    @Override
    public void addLast(T p) {
        if (size == cap)
            throw new RuntimeException("Deque is full");
        deque[size++] = p;
    }

    @Override
    public T removeFirst() {
        if (isEmpty())
            throw new RuntimeException("Deque is empty");
        T data = deque[0];
        System.arraycopy(deque, 1, deque, 0, --size);
        return data;
    }

    @Override
    public T removeLast() {
        if (isEmpty())
            throw new RuntimeException("Deque is empty");
        return deque[--size];
    }

    @Override
    public T peekFirst() {
        return !isEmpty() ? deque[0] : null;
    }

    @Override
    public T peekLast() {
        return !isEmpty() ? deque[size - 1] : null;
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
        deque = (T[]) new Object[cap];
        size = 0;
    }

    @Override
    public boolean contains(T p) {
        return Arrays.asList(deque).contains(p);
    }

    @Override
    public List<T> asList() {
        return new ArrayList<>(Arrays.asList(deque));
    }
}

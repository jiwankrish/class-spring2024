package com.krishna;

public interface DLL<T> {
    void add(T card);
    boolean remove(T card);
    boolean contains(T card);
    T get(int i);
    int size();
    default boolean isEmpty() {
        return size() == 0;
    }
    T[] getPoints();
}

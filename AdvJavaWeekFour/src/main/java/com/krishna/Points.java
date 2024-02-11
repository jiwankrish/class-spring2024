/*
+ * Student name:Krishna Sharama
+ * Course and section: INEW-2338-22700, INEW-2038-22700
+ * Assignment: Week4
+ * This assignment covers the list
+ */

package com.krishna;

import java.util.Arrays;

public class Points implements DLL<Point> {
    private Node<Point> head;
    private Node<Point> tail;
    private int size;

    @Override
    public void add(Point point) {
        Node<Point> newNode = new Node<>(point, null, null);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            Node<Point> current = head;
            while (current != null && current.getData().compareTo(point) < 0) {
                current = current.getNext();
            }
            if (current == null) {
                newNode.setPrev(tail);
                tail.setNext(newNode);
                tail = newNode;
            } else if (current.getPrev() == null) {
                newNode.setNext(current);
                current.setPrev(newNode);
                head = newNode;
            } else {
                newNode.setNext(current);
                newNode.setPrev(current.getPrev());
                current.getPrev().setNext(newNode);
                current.setPrev(newNode);
            }
        }
        size++;
    }
    @Override
    public boolean remove(Point point) {
        Node<Point> current = head;
        while (current != null) {
            if (current.getData().equals(point)) {
                Node<Point> prev = current.getPrev();
                Node<Point> next = current.getNext();
                if (prev != null) {
                    prev.setNext(next);
                } else {
                    head = next;
                }
                if (next != null) {
                    next.setPrev(prev);
                } else {
                    tail = prev;
                }
                size--;
                return true;
            }
            current = current.getNext();
        }
        return false;
    }

    @Override
    public boolean contains(Point point) {
        Node<Point> current = head;
        while (current != null) {
            if (current.getData().equals(point)) {
                return true;
            }
            current = current.getNext();
        }
        return false;
    }

    @Override
    public Point get(int i) {
        if (i < 0 || i >= size) {
            throw new IndexOutOfBoundsException("Index: " + i + ", Size: " + size);
        }
        Node<Point> current = head;
        for (int j = 0; j < i; j++) {
            current = current.getNext();
        }
        return current.getData();
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public Point[] getPoints() {
        Point[] pointsArray = new Point[size];
        Node<Point> current = head;
        int index = 0;
        while (current != null) {
            pointsArray[index++] = current.getData();
            current = current.getNext();
        }
        return pointsArray;
    }
}

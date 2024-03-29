package com.krishna;

import java.util.Objects;

public class Node<T> {
     private final T data;
     private Node<T> prev;
     private Node<T> next;

     Node(T data, Node<T> prev, Node<T> next) {
          this.data = data;
          this.prev = prev;
          this.next = next;
     }

     public T getData() {
          return data;
     }

     public Node<T> getPrev() {
          return prev;
     }

     public Node<T> getNext() {
          return next;
     }

     public void setPrev(Node<T> prev) {
          this.prev = prev;
     }

     public void setNext(Node<T> next) {
          this.next = next;
     }

     @Override
     public String toString() {
          return "Node[" +
                  "data=" + data + ", " +
                  "prev=" + prev + ", " +
                  "next=" + next + ']';
     }

}
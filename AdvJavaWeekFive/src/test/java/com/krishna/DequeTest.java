package com.krishna;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class DequeTest {
    Point point1 = new Point(1, 2, 3);
    Point point2 = new Point(4, 5, 6);
    Point point3 = new Point(7, 8, 9);

    @Test
    void addFirstTest() {
        Deque<Point> deque = new Deque<>();
        deque.addFirst(point1);
        assertEquals(1, deque.size());
        assertEquals(point1, deque.peekFirst());
    }

    @Test
    void addLastTest() {
        Deque<Point> deque = new Deque<>();
        deque.addLast(point1);
        assertEquals(1, deque.size());
        assertEquals(point1, deque.peekLast());
    }

    @Test
    void removeFirstTest() {
        Deque<Point> deque = new Deque<>();
        deque.addFirst(point1);
        deque.addLast(point2);
        deque.addLast(point3);
        assertEquals(3, deque.size());
        assertEquals(point1, deque.peekFirst(), "peek first 1");
        assertEquals(point3, deque.peekLast(), "peek last 1");
        System.out.println(deque.asList());

        assertEquals(point1, deque.removeFirst(), "remove first");
        assertEquals(2, deque.size());
        assertEquals(point2, deque.peekFirst(), "peek first 2");
        assertEquals(point3, deque.peekLast(), "peek last 2");
        System.out.println(deque.asList());
    }

    @Test
    void removeLastTest() {
        Deque<Point> deque = new Deque<>();
        deque.addFirst(point1);
        deque.addLast(point2);
        deque.addLast(point3);
        assertEquals(3, deque.size());
        assertEquals(point1, deque.peekFirst(), "peek first 1");
        assertEquals(point3, deque.peekLast(), "peek last 1");
        System.out.println(deque.asList());

        assertEquals(point3, deque.removeLast(), "remove last");
        assertEquals(2, deque.size());
        assertEquals(point1, deque.peekFirst(), "peek first 3");
        assertEquals(point2, deque.peekLast(), "peek first 3");
        System.out.println(deque.asList());
    }


    @Test
    void containsTest() {
        Deque<Point> deque = new Deque<>();
        deque.addFirst(point1);
        deque.addLast(point2);
        deque.addLast(point3);
        System.out.println(deque.asList());
        assertEquals(3, deque.size());
        assertTrue(deque.contains(point2));
    }

}

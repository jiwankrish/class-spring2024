package com.krishna;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QueueTest {
    final Point point1 = new Point(1, 2, 3);
    Point point2 = new Point(4, 5, 6);

    @Test
    void enqueueTest() {
        Queue<Point> queue = new Queue<>();
        queue.enqueue(point1);
        assertEquals(1, queue.size());
        queue.enqueue(point2);
        assertEquals(2, queue.size());
        assertEquals(point1, queue.peek());
    }

    @Test
    void dequeueTest() {
        Queue<Point> queue = new Queue<>();
        queue.enqueue(point1);
        queue.enqueue(point2);
        assertEquals(2, queue.size());
        assertTrue(queue.contains(point1));
        Point point = queue.dequeue();
        assertEquals(1, queue.size());
        assertEquals(point1, point);
   }

    @Test
    void peekTest() {
        Queue<Point> queue = new Queue<>();
        queue.enqueue(new Point(4, 5, 6));
        assertEquals(1, queue.size());
        assertEquals(new Point(4, 5, 6), queue.peek());
    }

    @Test
    void sizeTest() {
        Queue<Point> queue = new Queue<>();
        queue.enqueue(new Point(4, 5, 6));
        assertEquals(1, queue.size());
    }

    @Test
    void isEmptyTest() {
        Queue<Point> queue = new Queue<>();
        queue.enqueue(new Point(4, 5, 6));
        assertFalse(queue.isEmpty());
        queue.dequeue();
        assertTrue(queue.isEmpty());
    }

    @Test
    void clearTest() {
        Queue<Point> queue = new Queue<>();
        queue.enqueue(new Point(4, 5, 6));
        assertFalse(queue.isEmpty());
        queue.clear();
        assertTrue(queue.isEmpty());
    }

    @Test
    void containsTest() {
        Queue<Point> queue = new Queue<>();
        queue.enqueue(new Point(4, 5, 6));
        queue.enqueue(new Point(4, 5, 6));
        queue.enqueue(new Point(4, 5, 6));
        assert queue.size() == 3;
        assert queue.contains(new Point(4, 5, 6));
    }
}
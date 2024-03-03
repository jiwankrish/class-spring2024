package com.krishna;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StackTest {
    Point point1 = new Point(1, 2, 3);
    Point point2 = new Point(4, 5, 6);
    Point point3 = new Point(7, 8, 9);
    @Test
    void pushTest() {
        Stack<Point> stack = new Stack<>();
        stack.push(point1);
        assertEquals(1, stack.size());
        assertEquals(point1, stack.peek());
    }

    @Test
    void popTest() {
        Stack<Point> stack = new Stack<>();
        stack.push(point1);
        assertEquals(1, stack.size());
        assertEquals(point1, stack.pop());
    }

    @Test
    void peekTest() {
        Stack<Point> stack = new Stack<>();
        stack.push(point1);
        assertEquals(point1, stack.peek());
    }

    @Test
    void isEmptyTest() {
        Stack<Point> stack = new Stack<>();
        assertTrue(stack.isEmpty());
        stack.push(point1);
        assertFalse(stack.isEmpty());
        stack.pop();
        assertTrue(stack.isEmpty());
    }

    @Test
    void clearTest() {
        Stack<Point> stack = new Stack<>();
        stack.push(point1);
        stack.clear();
        assertTrue(stack.isEmpty());
    }

    @Test
    void containsTest() {
        Stack<Point> stack = new Stack<>();
        stack.push(point1);
        stack.push(point2);
        stack.push(point3);
        assertEquals(3, stack.size());
        assertTrue(stack.contains(point1));
        assertTrue(stack.contains(point2));
        assertTrue(stack.contains(point3));
    }
}

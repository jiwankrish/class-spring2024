package com.krishna;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class LinkedListsTests {

    public static final Point POINT123 = new Point(1, 2, 3);
    public static final Point POINT456 = new Point(4, 5, 6);
    public static final Point POINT789 = new Point(7, 8, 9);

    @Test
    public void testAdd1() {
        Points points = new Points();
        points.add(POINT123);
        assertEquals(1, points.size());
        assertArrayEquals(new Point[]{POINT123}, points.getPoints());
    }

    @Test
    void testAdd2() {
        Points points = new Points();
        points.add(POINT456);
        points.add(POINT123);
        assertEquals(2, points.size());
        assertArrayEquals(new Point[]{POINT123, POINT456}, points.getPoints());
    }

    @Test
    void testAdd3() {
        Points points = new Points();
        points.add(POINT123);
        points.add(POINT456);
        assertEquals(2, points.size());
        assertArrayEquals(new Point[]{POINT123, POINT456}, points.getPoints());
    }

    @Test
    void testAdd4() {
        Points points = new Points();
        points.add(POINT123);
        points.add(POINT789);
        points.add(POINT456);
        assert points.size() == 3;
        assertArrayEquals(new Point[]{POINT123, POINT456, POINT789}, points.getPoints());
    }

    @Test
    void testContains() {
        Points points = new Points();
        points.add(POINT123);
        points.add(POINT789);
        points.add(POINT456);
        assert points.size() == 3;
        assert(points.contains(POINT123));
    }

    @Test
    void testGet() {
        Points points = new Points();
        points.add(POINT123);
        assertEquals(points.get(0), POINT123);
        assert points.size() == 1;
    }

    @Test
    void testRemove() {
        Points points = new Points();
        points.add(POINT123);
        points.add(POINT789);
        points.add(POINT456);
        points.remove(POINT789);
        assert points.size() == 2;
        assertArrayEquals(new Point[]{POINT123, POINT456}, points.getPoints());

        points.remove(POINT123);
        assert points.size() == 1;
        assertArrayEquals(new Point[]{POINT456}, points.getPoints());

        points.remove(POINT456);
        assert points.isEmpty();
        assertArrayEquals(new Point[]{}, points.getPoints());
    }
}

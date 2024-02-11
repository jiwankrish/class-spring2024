package com.krishna;

public record Point(int x, int y, int z) implements Comparable<Object> {

    @Override
        public int compareTo(Object p) {
        if (p instanceof Point p2) {
            if (this.x != p2.x) return this.x - p2.x;
            if (this.y != p2.y) return this.y - p2.y;
            return this.z - p2.z;
        } else {
            throw new IllegalArgumentException("Cannot compare Point to "
                    + p.getClass().getName());
        }
    }

    public Point clone() throws CloneNotSupportedException {
        return (Point) super.clone();
    }

}

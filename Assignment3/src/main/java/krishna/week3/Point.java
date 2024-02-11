package krishna.week3;
/*
 * Student name:Krishna Sharama
 * Course and section: INEW-2338-22700, INEW-2038-22700
 * Assignment: Week3
 * This assignment covers the collection and Compareable
 */
public record Point(int x, int y, int z) implements Comparable<Point> {
    @Override
    public int compareTo(Point point) {
        if (this.x != point.x) {
            return this.x - point.x;
        }
        if (this.y != point.y) {
            return this.y - point.y;
        }
        return this.z - point.z;
    }
}


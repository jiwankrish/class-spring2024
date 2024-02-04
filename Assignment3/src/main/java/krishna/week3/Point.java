package krishna.week3;

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


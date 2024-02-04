package krishna.week3;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.assertIterableEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestMain {
    @Test
    public void testInts() {
        ArrayList<Point> points = new ArrayList<>();
        points.add(new Point(1, 2, 3));
        points.add(new Point(0, 0, 0));
        points.add(new Point(0, 34, 68));
        points.add(new Point(0, 34, 34));

        points.forEach(System.out::println);
        System.out.println(); // Print a blank line
        points.sort(null); // Sort the points
        points.forEach(System.out::println); // Print the sorted points

        // Validate the sorting order
        IntStream.range(0, points.size() - 1).forEachOrdered(i -> {
            assertTrue(points.get(i).compareTo(points.get(i + 1)) <= 0);
        });
    }

    @Test
    public void testStrings1() {
        ArrayList<String> strings = new ArrayList<>();
        strings.addAll(List.of("This", "is", "a", "list", "of", "strings"));

        System.out.printf("strings = %s%n", String.join(", ", strings));

        Collections.sort(strings);

        System.out.printf("sorted strings = %s%n", String.join(", ", strings));

        assertIterableEquals(strings, List.of("This", "a", "is", "list", "of", "strings"));
    }

    @Test
    public void testStrings2() {
        ArrayList<String> strings = new ArrayList<>();
        strings.addAll(List.of("This", "is", "a", "list", "of", "strings"));

        System.out.printf("strings = %s%n", String.join(", ", strings));

        Collections.sort(strings, (s1, s2) -> Integer.compare(s2.length(), s1.length()));

        System.out.printf("sorted strings by length descending = %s%n", String.join(", ", strings));

        assertIterableEquals(strings, List.of("strings", "This", "list", "is", "of", "a"));
    }
}

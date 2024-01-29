package lambdas;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class LambdaMainTest {
    final static List<Integer> evens15 = List.of(2, 4, 6, 8, 10, 12, 14, 16, 18, 20, 22, 24, 26, 28, 30);
    final static LambdaMain main = new LambdaMain();
    final static ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
    final static PrintStream systemOut = System.out;

    @Test
    void evensTest() {
        List<Integer> actual = main.printNEvens(15);
        System.out.println(actual);
        assertEquals(evens15, actual);
    }

    @Test
    void compositeTest() {
        int n = 5;
        System.setOut(new PrintStream(byteArrayOutputStream));
        main.consume(n);
        String expected = String.format("Composite (%d): %d\n", n, n * 10);
        String actual = byteArrayOutputStream.toString();
        actual = actual.replace("\r\n", "\n"); // Normalize actual line endings to LF
        expected = expected.replace("\r\n", "\n"); // Normalize expected line endings to LF
        assertEquals(expected, actual);
        System.setOut(systemOut);
        System.out.println(actual);

    }
}
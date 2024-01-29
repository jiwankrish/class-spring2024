package streams;
/*
 * Student name:Krishna Sharama
 * Course and section: INEW-2338-22700, INEW-2038-22700
 * Assignment: Week2
 * This is week two assignment that works with Streams
 */
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class PrimesMain {
    List<Integer> primes = findNPrimes(15);

    public static void main(String[] args) {
        PrimesMain primesMain = new PrimesMain();
    }

    List<Integer> findNPrimes(Integer n) {
        return Stream.iterate(2, e -> e + 1)
                .filter(this::isPrime)
                .limit(n)
                .toList();
    }

    boolean isPrime(int number) {
        return IntStream.rangeClosed(2, number / 2).noneMatch(i -> number % i == 0);
    }
}

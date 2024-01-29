package streams;

import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertIterableEquals;

public class PrimesMainTest {
    final static List<Boolean> FIFTEEN_PRIME_BOOLEANS =  List.of(true,true,false,true,false,true,false,false,false,true,false,true,false,false,false,false);
    final List<Integer> PRIMES15 = List.of(2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47);
    final static PrimesMain main = new PrimesMain();

    @Test
    void findNPrimesTest() {
        List<Integer> actual = main.findNPrimes(15);
        System.out.println(actual);
        assertIterableEquals(PRIMES15, actual);
    }

    @Test
    void isPrimeTest() {
        for (int i = 2; i < FIFTEEN_PRIME_BOOLEANS.size(); i++) {
            boolean actual = main.isPrime(i);
            System.out.printf("%d: %b, ", i, actual);
            assertEquals(FIFTEEN_PRIME_BOOLEANS.get(i - 2), actual);
        }
        System.out.println();
    }

}
package com.krishna;

import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class AckermannTest {
    @DisplayName("Ackermann Function Tests")
    @ParameterizedTest(name="{index} => m={0}, n={1}, ackermann={2}")
    @CsvSource({"0,0,1", "0,1,2", "1,1,3", "1,2,4", "1,3,5", "2,2,7", "3,2,29"})
    void ackermannTest(int m, int n, int ackermann) {
        assertEquals(ackermann, Ackermann.ackermann(m, n));
    }
}

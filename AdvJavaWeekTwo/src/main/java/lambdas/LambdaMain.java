package lambdas;
/*
 * Student name:Krishna Sharama
 * Course and section: INEW-2338-22700, INEW-2038-22700
 * Assignment: Week2
 * This is week two assignment that works with lambdas.
 */

import java.util.ArrayList;
import java.util.List;
import java.util.function.IntConsumer;
import java.util.function.IntFunction;
import java.util.function.IntPredicate;

public class LambdaMain {
    List<Integer> list = new ArrayList<>();
    IntPredicate moreThan1 = n -> n > 1;
    IntPredicate isEven = moreThan1.and(n -> n % 2 == 0);
    IntFunction<Boolean> add = list::add;
    IntConsumer display1 = a -> System.out.printf("Composite (%d): ", a);
    IntConsumer display2 = a -> System.out.println(a * 10);
    IntConsumer composite = display1.andThen(display2);

    public static void main(String[] args) {
        LambdaMain main = new LambdaMain();
    }

    List<Integer> printNEvens(int n) {
        for (int i = 0; list.size() < n; i++) {
            if (isEven.test(i)) add.apply(i); // Predicate and Function
        }
        return list;
    }

    void consume(int n) {                       // Consumer
        composite.accept(n);
    }

}


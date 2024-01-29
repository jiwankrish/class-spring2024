package records;
/*
 * Student name:Krishna Sharama
 * Course and section: INEW-2338-22700, INEW-2038-22700
 * Assignment: Week2
 * This is week two assignment that works with Records
 */
import java.util.Optional;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.go();
    }

    public void go() {
        int integer1 = 5;
        double double1 = 10;

        RecordA<Integer> recordA = new RecordA<>(integer1);
        RecordB<Double> recordB = new RecordB<>(double1);
        RecordC recordC = new RecordC();
        Scanner in = new Scanner(System.in);

        String menu = """
                Main Menu
                    1. RecordA
                    2. RecordB
                    3. RecordC
                    9. Exit
                \040""";

        while (true) {
            System.out.println(menu);
            char opt = in.next().charAt(0);

            switch (opt) {
                case '1' -> {
                    System.out.println(recordA.methodA());
                    recordA.methodB();
                    InterfaceI.methodC();
                }
                case '2' -> {
                    System.out.println(recordB.methodA());
                    recordB.methodB();
                    InterfaceI.methodC();
                }
                case '3' -> {
                    printOptional(recordC.optional1());
                    printOptional(recordC.optional2());
                }
                case '9' -> {
                    System.out.println("Goodbye");
                    System.exit(0);
                }
                default -> System.out.println("Invalid response");
            }
        }
    }

    private void printOptional(Optional<Integer> optional) {
        System.out.println(optional);
        System.out.println(optional.orElse(-1));
        System.out.println();
    }
}

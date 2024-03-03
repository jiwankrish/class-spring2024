package com.krishna;

import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;

public class LabProgram {

	static Predicate<String> filterPredicate = (str) -> (str.length() <= 4);
	static Function<String, Integer> mapMethod = (str) -> (int) str.length();

	public static void main(String[] args) {

		// First test case tests binary operations: union, intersection, and
		// difference
		BinaryOpsTestCase<Integer> binaryOpsTestCase = new BinaryOpsTestCase<>(
			new HashSet<>(Arrays.asList(42, 63, 99, 32, 18, 77, 64, 50, 12)),
			new HashSet<>(Arrays.asList(64, 16, 32, 8, 4, 1, 2)),
			new HashSet<>(Arrays.asList(1, 2, 4, 8, 12, 16, 18, 32, 42, 50, 63, 64, 77, 99)),
			new HashSet<>(Arrays.asList(32, 64)),
			new HashSet<>(Arrays.asList(42, 63, 99, 18, 77, 50, 12)),
			new HashSet<>(Arrays.asList(1, 2, 4, 8, 16)));
		int binaryTestCasePoints = binaryOpsTestCase.execute();

		// Next test case tests unary operations: filter and map
		UnaryOpsTestCase<String, Integer> unaryOpsTestCase = new UnaryOpsTestCase<>(
			new HashSet<>(Arrays.asList("zero", "one", "two", "three", "four", "five", "six", "seven",
					"eight", "nine", "ten")),
			filterPredicate, mapMethod,
			new HashSet<>(Arrays.asList("zero", "one", "two", "four", "five", "six", "nine", "ten")),
			new HashSet<>(Arrays.asList(3, 4, 5)));
		int unaryTestCasePoints = unaryOpsTestCase.execute();

		System.out.print("Binary operations score: ");
		System.out.print(binaryTestCasePoints);
		System.out.println(" out of 3");
		System.out.println();

		System.out.print("Unary operations score: ");
		System.out.print(unaryTestCasePoints);
		System.out.println(" out of 2");
		System.out.println();
	}
}

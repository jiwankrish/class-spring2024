import java.util.*;

// BinaryOpsTestCase represents an executable test case for the StaticSet's
// union(), intersection(), and difference() methods
public class BinaryOpsTestCase<T> extends StaticSetTestCase {
	public static final String NL = System.lineSeparator();
	private final HashSet<T> setA;
	private final HashSet<T> setB;
	private final HashSet<T> expectedUnion;
	private final HashSet<T> expectedIntersection;
	private final HashSet<T> expectedAMinusB;
	private final HashSet<T> expectedBMinusA;

	public BinaryOpsTestCase(HashSet<T> setA, HashSet<T> setB, HashSet<T> expectedUnion,
			HashSet<T> expectedIntersection, HashSet<T> expectedAMinusB, HashSet<T> expectedBMinusA) {
		this.setA = new HashSet<>(setA);
		this.setB = new HashSet<>(setB);
		this.expectedUnion = new HashSet<>(expectedUnion);
		this.expectedIntersection = new HashSet<>(expectedIntersection);
		this.expectedAMinusB = new HashSet<>(expectedAMinusB);
		this.expectedBMinusA = new HashSet<>(expectedBMinusA);
	}

	@Override
	public int execute() {
		// Print sets A and B first
		System.out.println("A = " + setA);
		System.out.println("B = " + setB);
		System.out.println();

		// Create the two StaticSet objects from the HashSet objects
		StaticSet<T> staticSetA = new StaticSet<>(setA);
		StaticSet<T> staticSetB = new StaticSet<>(setB);

		// Create the union, intersection, and differences
		StaticSet<T> actualUnion = staticSetA.union(staticSetB);
		StaticSet<T> actualIntersection = staticSetA.intersection(staticSetB);
		StaticSet<T> actualAMinusB = staticSetA.difference(staticSetB);
		StaticSet<T> actualBMinusA = staticSetB.difference(staticSetA);

		// Verify that performing operations didn't change either StaticSet's size
		ArrayList<Tuple<StaticSet<T>, HashSet<T>, String>> sizeChecks = new ArrayList<>() {
            {
                add(new Tuple<>(staticSetA, setA, "A"));
                add(new Tuple<>(staticSetB, setB, "B"));
            }
        };

		for (var sizeCheckTuple : sizeChecks) {
			StaticSet<T> staticSet = sizeCheckTuple.getVar0();
			HashSet<T> unorderedSet = sizeCheckTuple.getVar1();
			String staticSetName = sizeCheckTuple.getVar2();
			if (staticSet.getSize() != unorderedSet.size()) {
				System.out.print("FAIL: Creating the union/intersection/difference ");
				System.out.print(" of StaticSets A and B changed set ");
				System.out.print(staticSetName + "'s size from ");
				System.out.print(unorderedSet.size());
				System.out.println(" to " + staticSetA.getSize());
				return 0;
			}
		}

		// Compare actual vs. expected sets
		double totalPoints = 0.0;
		totalPoints += StaticSetTestCase.compareSets(actualUnion, expectedUnion, "Union operation",
				1.0);
		totalPoints += StaticSetTestCase.compareSets(actualIntersection, expectedIntersection,
				"Intersection operation", 1.0);
		totalPoints += StaticSetTestCase.compareSets(actualAMinusB, expectedAMinusB,
				"A \\ B operation", 0.5);
		totalPoints += StaticSetTestCase.compareSets(actualBMinusA, expectedBMinusA,
				"B \\ A operation", 0.5);

		return (int) totalPoints;
	}
}

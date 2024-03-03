import java.util.*;
import java.util.function.*;

// UnaryOpsTestCase represents an executable test case for the StaticSet's
// filter() and map() methods
public class UnaryOpsTestCase<T, MappedItemType> extends StaticSetTestCase {
	public static final String NL = System.lineSeparator();
	private final HashSet<T> sourceSet;
	private final Predicate<T> filterPredicate;
	private final Function<T, MappedItemType> mapMethod;
	private final HashSet<T> expectedFiltered;
	private final HashSet<MappedItemType> expectedMapped;

	public UnaryOpsTestCase(HashSet<T> sourceSet, Predicate<T> filterPredicate,
			Function<T, MappedItemType> mapMethod, HashSet<T> expectedFiltered,
			HashSet<MappedItemType> expectedMapped) {
		this.sourceSet = new HashSet<>(sourceSet);
		this.filterPredicate = filterPredicate;
		this.mapMethod = mapMethod;
		this.expectedFiltered = new HashSet<>(expectedFiltered);
		this.expectedMapped = new HashSet<>(expectedMapped);
	}

	public int execute() {

		// Print the source set first
		System.out.println("Set = " + sourceSet);
		System.out.println();

		// Create the StaticSet object from the HashSet source
		StaticSet<T> staticSet = new StaticSet<>(sourceSet);

		// Create the filtered and mapped sets
		StaticSet<T> actualFiltered = staticSet.filter(filterPredicate);
		StaticSet<MappedItemType> actualMapped = staticSet.map(mapMethod);

		// Verify that performing operations didn't staticSetA's size
		if (staticSet.getSize() != sourceSet.size()) {
			System.out.print("FAIL: Filtering and/or mapping StaticSet S changed ");
			System.out.print("S's size from " + sourceSet.size());
			System.out.print(" to " + staticSet.getSize() + NL);
			return 0;
		}

		// Compare actual vs. expected sets
		double totalPoints = 0.0;
		totalPoints += StaticSetTestCase.compareSets(actualFiltered, expectedFiltered,
				"Filter operation", 1.0);
		totalPoints += StaticSetTestCase.compareSets(actualMapped, expectedMapped,
				"Map operation", 1.0);

		return (int) totalPoints;
	}
}

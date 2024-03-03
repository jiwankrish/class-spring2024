import java.util.*;
import java.util.concurrent.atomic.AtomicBoolean;

public abstract class StaticSetTestCase {


	public static <T> double compareSets(StaticSet<T> actual,
										 HashSet<T> expected,
										 String title, double points) {

		AtomicBoolean pass = new AtomicBoolean(true);

		// Compare actual vs. expected sets
		if (actual.getSize() != expected.size()) {
			pass.set(false);
		} else {
			// Expected and actual have equal sizes, so compare contents
			expected.forEach((item) -> {
				if (!actual.contains(item)) pass.set(false);
			});
		}

		// Print the pass or fail message with expected and actual sets
		System.out.print((pass.get() ? "PASS: " : "FAIL: "));
		System.out.println(title);
		System.out.print("  Expected: ");
		print(expected);
		System.out.print("  Actual:   ");
		print(actual.set);
		System.out.println();

		return pass.get() ? points : 0.0;
	}

	public static <T> void print(HashSet<T> iterable) {
		System.out.println(iterable);
	}

	public abstract int execute();
}

// Basic Tuple class for test cases
class Tuple<T, U, V> {
	public T var0;
	public U var1;
	public V var2;

	public Tuple(T x, U y, V z) {
		var0 = x;
		var1 = y;
		var2 = z;
	}

	public T getVar0() {
		return var0;
	}

	public U getVar1() {
		return var1;
	}

	public V getVar2() {
		return var2;
	}
}

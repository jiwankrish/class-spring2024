import java.util.*;
import java.util.function.*;

public class StaticSet<T> {
	protected HashSet<T> set;

	// Constructs the StaticSet with an empty set
	public StaticSet() {}

	// Constructs the StaticSet by copying itemsToCopy's items
	public StaticSet(HashSet<T> itemsToCopy) {
		this.set = new HashSet<>(itemsToCopy);
	}

	public boolean contains(T item) {
		return set.contains(item);
	}

	public int getSize() {
		return set.size();
	}

	// Returns a StaticSet<T> containing each element from this set that is not in otherSet.
	public StaticSet<T> difference(StaticSet<T> otherSet) {
		// *************************************************
		// Your code here (remove placeholder line below)
		// *************************************************
		return new StaticSet<>();
	}

	// Returns a StaticSet<T> containing each element from this set that
	// satisfies the predicate.
	public StaticSet<T> filter(Predicate<T> predicate) {
		// *************************************************
		// Your code here (remove placeholder line below)
		// *************************************************
		return new StaticSet<>();
	}

	// Returns a StaticSet<T> containing each element from this set that is also
	// in otherSet.
	public StaticSet<T> intersection(StaticSet<T> otherSet) {
		// *************************************************
		// Your code here (remove placeholder line below)
		// *************************************************
		return new StaticSet<>();
	}

	// Calls mapMethod(item) for each item in this set and adds the returned
	// item to a StaticSet<U>. After mapMethod has been called for each item
	// in this set, the StaticSet<U> object is returned.
	public <U> StaticSet<U> map(Function<T, U> mapMethod) {
		// *************************************************
		// Your code here (remove placeholder line below)
		// *************************************************
		return new StaticSet<>();
	}

	// Returns a StaticSet<T> containing every element from this set and every
	// element from otherSet.
	public StaticSet<T> union(StaticSet<T> otherSet) {
		// *************************************************
		// Your code here (remove placeholder line below)
		// *************************************************
		return new StaticSet<>();
	}

}

package iterator_pattern.numberSequences;

import java.util.*;

public class PrimeNumbers implements NumberSequence {
	HashMap<String, Integer> menuItems = new HashMap<String, Integer>();
	public PrimeNumbers() {
		menuItems.put("two", 2);
		menuItems.put("three", 3);
		menuItems.put("five", 5);
		menuItems.put("seven", 7);
	}

	@Override
	public Iterator<Integer> getIterator() {
		return menuItems.values().iterator();
	}
}

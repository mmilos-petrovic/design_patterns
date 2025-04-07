package iterator_pattern.numberSequences;

import java.util.Iterator;
import iterator_pattern.iterators.ArrayIterator;

public class OddNumbers implements NumberSequence {

    private final Integer[] items;
    public OddNumbers() {
        items = new Integer[]{1,3,5,7,9,11};
    }

    @Override
    public Iterator<Integer> getIterator() {
        return new ArrayIterator(this.items);
    }
}

package iterator_pattern.numberSequences;


import java.util.ArrayList;
import java.util.Iterator;

public class EvenNumbers implements NumberSequence {
    private final ArrayList<Integer> items;

    public EvenNumbers() {
        items = new ArrayList<Integer>();
        items.add(2);
        items.add(4);
        items.add(6);
        items.add(8);
    }

    @Override
    public Iterator<Integer> getIterator() {
        return items.iterator();
    }

}

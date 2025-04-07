package iterator_pattern;


import java.util.Iterator;
import iterator_pattern.numberSequences.*;
import java.util.List;

public class IteratorTest {
    private final List<NumberSequence> numberSequences;

    public IteratorTest(List<NumberSequence> numberSequences)
    {
        this.numberSequences = numberSequences;
    }

    public void printSequences(){
        Iterator<Integer> iterator;
        for (NumberSequence numberSequence : this.numberSequences) {
            iterator = numberSequence.getIterator();
            this.printIterator(iterator);
        }
    }

    private void printIterator(Iterator<Integer> iterator){
        while(iterator.hasNext())
        {
            System.out.println(iterator.next());
        }
    }
}

package iterator_pattern;

import iterator_pattern.numberSequences.*;

import java.util.ArrayList;
import java.util.List;
public class ClientApp {
    public static void main(String[] args){
        List<NumberSequence> numberSequences= new ArrayList<>();
        numberSequences.add(new EvenNumbers());
        numberSequences.add(new OddNumbers());
        numberSequences.add(new PrimeNumbers());
        IteratorTest iteratorTest = new IteratorTest(numberSequences);
        iteratorTest.printSequences();
    }
}

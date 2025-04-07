package iterator_pattern.iterators;
import java.util.Iterator;


public class ArrayIterator implements Iterator<Integer>{
    private final Integer[] items;
    private int position = 0;
    public ArrayIterator(Integer[] items)
    {
        this.items = items;
    }

    @Override
    public boolean hasNext() {
        return items.length > position;
    }

    @Override
    public Integer next() {
        position = position + 1;
        return items[position - 1];
    }

    @Override
    public void remove(){
        throw new UnsupportedOperationException("Remove not supported for Array Iterator.");
    }
}

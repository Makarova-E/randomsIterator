import java.util.Iterator;
import java.util.concurrent.ThreadLocalRandom;

public class Randoms implements Iterable<Integer> {
    protected int min;
    protected int max;

    public Randoms(int min, int max) {
        this.min = min;
        this.max = max;
        this.iterator();
    }

    @Override
    public Iterator<Integer> iterator() {
        return new NumbersIterator();
    }

    private class NumbersIterator implements Iterator<Integer> {
        @Override
        public boolean hasNext() {
            return true;
        }

        @Override
        public Integer next() {
            return ThreadLocalRandom.current().nextInt(min, max + 1);
        }
    }
}
package behave;

import java.util.Iterator;
import java.util.Random;
import java.util.stream.IntStream;

public class Randoms implements Iterable<Integer> {

    protected final Random random;
    private final IntStream stream;

    public Randoms(int min, int max) {
        random = new Random();
        stream = random.ints(min, max + 1);
    }

    @Override
    public Iterator<Integer> iterator() {
        return stream.iterator();
    }

}
package banch.task.company.iterator;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Super_3Iterator<T> implements Iterator {
    private Iterator<T> iterator;
    List<T> iter;
    int count;

    public Super_3Iterator(Object... iter) {
        this.iter = (List<T>) Arrays.asList(iter);
//        for ()
        this.count = 0;

        iterator = (Iterator<T>) Arrays.stream(iter).iterator();
    }

    private void flatIterators(Object... iter) {
//        if ()
    }

    @Override
    public boolean hasNext() {
        return count < iter.size();
    }

    @Override
    public Object next() {
        return iter.get(count++);
    }

    public void iterCycle() {

    }

    void print () {
        System.out.println("hello ");
    }
}

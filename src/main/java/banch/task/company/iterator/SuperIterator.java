package banch.task.company.iterator;

import java.util.Arrays;
import java.util.Iterator;

public class SuperIterator<T> implements Iterator<T> {

    private T[] arrayList;
    private int currentCont;

    public SuperIterator(Object... content) {
        this.arrayList = (T[]) Arrays.stream(content).toArray();
        currentCont = 0;
    }

    @Override
    public boolean hasNext() {
        return currentCont < arrayList.length && arrayList[currentCont] != null;
    }

    @Override
    public T next() {
        if (!(arrayList[currentCont] instanceof Iterator)) {
            return arrayList[currentCont++];
        } else {
//            List<T> list = getIterator((Iterator<T>) arrayList[currentCont++]);

            return new SuperIterator<T>(arrayList[currentCont++]).next();

//            return (T) ( (Iterator) arrayList[currentCont++].)

        }
    }

//    public List<T> getIterator(Iterator<T> iterator) {
//        List<T> list = new ArrayList<>();
//        while (iterator.hasNext()) {
//            list.add(iterator.next());
//        }
//        return list;
//    }

}

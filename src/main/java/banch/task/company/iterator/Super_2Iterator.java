package banch.task.company.iterator;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Super_2Iterator<T> implements Iterator{

        private List<T> tList;
        private int currentCont;

        public Super_2Iterator(Object... content) {
            this.tList = (List<T>) Arrays.asList(content);
            currentCont = 0;
        }

        @Override
        public boolean hasNext() {
            boolean result = currentCont < tList.size();
            if (result) {
                if (tList.get(currentCont) instanceof Iterator) {
                    if (((Iterator) tList.get(currentCont)).hasNext() ) {
                        return true;
                    } else currentCont++;
                }
            }
            return result;
        }

        @Override
        public T next() {
            if (!(tList.get(currentCont) instanceof Iterator)) {
                return tList.get(currentCont++);
            } else return (T) ((Iterator) tList.get(currentCont)).next();
        }


}

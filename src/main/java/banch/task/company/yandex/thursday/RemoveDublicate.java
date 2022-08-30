package banch.task.company.yandex.thursday;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;

/**
 * Напишите код для удаления дубликатов из несортированного связного списка.
 */
public class RemoveDublicate {

    private static LinkedList<Integer> inputList = new LinkedList<>();

    private static LinkedList<Integer> removeDubl(LinkedList<Integer> inputList) {
        HashSet<Integer> result = new HashSet<>();

        for (Iterator<Integer> x = inputList.iterator(); x.hasNext(); ) {
            if (!result.add(x.next())) {
                x.remove();
            }
        }
        return inputList;
//        inputList.removeIf(integer -> !result.add(integer));
    }

    /**
     * алгоритм дейкстры , поиск в глубину
     */

    /**
     * Для заданного направленного графа разработайте алгоритм,
     * проверяющий существование маршрута между двумя узлами.
     *
     * (поиска в глубину достаточно
     */

}

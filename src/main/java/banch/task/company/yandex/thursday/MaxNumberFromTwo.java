package banch.task.company.yandex.thursday;

import java.util.Arrays;

/**
 * Напишите метод, находящий максимальное из двух чисел
 * без использования if-else или любых других операторов сравнения.
 */
public class MaxNumberFromTwo {
    private static int maxFromTwo(int x, int y) {
//        int[] arr = new int[x + y];
//        return (x + y + Math.abs(x - y))/2;

        int[] res = new int[]{x, y};
        Arrays.sort(res);
        return res[1];

//        ArrayList<Integer> arrayList = new ArrayList<>();
//        arrayList.add(x, x);
//        arrayList.add(y, y);
//        return arrayList.get(arrayList.size()-1);
    }

    public static void main(String[] args) {
        System.out.println(maxFromTwo(3,4));
        System.out.println(maxFromTwo(10,4));
//        System.out.println(maxFromTwo(1, 4));
//        System.out.println(maxFromTwo(0, 10));
    }
}

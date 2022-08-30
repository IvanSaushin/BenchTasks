package banch.task.company.yandex.thursday;

/**
 *  Найти индекс числа в массиве сортированных чисел
 */
public class IndexNumber {
    static int[] array_1 = new int[] {1, 4, 5, 7, 9, 10};

    private static int findIndex(int x) {

//        for (int i = 0; i < array_1.length; i++) {
//            if (array_1[i] == x) {
//                result = i;
//            }
//        }

        return rec(0, array_1.length, x);
    }

    private static int rec(int st, int end, int comp) {
        int num = (end + st)/2;
        if (st > end || st < 0 || end > array_1.length) {
            return -1;
        }
        if (array_1[num] == comp) {
            return num;
        }
        if (array_1[num] > comp) {
            return rec(num+1, end, comp);
        } else if (array_1[num] < comp) {
            return rec(st, num - 1, comp);
        }

        return -1;
    }


    public static void main(String[] args) {
        System.out.println(findIndex(7));
        System.out.println(findIndex_2(7));
    }

    /**
     * Attempt 2
     */
    public static int findIndex_2(int source) {

        return rec_2(source, 0, array_1.length);
    }

    private static int rec_2(int num, int left, int right) {

        int avarage = left + (right - left) / 2;
        if (array_1[avarage] == num){
            return avarage;
        }

        if (array_1[avarage] > num) {
            return rec_2(num, left, avarage);
        } else if (array_1[avarage] < num) {
            return rec_2(num, avarage, right);
        }
        return -1;
    }
}

package banch.task.mytest;

/**
 *  Найти индекс числа в массиве сортированных чисел
 */
public class Test1IndexSortNumber {
    static int[] array_1 = new int[] {1, 4, 5, 7, 9, 10};

    public static void main(String[] args) {
        System.out.println(findIndex(9));
        System.out.println(findIndex(11));
    }

    public static int findIndex(int el) {

        return recursiveSort(0, array_1.length, el);
    }

    public static int recursiveSort(int stInd, int endInd, int comp) {
        int num = (stInd + endInd)/2;
        if (stInd > endInd || stInd > array_1.length-1 || endInd < 0) {
            return -1;
        }

        if (array_1[num] == comp) {
            return num;
        }
        if (comp > array_1[num]) {
            return recursiveSort(num+1, endInd, comp);
        } else {
            return recursiveSort(0, num-1, comp);
        }
    }
}

package banch.task.sort.quickSort;

import java.util.Arrays;

public class QuickSort {

    private static int[] testArr3 = new int[] {1, 9, 3, 7, 2, 10};

    public static void main(String[] args) {

        sort(testArr3, 0, testArr3.length-1);
        printArray(testArr3);
    }

    private static void sort(int[] source, int left, int right) {
        int curLeft = left;
        int curRight = right;
        int pivot = source[(left+right)/2]; //5

        do {
            // идем до первого эл-та слева, кот-й будет больше опорного
            while (source[curLeft] < pivot) {
                curLeft++; // 1 (9)
            }
            // идем до первого эл-та СПРАВА, кот-й будет МЕНЬШЕ опорного
            while (source[curRight] > pivot) {
                curRight--;  // 5 (2)
            }
            //
            if (curLeft <= curRight) {
                if (curLeft < curRight) { // 1, 9(2), 3, 7, 2(9), 10
                    int tmp = source[curLeft];          // 1, 9, 3, 7, 2, 10  (9)
                    source[curLeft] = source[curRight]; // 1, 2, 3, 7, 2, 10  (9)
                    source[curRight] = tmp;             // 1, 2, 3, 7, 9, 10
                }
                curLeft++;
                curRight--;
            }
        } while (curLeft <= curRight);

        if (curLeft < right) {
            sort(source, curLeft, right);
        }

        if (left < curRight) {
            sort(source, left, curRight);
        }

    }

    private static void printArray(int[] array) {
        System.out.println(Arrays.toString(array));
    }
}

package banch.task.sort.quickSort;

import java.util.Arrays;

public class QuickSort_2 {

    private static int[] testArr3 = new int[] {1, 9, 3, 7, 2, 10};
    private static int[] testArr2 = new int[] {9, 8, 7, 6, 5, 4, 3, 2, 1}; // 9


    public static void main(String[] args) {

        testArr2 = quickSort(testArr2, 0, testArr2.length-1);
        System.out.println(Arrays.toString(testArr2));
    }

    private static int[] quickSort(int[] source, int leftOrder, int rightOrder) {
        if (source.length < 2) {
            return source;
        }
        int pivot = source.length/2;
        int leftPos = leftOrder;
        int rightPos = rightOrder;

        do {
            while (source[leftPos] < source[pivot]) {
                leftPos++;
            }
            while (source[rightPos] > source[pivot]) {
                rightPos--;
            }

            if (leftPos <= rightPos) {
                int tmp = source[leftPos];
                source[leftPos] = source[rightPos];
                source[rightPos] = tmp;
                leftPos++;
                rightPos--;
            }
        } while (leftPos <= rightPos);

        if (leftPos < pivot) {
            quickSort(source, leftPos, pivot);
        }
        if (rightPos > pivot) {
            quickSort(source, pivot, rightPos);
        }

        return source;
    }
}

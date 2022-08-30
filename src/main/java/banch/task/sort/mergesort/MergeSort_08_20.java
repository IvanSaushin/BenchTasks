package banch.task.sort.mergesort;

import java.util.Arrays;

public class MergeSort_08_20 {

    private static int[] testArr3 = new int[] {9, 8, 7, 6, 5, 4, 3, 2, 1}; // 9

    public static void main(String[] args) {
        testArr3 = mergeSortRec(testArr3);
        System.out.println(Arrays.toString(testArr3));
    }

    private static int[] mergeSortRec(int[] source) {
        int size = source.length;
        if (size < 2) return source;

        int[] leftPart = new int[source.length/2];
        System.arraycopy(source, 0, leftPart, 0, size/2);

        int[] rightPart = new int[size - leftPart.length];
        System.arraycopy(source, size/2, rightPart, 0, size - leftPart.length);

        leftPart = mergeSortRec(leftPart);
        rightPart = mergeSortRec(rightPart);

        return mergeArray(leftPart, rightPart);
    }

    private static int[] mergeArray(int[] leftArr, int[] rightArr) {
        int[] result = new int[leftArr.length + rightArr.length];
        int posLeft = 0;
        int posRight = 0;
        int posResult = 0;

        while (posLeft < leftArr.length && posRight < rightArr.length) {
            if (leftArr[posLeft] < rightArr[posRight]) {
                result[posResult++] = leftArr[posLeft++];
            } else
                result[posResult++] = rightArr[posRight++];
        }

        for (int i = posLeft; i < leftArr.length; i++) {
            result[posResult++] = leftArr[posLeft++];
        }
        for (int i = posRight; i < rightArr.length; i++) {
            result[posResult++] = rightArr[posRight++];
        }

        return result;
    }


}

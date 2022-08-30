package banch.task.sort.mergesort;

import java.util.Arrays;

public class MergeSort_08_20_2 {


    public static void main(String[] args) {
        int[] testArr3 = new int[] {9, 8, 7, 6, 5, 4, 3, 2, 1}; // 9\

        testArr3 = mergeSort(testArr3);
        System.out.println(Arrays.toString(testArr3));
    }

    private static int[] mergeSort(int[] source) {
        int size = source.length;
        if (size < 2) {
            return source;
        }

        int[] left = new int[source.length/2];
        System.arraycopy(source, 0, left, 0, size/2);

        int[] right = new int[size - left.length];
        System.arraycopy(source, size/2, right, 0, size - left.length);

        left = mergeSort(left);
        right = mergeSort(right);

        return mergeArray(left, right);
    }

    private static int[] mergeArray(int[] left, int[] right) {
        int[] result = new int[left.length + right.length];
        int leftPos = 0;
        int rightPos = 0;
        int resultPos = 0;

        while (leftPos < left.length && rightPos < right.length){
            if (left[leftPos] < right[rightPos]) {
                result[resultPos++] = left[leftPos++];
            } else {
                result[resultPos++] = right[rightPos++];
            }
        }

        /**
         * здесь допустил ошибку - не проинкрементил значения (никакие),
         * думая, что зайдет сюда лишь 1 раз
         * Кейс - пришло [8, 9] and [6, 7] -> res: [6, 7, 0, 0]
         * поэтому нужно инкрементить значения все и здесь
          */
        for (int i = leftPos; i < left.length; i++) {
            result[resultPos++] = left[leftPos++];
        }
        for (int i = rightPos; i < right.length; i++) {
            result[resultPos++] = left[rightPos++];
        }

        return result;
    }


}

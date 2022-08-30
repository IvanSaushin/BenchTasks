package banch.task.leetcode;

import java.util.Arrays;

// hard (1)
public class FindMissingPositive {

    public static void main(String[] args) {

        System.out.println(firstMissingPositive(new int[] {-1, -2, 3, 0}));
        System.out.println(firstMissingPositive(new int[] {0, 1, 2}));
        System.out.println(firstMissingPositive(new int[] {7, 8, 9, 10}));
        System.out.println(firstMissingPositive(new int[] {3, 4, -1, 1}));
    }

    public static int firstMissingPositive(int[] nums) {
        int min = 1;
        nums  = Arrays.stream(nums).filter(e -> e>0).sorted().toArray();

        for (int i = 0; i < nums.length; i++) {
            if (min == nums[i]) {
                min = nums[i] +1;
            }
        }

        return min;
    }


}

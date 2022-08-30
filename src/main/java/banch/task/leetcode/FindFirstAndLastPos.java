package banch.task.leetcode;

import java.util.Arrays;

public class FindFirstAndLastPos {

    public static void main(String[] args) {
        System.out.println("3, 4 = \t"+Arrays.toString(
                searchRange(new int[]{5,7,7,8,8,10}, 8))); // 3,4
        System.out.println("-1, -1 = \t"+Arrays.toString(
                searchRange(new int[]{}, 0))); // -1, -1
        System.out.println("-1, -1 = \t"+Arrays.toString(
                searchRange(new int[]{5,7,7,8,8,10}, 6))); // -1, -1
        System.out.println("0, 1 = \t"+Arrays.toString(searchRange(new int[]{2, 2}, 2))); // 0, 1
        System.out.println("1, 1 = \t"+Arrays.toString(searchRange(new int[]{1, 4}, 4))); // 1, 1
        System.out.println("0, 0 = \t"+Arrays.toString(searchRange(new int[]{1}, 1))); // 0, 2
        System.out.println("-1, -1 = \t"+Arrays.toString(searchRange(new int[]{1}, 0))); // 0, 2
        System.out.println("0, 2 = \t "+Arrays.toString(searchRange(new int[]{3, 3, 3}, 3))); // 0, 2
    }


    public static int[] searchRange(int[] nums, int target) {
        int[] result = new int[2];
        int min = -1;
        int max = -1;

        if (nums.length == 1) {
            if (nums[0] == target) {return new int[] {0, 0};
            } else return new int[] { -1, -1};
        }

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target){
                if (min == -1) {
                    min = i;
                } else {
                    max = i;
                }
            }
        }

        if (max==-1 && min!=-1) {
            max = min;
        }

        result[0] = min;
        result[1] = max;
        return result;
    }








        public static int[] searchRange_0(int[] nums, int target) {
        int[] res = new int[2];
        int count = 0;

        if (nums.length==1) {
            if (nums[0]==target) {res[0] = 0; res[1] = 0;
            } else {res[0]=-1; res[1]=-1;}
            return res;
        }

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                if (count==0) {
                    res[count++] = i;
                } else if (count==1) {
                    res[count++] = i;
                } else return new int[]{-1, -1};
            }
            if (i == nums.length-1 && count==1 && res[1]==0) {
                res[1]=res[0];
                return res;
            }
        }
        if (res[0]==0 && res[1]==0) {
            return new int[] {-1, -1};
        }

        return res;
    }
}

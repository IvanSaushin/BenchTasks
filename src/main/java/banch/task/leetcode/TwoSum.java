package banch.task.leetcode;

// easy
public class TwoSum {

    public static void main(String[] args) {
        int[] arr1 = {2, 7, 11, 15};

        twoSum(arr1, 9);
    }

    public static int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (i==j) break;
                if (nums[i] + nums[j] == target) {
                    result[0] = j;
                    result[1] = i;
                    return result;
                }
            }
        }
        return result;
    }

}

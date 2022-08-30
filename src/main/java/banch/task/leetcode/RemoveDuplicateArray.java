package banch.task.leetcode;

// easy, only with a hint
public class RemoveDuplicateArray {

    public static void main(String[] args) {
        int[] arr1 = {1, 1, 2}; // 2
        int[] arr2 = {0,0,1,1,1,2,2,3,3,4}; // 5

//        System.out.println(removeDuplicates(arr1));
//        System.out.println(removeDuplicates(arr2));
        System.out.println(removeMyMethod(arr1));
        System.out.println(removeMyMethod(arr2));
    }

    public static int removeMyMethod(int[] nums) {
        int result = 1;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i]!=nums[result-1]) nums[result++]=nums[i];
        }

        return result;
    }




    public static int removeDuplicates(int[] nums) {
        int p = 1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]!=nums[p-1]) nums[p++]=nums[i];
        }

        return p;
    }
}

package banch.task.leetcode;

public class RemoveElement {

    public static void main(String[] args) {
        int[] arr1 = {3,2,2,3};
        int[] arr2 = {0,1,2,2,3,0,4,2};

        System.out.println(removeElement(arr1, 3));
        System.out.println(removeElement(arr2, 2));
    }

    public static int removeElement(int[] nums, int val) {
        int res = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) nums[res++]=nums[i];
        }
        return res;
    }
}

package banch.task.leetcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Permutations {

    public static void main(String[] args) {

        permute(new int[] {1, 2, 3, 4}).forEach(System.out::println);


    }



    public static List<List<Integer>> permute(int[] nums) {
        Set<List<Integer>> result = new HashSet<>();
        recursion(nums, nums.length, new ArrayList<>(), result);
        return new ArrayList<>(result);
    }

    public static void recursion(int[] nums, int count, List<Integer> currentList, Set<List<Integer>> result) {

        if (nums.length == currentList.size()){
            currentList = currentList.stream().distinct().collect(Collectors.toList());
            if (currentList.size()==nums.length) {
                result.add(new ArrayList<>(currentList));
            }
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            currentList.add(nums[i]);
            recursion(nums, count-1, currentList, result);
            currentList.remove(currentList.size()-1);
        }
    }
}

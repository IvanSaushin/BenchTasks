package banch.task.leetcode;

import java.util.ArrayList;
import java.util.List;

public class Permutation_2 {

    public static void main(String[] args) {
        permute(new int[] {1, 2, 3, 4});
    }


    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result=new ArrayList<>();
        permute(nums,new boolean[nums.length],new ArrayList<Integer>(),result);
        return result;
    }

    private static void permute(int[] nums,boolean[] visited,ArrayList<Integer> per,List<List<Integer>> result) {
        if(per.size()==nums.length) {
            result.add(new ArrayList<>(per));
            System.out.println(per);;
            return;
        }
        for(int i=0;i<nums.length;i++) {
            if(visited[i])continue;
            visited[i]=true;
            per.add(nums[i]);
            permute(nums,visited,per,result);
            visited[i]=false;
            per.remove(per.size()-1);
        }
    }
}

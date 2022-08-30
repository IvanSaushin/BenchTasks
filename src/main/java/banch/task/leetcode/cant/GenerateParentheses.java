package banch.task.leetcode.cant;

import java.util.ArrayList;
import java.util.List;

// can't medium
public class GenerateParentheses {

    public static void main(String[] args) {
//        System.out.println(generateParenthesis(2));
//        System.out.println(generateParenthesis(3));
//        System.out.println(generateParenthesis2(2));
        System.out.println(generateParenthesis2(3));
    }

    public static List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        StringBuilder oneString = new StringBuilder();
        int curCount = 0;

        for (int i = 0; i < n; i++) {
            oneString.append("(");
            if (i==n-1){
                while (curCount!=n) {
                    oneString.append(")");
                    curCount++;
                }
                result.add(oneString.toString());
                oneString.setLength(0);
            }
        }
        for (int i = 0; i < n; i++) {
            oneString.append("()");
            if (i==n-1) {
                result.add(oneString.toString());
                oneString.setLength(0);
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                oneString.append("(");
            }
        }
        return result;
    }

    public static List<String> generateParenthesis2(int n) {

        List<String> result = new ArrayList<>();

        helper(n, result, 0, new char[2*n], 0, 0);
        return result;
    }

    public static void helper(int n, List<String> result, int pos, char[] arr, int count, int open){

        if(open < 0){
            return;
        }

        if(count == 2*n){
            if(open == 0){
                result.add(new String(arr));
            }
            return;
        }
        arr[pos] = '(';
        helper(n, result, pos+1, arr, count+1, open+1);
        arr[pos] = ')';
        helper(n, result, pos+1, arr,count+1, open-1);
    }


}

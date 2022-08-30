package banch.task.leetcode;


// easy, 3
public class PalindromeNumber {

    public static void main(String[] args) {
        int int1 = 121;
        int int2 = -121;
        int int3 = 1002;
        int int4 = 1001;

        System.out.println(isPalindrome(121));
        System.out.println(isPalindrome(-121));
        System.out.println(isPalindrome(1002));
        System.out.println(isPalindrome(1001));
    }

    public static boolean isPalindrome(int x) {
        boolean result = true;
        if (x < 0) { return  false; }

        char[] chars = String.valueOf(x).toCharArray();

        for (int i = 0; i < chars.length; i++) {
            if (!(chars[i] == chars[chars.length-1-i])) {
                result = false;
            }
        }

        return result;
    }
}

package banch.task.leetcode;

public class ImplementsStr {

    public static void main(String[] args) {

        System.out.println(strStr("hello", "ll"));
        System.out.println(strStr("", ""));
        System.out.println(strStr("abcd", "c"));
        System.out.println(strStr("abcd", "f"));
    }

    public static int strStr(String haystack, String needle) {
        if (needle.equals("")) {
            return 0;
        }

        int u = haystack.indexOf(needle);

        return u;
    }
}

package banch.task.another;

/**
 * Задача
 * . String s = "dddacccd";
 *         // d3ac3d
 */

public class RunLengthEncoding {

    public static void main(String[] args) {
        System.out.println(getRLE("dddacccd"));
        System.out.println(getRLE("aaabbc"));
        System.out.println(getRLE("aaabbbbcc"));
    }

    public static String getRLE(String str) {
        if (str == null || str.equals("")) {
            return str;
        }
        char currentChar = str.charAt(0);
        int currentCharCount = 1;
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= str.length(); i++) {
            char c = i < str.length() ? str.charAt(i) : 0;
            if (i == str.length() || currentCharCount == 9 || c != currentChar) {
                sb.append(currentChar);
                if (currentCharCount > 1)
                {
                    sb.append((char)(currentCharCount + '0'));
                }
                currentCharCount = 1;
                currentChar = c;
            } else {
                currentCharCount++;
            }
        }
        return sb.toString();
    }


/*
    взято отсюда
    https://ru.stackoverflow.com/questions/647067/%D0%A0%D0%B5%D0%B0%D0%BB%D0%B8%D0%B7%D0%B0%D1%86%D0%B8%D1%8F-%D0%B0%D0%BB%D0%B3%D0%BE%D1%80%D0%B8%D1%82%D0%BC%D0%B0-rle-%D0%B4%D0%BB%D1%8F-%D1%81%D1%82%D1%80%D0%BE%D0%BA%D0%B8
*/

}

package banch.task.another;

/**
 * Cоздать приложение, упаковывающее строки с помощью алгоритма RLE.
 * В случае Вашего приложения нужно заменить последовательность одинаковых
 * букв на букву, за которой будет следовать цифра от 2 до 9, что укажет
 * на количество повтора символов. Если символ встретился только 1 раз
 * то замену делать не нужно.
 */
public class RLE_2 {

    public static void main(String[] args) {
        String _1 = "d";
        String _2 = "dddacccd";
        String _3 = "aaabbc";
        String _4 = "aaabbbbcc";
        System.out.println(getRLE(_1));
        System.out.println(getRLE(_2)); // d3ac3d
        System.out.println(getRLE(_3));   // a3b2c
        System.out.println(getRLE(_4));// a3b4c2

        System.out.println(getRLE(_1).equals("d"));
        System.out.println(getRLE(_2).equals("d3ac3d"));
        System.out.println(getRLE(_3).equals("a3b2c"));
        System.out.println(getRLE(_4).equals("a3b4c2"));
    }

    public static String getRLE(String str) {
        if (str == null || str.equals("")) {
            return str;

        }
        StringBuilder sb = new StringBuilder();
        char currentChar = str.charAt(0);
        int currentCount = 1;

        for (int i = 1; i <= str.length(); i++) {
            char nextChar = i != str.length() ? str.charAt(i) : 0;

            if (i == str.length() || currentChar != nextChar) {
                sb.append(currentChar);
                if (currentCount > 1) {
                    sb.append(currentCount);
                    currentCount = 1;
                }
                currentChar = nextChar;
            } else {
                currentCount++;
            }
        }

        return sb.toString();
    }
}

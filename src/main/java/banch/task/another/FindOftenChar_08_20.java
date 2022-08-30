package banch.task.another;

import java.util.HashMap;
import java.util.Map;

/**
 * Найти символ, который чаще всего встречается в строке
 * и количество вхождений в подстроку
 */
public class FindOftenChar_08_20 {
    private static String first = "aa";             // a, 2
    private static String sec = "abracadabra WASr"; // a, 5
    private static String third = "whatse you numbere"; // e, 3
    private static String forth = "aa";                 // a2

    public static void main(String[] args) {
        System.out.println(findOftenChar(first));
        System.out.println(findOftenChar(sec));
        System.out.println(findOftenChar(third));
        System.out.println(findOftenChar(forth));
    }

    private static Pair<Character, Integer> findOftenChar(String str) {
        if (str == null || str.equals("")) {
            return null;
        }

        Pair<Character, Integer> max = new Pair<Character, Integer>();
        String[] wordsArray = str.split(" ");
        int maxCount = 1;

        for (String s : wordsArray){
            Map<Character, Integer> map = new HashMap<>();

            for (char c : s.toCharArray()) {

                Integer curCount = map.get(c);
                if (curCount != null) {
                    map.put(c, ++curCount);
                    if (curCount > maxCount) {
                        maxCount = curCount;
                        max.oftenChar = c;
                        max.count = maxCount;
                    }
                } else {
                    map.put(c, 1);
                }
            }
        }

        return max;
    }
}

class Pair<T, V> {
    T oftenChar;
    V count;

    public Pair() {

    }

    @Override
    public String toString() {
        return String.valueOf(oftenChar).concat(String.valueOf(count));
    }
}

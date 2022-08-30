package banch.task.company.yandex.thursday;

import java.util.Arrays;

/**
 * Для двух строк напишите метод, определяющий,
 * является ли одна строка перестановкой другой.
 */
public class AnagrammTwo {

    // abcd, dcba

    private static boolean isSameString(String oneS, String twoS) {
        char[] firstCh = oneS.toCharArray();
        char[] secondCh = twoS.toCharArray();
        if (oneS.length() != twoS.length()) {
            return false;
        }

        Arrays.sort(firstCh);
        Arrays.sort(secondCh);

        return Arrays.compare(firstCh, secondCh) == 0;
        // через массив интов, инкремент и декремент
    }

    public static void main(String[] args) {
        System.out.println(isSameString("abcd", "dcba"));
        System.out.println(isSameString("abcd", "dcbaa"));
        System.out.println(isSameString("abcd", "dcbc"));
    }
}

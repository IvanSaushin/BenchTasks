package banch.task.another;

import java.util.LinkedHashSet;
import java.util.Set;

public class WordsAnagramm {

    static String nameIvan = "12345678910";
    static char[] word = nameIvan.toLowerCase().toCharArray();
    static Set<String> setWords = new LinkedHashSet<>();
    static int z = 0;


    public static void main(String[] args) {

        x(word.length);
        System.out.println(setWords.size());
        System.out.println(z);
        int count = 0;

        for (String c: setWords) {
            if (true) {
                System.out.println(c);
                count++;
            }
        }

        System.out.println(count);

    }

    public static void x(int lenght) {

        if (lenght<=1){
            return;
        }

        for (int i = 0; i < lenght; i++) {
            x(lenght-1);
            setWords.add(String.valueOf(word));
            rotate(lenght);
        }

    }

    private static void rotate(int lenght) {
        int position = word.length-lenght;
        char tempChar = word[position];

        for (int i = position+1; i < word.length; i++ ) {
            word[i - 1] = word[i];
        }
        word[word.length-1] = tempChar;
        z++;
    }
}

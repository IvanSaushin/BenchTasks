package banch.task.company.yandex.docFile;

/**
 нужно реализовать функцию OneEditApart , проверяющую,
 можно ли одну строку получить из другой не более,
 чем за одно исправление (удаление, добавление, изменение символа):
 OneEditApart("cat", "dog") -> false
 OneEditApart("cat", "cats") -> true
 OneEditApart("cat", "cut") -> true
 OneEditApart("cat", "cast") -> true
 OneEditApart("cat", "at") -> true
 OneEditApart("cat", "acts") -> false
 */

public class OneEditApart {
//    Решено  не оптимально,  и не хватает некоторых кейсов:
    public boolean oneEditApart(String example, String checked) {
        boolean result = true;

        if ((example.length() - checked.length()) > 1
                || (checked.length() - example.length()) > 1) {
            return false;
        }
        if(example.contains(checked)
                || checked.contains(example)) {
            return true;
        }

        if (example.length() > checked.length()) {
            String tmp = example;
            example = checked;
            checked = tmp;
        }

        if (example.length() != checked.length()) {
            for (int i = 0; i < example.length(); i++) {
                char c = example.charAt(i);
                if (checked.charAt(i) != c) {
                    // обсудили
                    String leftEnding = example.substring(i);
                    String rightEnding = checked.substring(i + 1);
                    if (!leftEnding.equals(rightEnding)) {
                        return false;
                    }
                }
            }
        } else {
            int counter = 0;
            for (int i = 0; i < example.length(); i++) {
                char c = example.charAt(i);
                if (c != checked.charAt(i)) {
                    // cat
                    // cut
                    if (counter == 1) {
                        return false;
                    }
                    counter++;
                }
            }

        }


        return result;
    }

// cat
// cats
//  .

// cat
// scat
// .

// cat
// csat
//  .

// cast

// cst

}

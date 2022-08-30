package banch.task.another.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

/**
 * Терминальная операция.
 * принимает два элемента и выполняет над ними некоторую операцию, возвращая результат
 * Первый параметр представляяет промежуточный результат функции,
 * а второй параметр - следующий элемент в потоке.
 */
public class Reduce_Tutorial {

    public static void main(String[] args) {

        // 1
        Stream<Integer> numbersStream = Stream.of(1,2,3,4,5,6);
        Optional<Integer> result1 = numbersStream.reduce((x, y)->x*y);
        System.out.println(result1.get()); // 720

        // 2
        Stream<String> wordsStream = Stream.of("мама", "мыла", "раму");
        Optional<String> sentence = wordsStream.reduce((x,y)->x + " " + y);
        System.out.println(sentence.get());

        // 3
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
        int result_3 = numbers
                .stream()
                .reduce(0, (subtotal, element) -> subtotal + element);
        System.out.println((result_3));

        int result_3_2 = numbers.stream().reduce(0, Integer::sum);
        System.out.println((result_3_2));
    }
}

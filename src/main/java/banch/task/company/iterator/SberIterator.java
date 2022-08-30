package banch.task.company.iterator;

import java.util.stream.Stream;

public class SberIterator {
    public static void main(String[] args) {

//        Super_3Iterator<String> iterator = new Super_3Iterator<>("a", "b");
//                Stream.of("c", "d").iterator());
//        SuperIterator<String> iterator = new SuperIterator<>("a", "b", Stream.of("c", "d").iterator());
//        Super_2Iterator<String> iterator = new Super_2Iterator<>("a", "b", Stream.of("c", "d").iterator());
        Super_2Iterator<String> iterator = new Super_2Iterator<>(
                Stream.of("-1", "0").iterator(),
                "a", "b",
                    Stream.of("c", "d",
                            Stream.of("Z").iterator())
                    .iterator(),
                "e");

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        /*
        a
        b
        c
        d
         */
    }
}

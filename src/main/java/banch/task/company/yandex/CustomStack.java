package banch.task.company.yandex;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Stack;

/**
 * Как реализовать стек, в котором кроме стандартных
 * функций push и рор будет поддерживаться функция min,
 * возвращающая минимальный элемент? Все операции - push,
 * рор и min - должны выполняться за время O(1).
 */
public class CustomStack {
    private Stack<Integer> stack = new Stack<>();
    private Stack<Integer> min = new Stack<>();

    public Integer push(Integer el) {

        Integer minEl = el;
        if (!min.isEmpty() && el > min.peek()) {
            minEl = min.peek();
        }
        min.push(minEl);
        return stack.push(el);
    }

    public Integer pop() {
        min.pop();
        return stack.pop();
    }

    public Integer min() {
        return min.peek();
    }

    public static void main(String[] args) {
//        int[] res = squareArray(new int[] {8, 9, 0, -2});
//        System.out.println(Arrays.toString(res));

        CustomStack stack = new CustomStack();
        stack.push(3);
        stack.push(4);
        stack.push(7);
        stack.push(2);
        stack.push(9);

        stack.pop();
        stack.pop();

        System.out.println(stack.min());
    }

    private static int[] squareArray(int[] inputArray) {

        int[] result = Arrays.stream(inputArray)
                .boxed()
                .map(e -> e * e)
                .sorted(Comparator.reverseOrder())
                .mapToInt(e -> e)
                .toArray();

        return result;
    }
}

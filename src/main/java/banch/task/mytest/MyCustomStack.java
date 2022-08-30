package banch.task.mytest;

import java.util.Stack;

/**
 * Как реализовать стек, в котором кроме стандартных
 * функций push и рор будет поддерживаться функция min,
 * возвращающая минимальный элемент? Все операции - push,
 * рор и min - должны выполняться за время O(1).
 */
public class MyCustomStack {
    Stack<Integer> stack = new Stack<>();
    Stack<Integer> min = new Stack<>();

    Integer push(Integer el) {
        Integer minEl = el;
        if (!min.isEmpty() && el > min.peek()) {
            minEl = min.peek();
        }
        min.push(minEl);
        return stack.push(el);
    }


    // 3 4 7 2 4

    //

}

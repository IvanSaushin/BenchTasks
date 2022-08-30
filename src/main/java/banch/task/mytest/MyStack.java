package banch.task.mytest;

public class MyStack<T> {

    private T[] arrayStack;
    private int top;
    private int size;

    public MyStack() {
        arrayStack = (T[]) new Object[16];
        size = 16;
        top = -1;
    }

    void push(T el) {
        top++;
        arrayStack[top] = el;
    }

    void pop() {
        arrayStack[top] = null;
        top--;
    }

    T peek() {
        return arrayStack[top];
    }

    boolean isEmpty() {
        return top < 0;
    }
}

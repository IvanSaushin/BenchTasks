package banch.task.mytest;

public class MainMyStack {

    public static void main(String[] args) {
        MyStack<String> test1 = new MyStack<>();

        System.out.println(test1.isEmpty());

        test1.push("111");
        test1.push("2");
        test1.push("333");

        test1.pop();

        System.out.println(test1.peek());
    }
}

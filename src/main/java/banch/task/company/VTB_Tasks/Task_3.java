package banch.task.company.VTB_Tasks;

public class Task_3 {

    class A {
        String str = "ab";

        A() {

        }

        void printLength() {
            System.out.println(str.length());
        }

    }

    class B extends A {
        String str = "abc";

        void printLength() {
            System.out.println(str.length());
        }
    }


    public static void main(String[] args) {

        new Task_3().new B();
    }
}

/*
Что получится в результате компиляции и исполнения? Почему?

Ответ ниже
 */











/*

3 NullPointerException - так как class B extends A то при запуске кода класс А еще не загружен

 */

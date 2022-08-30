package banch.task.company.VTB_Tasks;

public class Task_2 {

    static String str = "Hello";

    public static void change(String s) {
        s = "world";
    }

    public static void main(String[] args) {
        System.out.println(str);
        change(str);
        System.out.println(str);
    }
}

/*
Что напечатает метод main? Почему?

Ответ ниже ->
 */



























/*
2 Выведе в sout Hello - так как класс String финализирован, то при старте метода наша строка не изменится. Hello лежит в пуле строк
Доп: тут вообще не про пул строк, да они там храняться, но тут вопрос в глобальных и локальных переменных и в том, что передается в метод change

 */

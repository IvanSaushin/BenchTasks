package banch.task.company.yandex;

/**
 * Напишите программу, которая выводит на экран числа от 1 до N.
 * При этом вместо чисел, кратных трем, программа должна выводить
 * слово «Fizz», а вместо чисел, кратных пяти — слово «Buzz».
 * Если число кратно и 3, и 5, то программа должна выводить
 * слово «FizzBuzz»
 */
public class FizzBuzz {

    public String checkNum(int num) {
        String fizz = "Fizz";
        String buzz = "Buzz";

        if (num % 3 == 0 && num % 5 == 0) {
            return fizz+buzz;
        } else if (num % 3 == 0) {
            return fizz;
        } else if (num % 5 == 0) {
            return buzz;
        } else return String.valueOf(num);
    }
}

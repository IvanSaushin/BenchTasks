package banch.task.another;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Brackets_2 {
    static Map<Character, Character> brackets = new HashMap<>();

    public static void main(String[] args) {
        String input = "{ ( ) }";           // true
        String input1 = "(ab[c]{d<>}e)ff";  // true
        String input2 = "))))";             // false
        String input3 = "(abc[)";           // false
        String input4 = "(ab[c)d]";         // false
        String[] strArr = {input, input1, input2, input3, input4};

        for (String s : strArr) {
            System.out.println("for: " + s +": "+checkString(s.toCharArray()));
        }
    }

    private static Boolean checkString(char[] toCharArray) {
        Stack<Character> stack = new Stack<>();

        for (Character c : toCharArray) {
            if (brackets.containsKey(c)) {
                stack.push(c);
            } else if (brackets.containsValue(c)) {
                if (stack.isEmpty()) {
                    return false;
                }
                if (c != brackets.get(stack.pop())) {
                    return false;
                }
            }


        }

        return true;
    }

    static {
        brackets.put('[', ']');
        brackets.put('{', '}');
        brackets.put('(', ')');
    }


}

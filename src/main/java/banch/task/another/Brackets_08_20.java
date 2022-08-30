package banch.task.another;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Brackets_08_20 {

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

    private static boolean checkString(char[] source) {
        Stack<Character> stack = new Stack<>();

        for (char c : source) {
            if (brackets.containsKey(c)) {
                stack.push(c);
            } else if (brackets.containsValue(c)) {
                if (stack.isEmpty() ) {
                    return false;
                }
                char cur = brackets.get(stack.pop());
                if (cur != c) {
                    return false;
                }
            }
        }

//        for (char c : source) {
//            if (brackets.containsKey(c)) {
//                stack.push(c);
//            } else if (brackets.containsValue(c)) {
//                if (!stack.isEmpty() && !brackets.containsKey(stack.pop())) {
//                    return false;
//                }
//            }
//        }
        return stack.isEmpty();
    }

    static {
        brackets.put('{', '}');
        brackets.put('[', ']');
        brackets.put('(', ')');
    }
}

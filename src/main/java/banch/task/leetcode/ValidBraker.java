package banch.task.leetcode;

import java.util.Stack;

public class ValidBraker {

    public static void main(String[] args) {
        System.out.println(isValid("{}"));
        System.out.println(isValid("(){}[]"));
        System.out.println(isValid("{[]}"));
        System.out.println(isValid("{)"));
        System.out.println(isValid("]"));
        System.out.println(isValid("(])"));
    }

    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        char[] chars = s.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            if (chars[i]=='(' || chars[i]=='{' || chars[i]=='[') {
                stack.push(chars[i]);
            }
            if(stack.isEmpty() && (chars[i]==')' || chars[i]==']' || chars[i]=='}')) {
                return false;
            }
            switch (chars[i]) {
                case '}' :
                    if (stack.peek().equals('{')) stack.pop();
                    else return false;
                    break;
                case ')' :
                    if (stack.peek().equals('(')) stack.pop();
                    else return false;
                    break;
                case ']' :
                    if (stack.peek().equals('[')) stack.pop();
                    else return false;
                    break;
            }
        }

        return stack.isEmpty();


        /*    or
        HashMap<Character,Character> maps=new HashMap<Character,Character>();
        maps.put(')','(');
        maps.put(']','[');
        maps.put('}','{');
        Stack<Character> stack=new Stack<Character>();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(maps.containsKey(c)){
                if(stack.empty()||stack.pop()!=maps.get(c))return false;
            }
            else
                stack.push(c);
        }
        return stack.empty();
         */
    }
}

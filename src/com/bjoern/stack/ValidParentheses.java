package src.com.bjoern.stack;

import java.util.HashMap;
import java.util.Stack;

public class ValidParentheses {
    public static void main(String[] args) {
        System.out.println(isValid("([{}])"));
        System.out.println(isValid("[(])"));
    }

    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        HashMap<Character, Character> map = new HashMap<>();
        map.put('(', ')');
        map.put('{', '}');
        map.put('[', ']');

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (map.containsKey(c)) {
                stack.push(c);
            } else {
                if (stack.isEmpty() || map.get(stack.pop()) != c) {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }
}

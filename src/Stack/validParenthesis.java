package Stack;

import java.util.Stack;

//Question
//https://leetcode.com/problems/valid-parentheses/description/
public class validParenthesis {
    public boolean isValid(String s) {

        Stack<Character> stack = new Stack<>();
        char[] arr = s.toCharArray();
        for (char ch : arr) {
            if (isOpen(ch)) {
                stack.push(ch);
            } else {
                if (stack.isEmpty()) return false;
                else if (!same(stack.peek(), ch)) return false;
                else
                    stack.pop();

            }
        }
        return stack.isEmpty();
    }

    public boolean same(char a, char b) {
        return a == '(' && b == ')' || a == '{' && b == '}' || a == '[' && b == ']';
    }

    public boolean isOpen(char a) {
        return a == '(' || a == '{' || a == '[';
    }
}


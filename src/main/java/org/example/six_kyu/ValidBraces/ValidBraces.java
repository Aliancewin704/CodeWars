package org.example.six_kyu.ValidBraces;

import java.util.Stack;

public class ValidBraces {

    public static boolean isValid(String braces) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; braces.length() > i; i++) {
            if(braces.charAt(i) == '(' || braces.charAt(i) == '[' || braces.charAt(i) == '{') {
                stack.push(braces.charAt(i));
                continue;
            }
            if (braces.charAt(i) == ')') {
                if (stack.empty() || stack.peek() != '(') {
                    return false;
                }
                stack.pop();
            }
            if (braces.charAt(i) == '}') {
                if (stack.empty() || stack.peek() != '{') {
                    return false;
                }
                stack.pop();
            }
            if (braces.charAt(i) == ']') {
                if (stack.empty() || stack.peek() != '[') {
                    return false;
                }
                stack.pop();
            }
        }
        return stack.empty();
    }
}

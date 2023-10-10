package org.example;

import java.util.Stack;

public class LeetCodeExercise20ValidParentheses {

    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char currSymbol = s.charAt(i);
            if (currSymbol == '[' || currSymbol == '(' || currSymbol == '{') {
                stack.push(currSymbol);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }
                char lastSymbolFromStack = stack.pop();
                if (currSymbol == ']' && lastSymbolFromStack != '[') {
                    return false;
                }
                if (currSymbol == ')' && lastSymbolFromStack != '(') {
                    return false;
                }
                if (currSymbol == '}' && lastSymbolFromStack != '{') {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }
}

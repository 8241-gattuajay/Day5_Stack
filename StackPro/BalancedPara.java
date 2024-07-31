package StackPro;

import java.util.Stack;
public class BalancedPara {

        public static boolean isBalanced(String s) {
            Stack<Character> stack = new Stack<>();
            for (char c : s.toCharArray()) {
                if (c == '(' || c == '{' || c == '[') {
                    stack.push(c);
                } else if (c == ')' || c == '}' || c == ']') {
                    if (stack.isEmpty()) {
                        return false;
                    }
                    char top = stack.pop();
                    if ((c == ')' && top != '(') ||
                            (c == '}' && top != '{') ||
                            (c == ']' && top != '[')) {
                        return false;
                    }
                }
            }
            return stack.isEmpty();
        }

        public static void main(String[] args) {
            String inputString = "{[()]";
            if (isBalanced(inputString)) {
                System.out.println("The string '" + inputString + "' contains balanced parentheses.");
            } else {
                System.out.println("The string '" + inputString + "' does not contain balanced parentheses.");
            }
        }
    }

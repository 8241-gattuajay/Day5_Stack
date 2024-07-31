package StackPro;

import java.util.Stack;

public class ReverseStack {

    public static void reverseStack(Stack<Integer> stack) {
        if (!stack.isEmpty()) {
            int top = stack.pop();
            reverseStack(stack);
            insertAtBottom(stack, top);
        }
    }

    public static void insertAtBottom(Stack<Integer> stack, int item) {
        if (stack.isEmpty()) {
            stack.push(item);
        } else {
            int top = stack.pop();
            insertAtBottom(stack, item);
            stack.push(top);
        }
    }

    public static void main(String[] args) {
        Stack<Integer> myStack = new Stack<>();
        myStack.push(1);
        myStack.push(2);
        myStack.push(3);
        myStack.push(4);

        System.out.println("Original stack: " + myStack);
        reverseStack(myStack);
        System.out.println("Reversed stack: " + myStack);
    }
}

package StackPro;
import java.util.Stack;

public class StackProg {

        private Stack<Integer> mainStack;
        private Stack<Integer> minStack;

        public StackProg() {
            mainStack = new Stack<>();
            minStack = new Stack<>();
        }

        public void push(int val) {
            mainStack.push(val);
            if (minStack.isEmpty() || val <= minStack.peek()) {
                minStack.push(val);
            }
        }

        public void pop() {
            if (!mainStack.isEmpty()) {
                int popped = mainStack.pop();
                if (popped == minStack.peek()) {
                    minStack.pop();
                }
            }
        }

        public int top() {
            return mainStack.peek();
        }

        public int getMin() {
            return minStack.peek();
        }

        public static void main(String[] args) {
            StackProg minStack = new StackProg();
            minStack.push(-2);
            minStack.push(0);
            minStack.push(-3);

            System.out.println("Minimum element: " + minStack.getMin()); // Output: -3
            minStack.pop();
            System.out.println("Top element: " + minStack.top()); // Output: 0
            System.out.println("Minimum element: " + minStack.getMin()); // Output: -2
        }
    }

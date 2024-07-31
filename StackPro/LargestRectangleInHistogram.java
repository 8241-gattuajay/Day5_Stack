package StackPro;

import java.util.Stack;

public class LargestRectangleInHistogram {

    public static int getMaxArea(int[] hist) {
        Stack<Integer> stack = new Stack<>();
        int maxArea = 0;
        int tp;
        int areaWithTop;

        int i = 0;
        while (i < hist.length) {
            if (stack.isEmpty() || hist[stack.peek()] <= hist[i]) {
                stack.push(i++);
            } else {
                tp = stack.pop();
                areaWithTop = hist[tp] * (stack.isEmpty() ? i : i - stack.peek() - 1);
                maxArea = Math.max(maxArea, areaWithTop);
            }
        }

        while (!stack.isEmpty()) {
            tp = stack.pop();
            areaWithTop = hist[tp] * (stack.isEmpty() ? i : i - stack.peek() - 1);
            maxArea = Math.max(maxArea, areaWithTop);
        }

        return maxArea;
    }

    public static void main(String[] args) {
        int[] histogram = {6, 2, 5, 4, 5, 1, 6};
        int result = getMaxArea(histogram);
        System.out.println("Maximum area is: " + result);
    }
}


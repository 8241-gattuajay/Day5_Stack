package StackPro;

import java.util.Arrays;
import java.util.Stack;

public class NextGre {

    public static int[] findNextGreaterElements(int[] arr) {
        int n = arr.length;
        int[] result = new int[n];
        Arrays.fill(result, -1);

        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && arr[i] > arr[stack.peek()]) {
                result[stack.pop()] = arr[i];
            }
            stack.push(i);
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr = {4, 5, 2, 25};
        int[] nextGreater = findNextGreaterElements(arr);

        System.out.println("Next Greater Elements:");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " -> " + nextGreater[i]);
        }
    }
}


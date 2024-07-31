package QueuePro;

import java.util.Queue;
import java.util.LinkedList;

class QueueStack {
    private Queue<Integer> q1 = new LinkedList<>();
    private Queue<Integer> q2 = new LinkedList<>();

    public void push(int x) {
        q2.add(x);
        while (!q1.isEmpty()) {
            q2.add(q1.poll());
        }
        Queue<Integer> temp = q1;
        q1 = q2;
        q2 = temp;
    }

    public void pop() {
        if (!q1.isEmpty()) {
            q1.poll();
        }
    }

    public int top() {
        return q1.isEmpty() ? -1 : q1.peek();
    }

    public int size() {
        return q1.size();
    }

    public static void main(String[] args) {
        QueueStack stack = new QueueStack();
        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println("Top element: " + stack.top());
        stack.pop();
        System.out.println("Top element: " + stack.top());
        System.out.println("Is empty? " + stack.size());
    }
}


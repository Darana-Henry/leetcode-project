//https://leetcode.com/problems/implement-queue-using-stacks/description/
package algorithms.easy;

import java.util.Stack;

public class ImplementQueueUsingStacks {
    public static void main(String[] args) {
        MyQueue queueWithStacks = new MyQueue();
        queueWithStacks.push(1);
        queueWithStacks.push(2);
        System.out.println("Output:\t" + queueWithStacks.peek());
        System.out.println("Output:\t" + queueWithStacks.pop());
        System.out.println("Output:\t" + queueWithStacks.empty());
    }
}

class MyQueue {
    Stack<Integer> newestOnTop;
    Stack<Integer> oldestOnTop;

    public MyQueue() {
        newestOnTop = new Stack<>();
        oldestOnTop = new Stack<>();
    }

    public void push(int x) {
        newestOnTop.push(x);
    }

    public int pop() {
        shiftStacks();
        return oldestOnTop.pop();
    }

    public int peek() {
        shiftStacks();
        return oldestOnTop.peek();
    }

    public boolean empty() {
        return newestOnTop.isEmpty() && oldestOnTop.isEmpty();
    }

    private void shiftStacks() {
        if (oldestOnTop.isEmpty()) while (!newestOnTop.isEmpty()) oldestOnTop.push(newestOnTop.pop());

    }
}
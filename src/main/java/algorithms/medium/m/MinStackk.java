//https://leetcode.com/problems/min-stack/
package algorithms.medium.m;

import java.util.Stack;

public class MinStackk {
    public static void main(String[] args) {
        MinStack a = new MinStack();
        a.push(-2);
        a.push(0);
        a.push(-3);
        System.out.println("Output:\t" + a.getMin());
        a.pop();
        System.out.println("Output:\t" + a.top());
        System.out.println("Output:\t" + a.getMin());
    }
}


class MinStack {
    Stack<Integer> stack;
    Stack<Integer> minStack;

    public MinStack() {
        stack = new Stack<>();
        minStack = new Stack<>();
        minStack.push(Integer.MAX_VALUE);
    }

    public void push(int val) {
        stack.push(val);
        if (val <= minStack.peek())
            minStack.push(val);
    }

    public void pop() {
        if (stack.peek().equals(minStack.peek()))
            minStack.pop();
        stack.pop();
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return minStack.peek();
    }
}

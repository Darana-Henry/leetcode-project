//https://leetcode.com/problems/design-a-stack-with-increment-operation/
package algorithms.medium.d;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class DesignAStackWithIncrementOperation {
    public static void main(String[] args) {
        CustomStack stk = new CustomStack(3); // Stack is Empty []
        stk.push(1);                          // stack becomes [1]
        stk.push(2);                          // stack becomes [1, 2]
        System.out.println("Output:\t" + stk.pop());
        stk.push(2);                          // stack becomes [1, 2]
        stk.push(3);                          // stack becomes [1, 2, 3]
        stk.push(4);                          // stack still [1, 2, 3], Do not add another elements as size is 4
        stk.increment(5, 100);                // stack becomes [101, 102, 103]
        stk.increment(2, 100);                // stack becomes [201, 202, 103]
        System.out.println("Output:\t" + stk.pop());
        System.out.println("Output:\t" + stk.pop());
        System.out.println("Output:\t" + stk.pop());
        System.out.println("Output:\t" + stk.pop());
    }
}

class CustomStack {
    List<Integer> list = new ArrayList<>();
    int max = 0;

    public CustomStack(int maxSize) {
        this.max = maxSize;
    }

    public void push(int x) {
        if (list.size() < max) list.add(x);
    }

    public int pop() {
        if (list.isEmpty()) return -1;
        return list.remove(list.size() - 1);
    }

    public void increment(int k, int val) {
        ListIterator<Integer> iterator = list.listIterator();
        while (iterator.hasNext() && k > 0) {
            int curr = iterator.next();
            iterator.set(curr + val);
            k--;
        }
    }
}
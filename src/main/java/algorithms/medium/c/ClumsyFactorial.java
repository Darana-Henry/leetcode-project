//https://leetcode.com/problems/clumsy-factorial/
package algorithms.medium.c;

import java.util.Stack;

public class ClumsyFactorial {
    public static void main(String[] args) {
        ClumsyFactorial obj = new ClumsyFactorial();
        System.out.println("Output:\t" + obj.clumsy(4));
        System.out.println("Output:\t" + obj.clumsy(10));
    }

    public int clumsy(int n) {
        int answer = 0, op = 0;
        Stack<Integer> stack = new Stack<>();
        stack.push(n);

        for (int i = n - 1; i > 0; i--) {
            if (op == 0) stack.push(stack.pop() * i);
            else if (op == 1) stack.push(stack.pop() / i);
            else if (op == 2) stack.push(i);
            else stack.push(-i);

            op = (op + 1) % 4;
        }

        while (!stack.isEmpty()) {
            answer += stack.pop();
        }

        return answer;
    }
}

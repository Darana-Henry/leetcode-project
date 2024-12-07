//https://leetcode.com/problems/validate-stack-sequences/
package algorithms.medium.v;

import java.util.Stack;

public class ValidateStackSequences {
    public static void main(String[] args) {
        ValidateStackSequences validateStackSequences = new ValidateStackSequences();
        System.out.println("Output:\t" + validateStackSequences.validateStackSequences(new int[]{1, 2, 3, 4, 5},
                new int[]{4, 5, 3, 2, 1}));
        System.out.println("Output:\t" + validateStackSequences.validateStackSequences(new int[]{1, 2, 3, 4, 5},
                new int[]{4, 3, 5, 1, 2}));
    }

    public boolean validateStackSequences(int[] pushed, int[] popped) {
        int pop = 0;
        Stack<Integer> stack = new Stack<>();

        for (int num : pushed) {
            stack.push(num);

            while (!stack.isEmpty() && stack.peek() == popped[pop]) {
                stack.pop();
                pop++;
            }
        }
        return pop == pushed.length;
    }
}

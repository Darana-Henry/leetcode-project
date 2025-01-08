//https://leetcode.com/problems/next-greater-element-ii/
package algorithms.medium.n;

import java.util.Arrays;
import java.util.Stack;

public class NextGreaterElementII {
    public static void main(String[] args) {
        NextGreaterElementII obj = new NextGreaterElementII();
        System.out.println("Output:\t" + obj.nextGreaterElements(new int[]{1, 2, 1}));
        System.out.println("Output:\t" + obj.nextGreaterElements(new int[]{1, 2, 3, 4, 3}));
    }

    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        int[] answer = new int[n];
        Arrays.fill(answer, -1);
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < 2 * n; i++) {

            while (!stack.isEmpty() && nums[stack.peek()] < nums[i % n]) {
                answer[stack.pop()] = nums[i % n];
            }

            if (i < n) stack.push(i);
        }

        return answer;
    }
}

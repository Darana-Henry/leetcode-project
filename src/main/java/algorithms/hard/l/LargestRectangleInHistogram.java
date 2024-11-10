//https://leetcode.com/problems/largest-rectangle-in-histogram/
package algorithms.hard.l;

import java.util.Stack;
import java.util.Arrays;

public class LargestRectangleInHistogram {
    public static void main(String[] args) {
        LargestRectangleInHistogram histogram = new LargestRectangleInHistogram();
        System.out.println("Output:\t" + histogram.largestRectangleArea(new int[]{2, 1, 5, 6, 2, 3}));
        System.out.println("Output:\t" + histogram.largestRectangleArea(new int[]{2, 4}));
    }

    public int largestRectangleArea(int[] heights) {
        int answer = 0;
        int n = heights.length;
        int[] left = new int[n];
        int[] right = new int[n];
        Stack<Integer> stack = new Stack<>();
        Arrays.fill(right, n);

        for (int i = 0; i < n; ++i) {
            while (!stack.isEmpty() && heights[stack.peek()] >= heights[i]) right[stack.pop()] = i;
            left[i] = stack.isEmpty() ? -1 : stack.peek();
            stack.push(i);
        }

        for (int i = 0; i < n; ++i) {
            int width = right[i] - left[i] - 1;
            answer = Math.max(heights[i] * width, answer);
        }

        return answer;
    }
}

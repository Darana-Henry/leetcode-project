//https://leetcode.com/problems/trapping-rain-water/
package algorithms.hard.t;

import java.util.Stack;

public class TrappingRainWater {
    public static void main(String[] args) {
        TrappingRainWater rain = new TrappingRainWater();
        System.out.println("Output:\t" + rain.trapWithArrays(new int[]{0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1}));
        System.out.println("Output:\t" + rain.trapWithArrays(new int[]{4, 2, 0, 3, 2, 5}));
        System.out.println("Output:\t" + rain.trapWithStack(new int[]{0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1}));
        System.out.println("Output:\t" + rain.trapWithStack(new int[]{4, 2, 0, 3, 2, 5}));
        System.out.println("Output:\t" + rain.trapWithTwoPointers(new int[]{0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1}));
        System.out.println("Output:\t" + rain.trapWithTwoPointers(new int[]{4, 2, 0, 3, 2, 5}));
    }

    public int trapWithArrays(int[] height) {
        int h = height.length;
        int[] leftMax = new int[h];
        int[] rightMax = new int[h];
        int water = 0;
        for (int i = 0; i < h; i++) {
            if (i == 0) {
                leftMax[0] = height[0];
                rightMax[h - 1] = height[h - 1];
            } else {
                leftMax[i] = Math.max(leftMax[i - 1], height[i]);
                rightMax[h - 1 - i] = Math.max(height[h - 1 - i], rightMax[h - i]);
            }
        }

        for (int i = 0; i < h; i++)
            water += Math.min(leftMax[i], rightMax[i]) - height[i];
        return water;
    }

    public int trapWithStack(int[] height) {
        Stack<Integer> stack = new Stack<>();
        int n = height.length;
        int water = 0;
        int curr = 0;
        while (curr < n) {
            while (!stack.isEmpty() && (height[curr] > height[stack.peek()])) {
                int top = stack.pop();
                if (stack.isEmpty()) break;
                int distance = curr - stack.peek() - 1;
                int fill = distance * (Math.min(height[curr], height[stack.peek()]) - height[top]);
                water += fill;
            }
            stack.push(curr++);
        }

        return water;
    }

    public int trapWithTwoPointers(int[] height) {
        int n = height.length;
        int water = 0;
        int left = 0;
        int right = n - 1;
        int maxLeft = 0;
        int maxRight = 0;

        while (left < right) {
            if (height[left] <= height[right]) {
                maxLeft = Math.max(maxLeft, height[left]);
                water += maxLeft - height[left];
                left++;
            } else {
                maxRight = Math.max(maxRight, height[right]);
                water += maxRight - height[right];
                right--;
            }
        }

        return water;
    }
}

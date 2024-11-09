//https://leetcode.com/problems/sliding-window-maximum/
package algorithms.hard.s;

import java.util.ArrayDeque;
import java.util.Deque;

public class SlidingWindowMaximum {
    public static void main(String[] args) {
        SlidingWindowMaximum sliding = new SlidingWindowMaximum();
        System.out.println("Output:\t" + sliding.maxSlidingWindow(new int[]{1, 3, -1, -3, 5, 3, 6, 7}, 3));
        System.out.println("Output:\t" + sliding.maxSlidingWindow(new int[]{1}, 1));
    }

    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        int[] answer = new int[n - k + 1];
        Deque<Integer> dq = new ArrayDeque<>();

        for (int i = 0, j = 0; i < n; i++) {
            if (!dq.isEmpty() && i - k + 1 > dq.peekFirst()) dq.pollFirst();

            while (!dq.isEmpty() && nums[dq.peekLast()] <= nums[i]) dq.pollLast();

            dq.offer(i);
            if (i >= k - 1) answer[j++] = nums[dq.peekFirst()];
        }
        return answer;
    }
}

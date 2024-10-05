//https://leetcode.com/problems/minimum-number-game/
package algorithms.easy.m;

import java.util.Arrays;
import java.util.PriorityQueue;

public class MinimumNumberGame {
    public static void main(String[] args) {
        MinimumNumberGame minNumber = new MinimumNumberGame();
        System.out.println("Output:\t" + minNumber.numberGame(new int[]{5, 4, 2, 3}));
        System.out.println("Output:\t" + minNumber.numberGame(new int[]{2, 5}));
    }

    public int[] numberGame(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        for (int i = 0; i < n; i += 2) {
            if (i + 1 < n) {
                int temp = nums[i];
                nums[i] = nums[i + 1];
                nums[i + 1] = temp;
            }
        }
        return nums;
    }

    public int[] numberGameWithPriorityQueue(int[] nums) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int num : nums)
            pq.offer(num);

        for (int i = 0; i < nums.length; i += 2) {
            int alice = pq.poll();
            int bob = pq.poll();
            nums[i] = bob;
            nums[i + 1] = alice;
        }
        return nums;
    }
}

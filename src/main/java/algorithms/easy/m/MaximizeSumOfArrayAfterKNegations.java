//https://leetcode.com/problems/maximize-sum-of-array-after-k-negations/
package algorithms.easy.m;

import java.util.Arrays;
import java.util.PriorityQueue;

public class MaximizeSumOfArrayAfterKNegations {
    public static void main(String[] args) {
        MaximizeSumOfArrayAfterKNegations negations = new MaximizeSumOfArrayAfterKNegations();
        System.out.println("Output:\t" + negations.largestSumAfterKNegations(new int[]{4, 2, 3}, 1));
        System.out.println("Output:\t" + negations.largestSumAfterKNegations(new int[]{3, -1, 0, 2}, 3));
        System.out.println("Output:\t" + negations.largestSumAfterKNegations(new int[]{2, -3, -1, 5, -4}, 2));
        System.out.println("Output:\t" + negations.largestSumAfterKNegationsPriorityHeap(new int[]{4, 2, 3}, 1));
        System.out.println("Output:\t" + negations.largestSumAfterKNegationsPriorityHeap(new int[]{3, -1, 0, 2}, 3));
        System.out.println("Output:\t" + negations.largestSumAfterKNegationsPriorityHeap(new int[]{2, -3, -1, 5, -4}, 2));
    }

    public int largestSumAfterKNegationsPriorityHeap(int[] nums, int k) {
        int answer = 0;
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for (int num : nums)
            minHeap.add(num);
        for (int i = 1; i <= k; i++)
            minHeap.add(-1 * minHeap.poll());
        while (!minHeap.isEmpty()) answer += minHeap.poll();
        return answer;
    }

    public int largestSumAfterKNegations(int[] nums, int k) {
        Arrays.sort(nums);
        int sum = 0;
        if (nums[0] >= 0 && k % 2 != 0) {
            nums[0] = -nums[0];
        } else if (nums[0] < 0) {
            int change = 0;
            while (k > 0 && change < nums.length && nums[change] < 0) {
                nums[change] = -nums[change++];
                k--;
            }
            if (k % 2 != 0) {
                int index = (change < nums.length && nums[change] < nums[change - 1]) ? change : change - 1;
                nums[index] = -nums[index];
            }
        }
        for (int val : nums)
            sum += val;
        return sum;
    }
}

//https://leetcode.com/problems/kth-largest-element-in-an-array/description/
package algorithms.medium;

import java.util.PriorityQueue;
import java.util.Arrays;

public class KthLargestElementInAnArray {
    public static void main(String[] args) {
        KthLargestElementInAnArray kth = new KthLargestElementInAnArray();
        System.out.println("Output:\t" + kth.findKthLargestWithHeap(new int[]{3, 2, 1, 5, 6, 4}, 2));
        System.out.println("Output:\t" + kth.findKthLargestViaSorting(new int[]{3, 2, 3, 1, 2, 4, 5, 5, 6}, 4));
    }

    public int findKthLargestWithHeap(int[] nums, int k) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for (int num : nums) {
            minHeap.add(num);
            if (minHeap.size() > k)
                minHeap.remove();
        }
        return minHeap.remove();
    }

    public int findKthLargestViaSorting(int[] nums, int k) {
        Arrays.sort(nums);
        return nums[nums.length - k];
    }
}

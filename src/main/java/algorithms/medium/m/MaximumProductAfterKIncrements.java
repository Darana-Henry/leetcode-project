//https://leetcode.com/problems/maximum-product-after-k-increments/
package algorithms.medium.m;

import java.util.PriorityQueue;

public class MaximumProductAfterKIncrements {
    int MOD = (int) 1e9 + 7;

    public static void main(String[] args) {
        MaximumProductAfterKIncrements obj = new MaximumProductAfterKIncrements();
        System.out.println("Output:\t" + obj.maximumProduct(new int[]{0, 4}, 5));
        System.out.println("Output:\t" + obj.maximumProduct(new int[]{6, 3, 3, 2}, 2));
    }

    public int maximumProduct(int[] nums, int k) {
        long answer = 1;
        PriorityQueue<Integer> min = new PriorityQueue<>();

        for (int num : nums)
            min.offer(num);

        while (k-- > 0) {
            int num = min.poll() + 1;
            min.offer(num);
        }

        while (!min.isEmpty()) answer = (answer * min.poll()) % MOD;

        return (int) answer;
    }
}

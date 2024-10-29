//https://leetcode.com/problems/max-number-of-k-sum-pairs/description/
package algorithms.medium.m;

import java.util.ArrayList;
import java.util.HashMap;

public class MaxNumberOfKSumPairs {
    public static void main(String[] args) {

        MaxNumberOfKSumPairs sumPairs = new MaxNumberOfKSumPairs();

        System.out.println("Output:\t" + sumPairs.maxOperationsBruteForce(new int[]{1, 2, 3, 4}, 5));
        System.out.println("Output:\t" + sumPairs.maxOperationsBruteForce(new int[]{3, 1, 3, 4, 3}, 6));

    }

    public int maxOperationsBruteForce(int[] nums, int k) {
        ArrayList<Integer> skip = new ArrayList<>();
        int res = 0;

        for (int i = 0; i < nums.length; i++) {
            if (!skip.contains(i)) {
                for (int j = i + 1; j < nums.length; j++) {
                    if (!skip.contains(j) && !skip.contains(i)) {
                        if (nums[i] + nums[j] == k) {
                            skip.add(i);
                            skip.add(j);
                            res++;
                        }
                    }
                }
            }
        }
        return res;
    }

    public int maxOperationsWithOnAndOn(int[] nums, int k) {
        int res = 0;
        HashMap<Integer, Integer> count = new HashMap<>();

        for (int num : nums)
            count.put(num, count.getOrDefault(num, 0) + 1);

        for (int num : count.keySet()) {
            if (count.containsKey(num) && count.containsKey(k - num)) {
                if (num != k - num) {
                    res += Math.min(count.get(num), count.get(k - num));
                    count.put(num, 0);
                    count.put(k - num, 0);

                } else {
                    res += Math.floor(count.get(num) / 2);
                    count.put(num, 0);
                }
            }
        }
        return res;
    }
}

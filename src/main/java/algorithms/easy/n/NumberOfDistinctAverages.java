//https://leetcode.com/problems/number-of-distinct-averages/
package algorithms.easy.n;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class NumberOfDistinctAverages {
    public static void main(String[] args) {
        NumberOfDistinctAverages avgs = new NumberOfDistinctAverages();
        System.out.println("Output:\t" + avgs.distinctAverages(new int[]{4, 1, 4, 0, 3, 5}));
        System.out.println("Output:\t" + avgs.distinctAverages(new int[]{1, 100}));
    }

    public int distinctAverages(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < n / 2; i++)
            set.add(nums[i] + nums[n - i - 1]);

        return set.size();
    }
}

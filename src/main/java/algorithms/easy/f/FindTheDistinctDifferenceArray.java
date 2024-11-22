//https://leetcode.com/problems/find-the-distinct-difference-array/
package algorithms.easy.f;

import java.util.HashSet;
import java.util.Set;

public class FindTheDistinctDifferenceArray {
    public static void main(String[] args) {
        FindTheDistinctDifferenceArray distinct = new FindTheDistinctDifferenceArray();
        System.out.println("Output:\t" + distinct.distinctDifferenceArray(new int[]{1, 2, 3, 4, 5}));
        System.out.println("Output:\t" + distinct.distinctDifferenceArray(new int[]{3, 2, 3, 4, 2}));
    }

    public int[] distinctDifferenceArray(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        int[] count = new int[n + 1];
        Set<Integer> set = new HashSet<>();

        for (int i = n - 1; i >= 0; i--) {
            set.add(nums[i]);
            count[i] = set.size();
        }

        set.clear();

        for (int i = 0; i < n; i++) {
            set.add(nums[i]);
            result[i] = set.size() - count[i + 1];
        }

        return result;
    }
}

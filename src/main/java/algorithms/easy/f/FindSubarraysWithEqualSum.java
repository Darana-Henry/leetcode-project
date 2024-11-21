//https://leetcode.com/problems/find-subarrays-with-equal-sum/
package algorithms.easy.f;

import java.util.HashSet;
import java.util.Set;

public class FindSubarraysWithEqualSum {
    public static void main(String[] args) {
        FindSubarraysWithEqualSum equalSum = new FindSubarraysWithEqualSum();
        System.out.println("Output:\t" + equalSum.findSubarrays(new int[]{4, 2, 4}));
        System.out.println("Output:\t" + equalSum.findSubarrays(new int[]{1, 2, 3, 4, 5}));
        System.out.println("Output:\t" + equalSum.findSubarrays(new int[]{0, 0, 0}));
    }

    public boolean findSubarrays(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int i = 1; i < nums.length; i++) {
            int sum = nums[i] + nums[i - 1];
            if (!(set.add(sum))) return true;
        }
        return false;
    }
}

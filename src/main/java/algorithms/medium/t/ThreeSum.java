//https://leetcode.com/problems/3sum/description/
package algorithms.medium.t;

import java.util.*;

public class ThreeSum {
    public static void main(String[] args) {
        ThreeSum sum3 = new ThreeSum();
        System.out.println("Output:\t" + sum3.threeSum(new int[]{-1, 0, 1, 2, -1, -4}));
        System.out.println("Output:\t" + sum3.threeSum(new int[]{0, 1, 1}));
        System.out.println("Output:\t" + sum3.threeSum(new int[]{0, 0, 0}));
    }

    public List<List<Integer>> threeSum(int[] nums) {
        if (nums == null || nums.length < 3) return new ArrayList<>();

        Arrays.sort(nums);
        Set<List<Integer>> set = new HashSet<>();
        for (int i = 0; i < nums.length - 2; i++) {
            int left = i + 1;
            int right = nums.length - 1;
            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];
                if (sum == 0) {
                    set.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    left++;
                    right--;
                } else if (sum < 0) left++;
                else right--;
            }
        }
        return new ArrayList<>(set);
    }
}

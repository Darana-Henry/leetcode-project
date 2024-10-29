//https://leetcode.com/problems/subsets/description/
package algorithms.medium.s;

import java.util.ArrayList;
import java.util.List;

import patterns.subsets.LearningSubsets;

public class Subsets {
    public static void main(String[] args) {
        LearningSubsets subsets = new LearningSubsets();
        System.out.println("Output:\t" + subsets.subset(new int[]{0}));
        System.out.println("Output:\t" + subsets.subset(new int[]{1, 2}));
        System.out.println("Output:\t" + subsets.subset(new int[]{1, 2, 3}));
    }

    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        helper(nums, result, 0, new ArrayList<>());
        return result;
    }

    public void helper(int[] nums, List<List<Integer>> result, int index, List<Integer> current) {
        result.add(new ArrayList<>(current));
        for (int i = index; i < nums.length; i++) {
            current.add(nums[i]);
            helper(nums, result, i + 1, current);
            current.remove(current.size() - 1);
        }
    }
}

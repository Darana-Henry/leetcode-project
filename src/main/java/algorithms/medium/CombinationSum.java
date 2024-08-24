//https://leetcode.com/problems/combination-sum/
package algorithms.medium;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum {
    private int[] nums;
    private final List<List<Integer>> answer = new ArrayList<>();

    public static void main(String[] args) {
        CombinationSum CombinationSum = new CombinationSum();
        System.out.println("Output:\t" + CombinationSum.combinationSum(new int[]{2, 3, 6, 7}, 7));
        System.out.println("Output:\t" + CombinationSum.combinationSum(new int[]{2, 3, 5}, 8));
        System.out.println("Output:\t" + CombinationSum.combinationSum(new int[]{2}, 1));
    }

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        if (candidates == null) return null;
        this.nums = candidates;
        backtrack(0, new ArrayList<>(), target);
        return answer;
    }

    public void backtrack(int index, List<Integer> current, int target) {
        if (target == 0) {
            answer.add(new ArrayList<>(current));
            return;
        }
        for (int i = index; i < nums.length; i++) {
            if (nums[i] <= target) {
                current.add(nums[i]);
                backtrack(i, current, target - nums[i]);
                current.remove(current.size() - 1);
            }
        }
    }
}

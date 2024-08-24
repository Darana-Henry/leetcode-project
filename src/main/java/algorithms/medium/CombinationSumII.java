//https://leetcode.com/problems/combination-sum-ii/description/
package algorithms.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSumII {
    private final List<List<Integer>> answer = new ArrayList<>();
    private int[] nums;

    public static void main(String[] args) {
        CombinationSumII CombinationSum = new CombinationSumII();
        System.out.println("Output:\t" + CombinationSum.combinationSum2(new int[]{2, 5, 2, 1, 2}, 5));
        System.out.println("Output:\t" + CombinationSum.combinationSum2(new int[]{10, 1, 2, 7, 6, 1, 5}, 8));
    }

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        if (candidates == null) return null;
        Arrays.sort(candidates);
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
            if (nums[i] > target) break;
            if (i > index && nums[i] == nums[i - 1]) continue;
            current.add(nums[i]);
            backtrack(i + 1, current, target - nums[i]);
            current.remove(current.size() - 1);
        }
    }
}

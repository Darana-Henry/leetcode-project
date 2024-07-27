///https://leetcode.com/problems/subsets-ii/
package algorithms.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubsetsII {
    public static void main(String[] args) {
        SubsetsII subset = new SubsetsII();
        System.out.println("Output:\t" + subset.subsetsWithDup(new int[]{1, 2, 2}));
        System.out.println("Output:\t" + subset.subsetsWithDup(new int[]{0}));
    }

    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> answer = new ArrayList<>();
        Arrays.sort(nums);
        backtrack(0, new ArrayList<>(), nums, answer);
        return answer;
    }

    public void backtrack(int index, List<Integer> current, int[] nums, List<List<Integer>> answer) {
        if (answer.contains(current))
            return;

        answer.add(new ArrayList<>(current));
        for (int i = index; i < nums.length; i++) {
            current.add(nums[i]);
            backtrack(i + 1, current, nums, answer);
            current.remove(current.size() - 1);
        }
    }
}

//https://leetcode.com/problems/find-target-indices-after-sorting-array/
package algorithms.easy.f;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindTargetIndicesAfterSortingArray {
    public static void main(String[] args) {
        FindTargetIndicesAfterSortingArray target = new FindTargetIndicesAfterSortingArray();
        System.out.println("Output:\t" + target.targetIndices(new int[]{1, 2, 5, 2, 3}, 2));
        System.out.println("Output:\t" + target.targetIndices(new int[]{1, 2, 5, 2, 3}, 3));
        System.out.println("Output:\t" + target.targetIndices(new int[]{1, 2, 5, 2, 3}, 5));
    }

    public List<Integer> targetIndices(int[] nums, int target) {
        Arrays.sort(nums);
        List<Integer> answer = new ArrayList<>();
        for (int i = 0; i < nums.length; i++)
            if (nums[i] == target) answer.add(i);

        return answer;
    }
}

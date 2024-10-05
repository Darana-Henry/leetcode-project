//https://leetcode.com/problems/find-subsequence-of-length-k-with-the-largest-sum/
package algorithms.easy.f;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindSubsequenceOfLengthKWithTheLargestSum {
    public static void main(String[] args) {
        FindSubsequenceOfLengthKWithTheLargestSum sum = new FindSubsequenceOfLengthKWithTheLargestSum();
        System.out.println("Output:\t" + sum.maxSubsequence(new int[]{2, 1, 3, 3}, 2));
        System.out.println("Output:\t" + sum.maxSubsequence(new int[]{-1, -2, 3, 4}, 3));
        System.out.println("Output:\t" + sum.maxSubsequence(new int[]{3, 4, 3, 3}, 2));
    }

    public int[] maxSubsequence(int[] nums, int k) {
        int[] answer = new int[k];
        int[] top = new int[k];
        List<Integer> indices = new ArrayList<>();

        for (int i = 0; i < nums.length; ++i)
            indices.add(i);

        indices.sort((a, b) -> Integer.compare(nums[b], nums[a]));
        for (int i = 0; i < k; ++i)
            top[i] = indices.get(i);

        Arrays.sort(top);
        for (int i = 0; i < k; ++i)
            answer[i] = nums[top[i]];

        return answer;
    }
}

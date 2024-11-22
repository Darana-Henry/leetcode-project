//https://leetcode.com/problems/subarrays-distinct-element-sum-of-squares-i/
package algorithms.easy.s;

import java.util.List;

public class SubarraysDistinctElementSumOfSquaresI {
    public static void main(String[] args) {
        SubarraysDistinctElementSumOfSquaresI sumOf = new SubarraysDistinctElementSumOfSquaresI();
        System.out.println("Output:\t" + sumOf.sumCounts(List.of(1, 2, 1)));
        System.out.println("Output:\t" + sumOf.sumCounts(List.of(1, 1)));
    }

    public int sumCounts(List<Integer> nums) {
        int answer = 0;
        int n = nums.size();

        for (int i = 0; i < n; i++) {
            int distinct = 0;
            int[] count = new int[101];

            for (int j = i; j < n; j++) {
                if (++count[nums.get(j)] == 1) distinct++;
                answer += distinct * distinct;
            }
        }

        return answer;
    }
}

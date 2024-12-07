//https://leetcode.com/problems/maximum-number-of-integers-to-choose-from-a-range-i/
package algorithms.medium.m;

import java.util.HashSet;
import java.util.Set;

public class MaximumNumberOfIntegersToChooseFromARangeI {
    public static void main(String[] args) {
        MaximumNumberOfIntegersToChooseFromARangeI maximumNumberOfIntegersToChooseFromARangeI = new MaximumNumberOfIntegersToChooseFromARangeI();
        System.out.println("Output:\t" + maximumNumberOfIntegersToChooseFromARangeI.maxCount(new int[]{1, 6, 5}, 5, 6));
        System.out.println(
                "Output:\t" + maximumNumberOfIntegersToChooseFromARangeI.maxCount(new int[]{1, 2, 3, 4, 5, 6, 7}, 8,
                        1));
        System.out.println("Output:\t" + maximumNumberOfIntegersToChooseFromARangeI.maxCount(new int[]{11}, 7, 50));
    }

    public int maxCount(int[] banned, int n, int maxSum) {
        int answer = 0, sum = 0;
        Set<Integer> set = new HashSet<>();

        for (int ban : banned)
            set.add(ban);

        for (int i = 1; i <= n && sum + i <= maxSum; i++) {
            if (!set.contains(i)) {
                answer++;
                sum += i;
            }
        }
        return answer;
    }
}

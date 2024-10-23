//https://leetcode.com/problems/minimum-cost-of-buying-candies-with-discount/
package algorithms.easy.m;

import java.util.Arrays;

public class MinimumCostOfBuyingCandiesWithDiscount {
    public static void main(String[] args) {
        MinimumCostOfBuyingCandiesWithDiscount candies = new MinimumCostOfBuyingCandiesWithDiscount();
        System.out.println("Output:\t" + candies.minimumCost(new int[]{1, 2, 3}));
        System.out.println("Output:\t" + candies.minimumCost(new int[]{6, 5, 7, 9, 2, 2}));
        System.out.println("Output:\t" + candies.minimumCost(new int[]{5, 5}));
    }

    public int minimumCost(int[] cost) {
        int answer = 0;
        Arrays.sort(cost);
        for (int i = cost.length - 1; i >= 0; i -= 3) {
            answer += cost[i];
            if (i > 0) answer += cost[i - 1];
        }
        return answer;
    }
}

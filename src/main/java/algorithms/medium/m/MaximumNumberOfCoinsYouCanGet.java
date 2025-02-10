//https://leetcode.com/problems/maximum-number-of-coins-you-can-get/
package algorithms.medium.m;

import java.util.Arrays;

public class MaximumNumberOfCoinsYouCanGet {
    public static void main(String[] args) {
        MaximumNumberOfCoinsYouCanGet obj = new MaximumNumberOfCoinsYouCanGet();
        System.out.println("Output:\t" + obj.maxCoins(new int[]{2, 4, 1, 2, 7, 8}));
        System.out.println("Output:\t" + obj.maxCoins(new int[]{2, 4, 5}));
        System.out.println("Output:\t" + obj.maxCoins(new int[]{9, 8, 7, 6, 5, 1, 2, 3, 4}));
    }

    public int maxCoins(int[] piles) {
        int answer = 0, n = piles.length;
        Arrays.sort(piles);

        for (int i = n / 3; i < n; i += 2)
            answer += piles[i];

        return answer;
    }
}

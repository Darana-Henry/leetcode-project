//https://leetcode.com/problems/successful-pairs-of-spells-and-potions/description/
package algorithms.medium.s;

import java.util.Arrays;

public class SuccessfulPairsOfSpellsAndPotions {
    public static void main(String[] args) {
        SuccessfulPairsOfSpellsAndPotions pairs = new SuccessfulPairsOfSpellsAndPotions();
        System.out.println("Output:\t" + pairs.successfulPairs(new int[]{5, 1, 3}, new int[]{1, 2, 3, 4, 5}, 7));
        System.out.println("Output:\t" + pairs.successfulPairs(new int[]{3, 1, 2}, new int[]{8, 5, 8}, 16));
    }

    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        int n = spells.length;
        int m = potions.length;
        int[] pairs = new int[n];

        Arrays.sort(potions);

        for (int i = 0; i < n; i++) {
            int left = 0;
            int right = m - 1;

            while (left <= right) {
                int mid = left + (right - left) / 2;
                if ((long) spells[i] * potions[mid] >= success) right = mid - 1;
                else left = mid + 1;
            }
            pairs[i] = m - right - 1;
        }
        return pairs;
    }
}

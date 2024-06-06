//https://leetcode.com/problems/divide-array-in-sets-of-k-consecutive-numbers/description/
package algorithms.medium;

import java.util.TreeMap;

public class DivideArrayInSetsOfKConsecutiveNumbers {

    public static void main(String[] args) {

        DivideArrayInSetsOfKConsecutiveNumbers divideArray = new DivideArrayInSetsOfKConsecutiveNumbers();
        System.out.println("Output:\t" + divideArray.isPossibleDivide(new int[]{1, 2, 3, 3, 4, 4, 5, 6}, 4));
        System.out.println(
                "Output:\t" + divideArray.isPossibleDivide(new int[]{3, 2, 1, 2, 3, 4, 3, 4, 5, 9, 10, 11}, 3));
        System.out.println("Output:\t" + divideArray.isPossibleDivide(new int[]{1, 2, 3, 4}, 3));
    }


    public boolean isPossibleDivide(int[] nums, int k) {
        if (nums.length % k != 0) return false;

        TreeMap<Integer, Integer> cardCount = new TreeMap<>();

        for (int card : nums) {
            if (!cardCount.containsKey(card)) cardCount.put(card, 1);
            else cardCount.replace(card, cardCount.get(card) + 1);
        }

        while (cardCount.size() > 0) {
            int minCard = cardCount.firstKey();

            for (int i = minCard; i < minCard + k; i++) {
                if (!cardCount.containsKey(i)) return false;

                int nextCardCount = cardCount.get(i);
                if (nextCardCount == 1) cardCount.remove(i);
                else cardCount.replace(i, nextCardCount - 1);
            }
        }
        return true;

    }
}

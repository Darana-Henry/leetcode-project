//https://leetcode.com/problems/hand-of-straights/description/
package algorithms.medium.h;

import java.util.TreeMap;

public class HandOfStraights {
    public static void main(String[] args) {

        HandOfStraights hand = new HandOfStraights();
        System.out.println("Output:\t" + hand.isNStraightHand(new int[]{1, 2, 3, 6, 2, 3, 4, 7, 8}, 3));
        System.out.println("Output:\t" + hand.isNStraightHand(new int[]{1, 2, 3, 4, 5}, 4));
    }

    public boolean isNStraightHand(int[] hand, int groupSize) {
        if (hand.length % groupSize != 0)
            return false;

        TreeMap<Integer, Integer> cardCount = new TreeMap<>();

        for (int card : hand) {
            if (!cardCount.containsKey(card))
                cardCount.put(card, 1);
            else
                cardCount.replace(card, cardCount.get(card) + 1);
        }

        while (cardCount.size() > 0) {
            int minCard = cardCount.firstKey();

            for (int i = minCard; i < minCard + groupSize; i++) {
                if (!cardCount.containsKey(i))
                    return false;

                int nextCardCount = cardCount.get(i);
                if (nextCardCount == 1)
                    cardCount.remove(i);
                else
                    cardCount.replace(i, nextCardCount - 1);
            }
        }
        return true;
    }
}

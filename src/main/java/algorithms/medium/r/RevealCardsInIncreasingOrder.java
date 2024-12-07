//https://leetcode.com/problems/reveal-cards-in-increasing-order/
package algorithms.medium.r;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class RevealCardsInIncreasingOrder {
    public static void main(String[] args) {
        RevealCardsInIncreasingOrder revealCardsInIncreasingOrder = new RevealCardsInIncreasingOrder();
        System.out.println(
                "Output:\t" + revealCardsInIncreasingOrder.deckRevealedIncreasing(new int[]{17, 13, 11, 2, 3, 5, 7}));
        System.out.println("Output:\t" + revealCardsInIncreasingOrder.deckRevealedIncreasing(new int[]{1, 1000}));
    }

    public int[] deckRevealedIncreasing(int[] deck) {
        int n = deck.length;
        Arrays.sort(deck);
        Deque<Integer> dq = new ArrayDeque<>();

        for (int i = n - 1; i >= 0; i--) {
            if (!dq.isEmpty()) dq.offerFirst(dq.pollLast());
            dq.offerFirst(deck[i]);
        }

        for (int i = 0; i < n; i++)
            deck[i] = dq.poll();

        return deck;
    }
}

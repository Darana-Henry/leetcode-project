//https://leetcode.com/problems/x-of-a-kind-in-a-deck-of-cards/
package algorithms.easy.x;

public class XOfAKindInADeckOfCards {
    public static void main(String[] args) {
        XOfAKindInADeckOfCards x = new XOfAKindInADeckOfCards();
        System.out.println("Output:\t" + x.hasGroupsSizeX(new int[]{1, 2, 3, 4, 4, 3, 2, 1}));
        System.out.println("Output:\t" + x.hasGroupsSizeX(new int[]{1, 1, 1, 2, 2, 2, 3, 3}));
    }

    public boolean hasGroupsSizeX(int[] deck) {
        int[] count = new int[10000];
        for (int card : deck)
            count[card]++;

        int gcdVal = -1;
        for (int freq : count)
            if (freq > 0) gcdVal = gcdVal == -1 ? freq : gcd(gcdVal, freq);

        return gcdVal >= 2;
    }

    public int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }
}

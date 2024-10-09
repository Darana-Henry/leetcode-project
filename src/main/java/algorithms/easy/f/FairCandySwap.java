//https://leetcode.com/problems/fair-candy-swap/
package algorithms.easy.f;

import java.util.HashSet;
import java.util.Set;

public class FairCandySwap {
    public static void main(String[] args) {
        FairCandySwap candy = new FairCandySwap();
        System.out.println("Output:\t" + candy.fairCandySwap(new int[]{1, 1}, new int[]{2, 2}));
        System.out.println("Output:\t" + candy.fairCandySwap(new int[]{1, 2}, new int[]{2, 3}));
        System.out.println("Output:\t" + candy.fairCandySwap(new int[]{2}, new int[]{1, 3}));
    }

    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        Set<Integer> bobSet = new HashSet<>();
        int alice = 0, bob = 0;

        for (int candy : aliceSizes)
            alice += candy;

        for (int candy : bobSizes) {
            bobSet.add(candy);
            bob += candy;
        }

        int diff = (alice - bob) >> 1;
        for (int candy : aliceSizes) {
            int target = candy - diff;
            if (bobSet.contains(target)) return new int[]{candy, target};
        }

        return null;
    }
}

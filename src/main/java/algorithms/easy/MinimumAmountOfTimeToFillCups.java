//https://leetcode.com/problems/minimum-amount-of-time-to-fill-cups/
package algorithms.easy;

import java.util.Arrays;

public class MinimumAmountOfTimeToFillCups {
    public static void main(String[] args) {
        MinimumAmountOfTimeToFillCups cups = new MinimumAmountOfTimeToFillCups();
        System.out.println("Output:\t" + cups.fillCups(new int[]{1, 4, 2}));
        System.out.println("Output:\t" + cups.fillCups(new int[]{5, 4, 4}));
        System.out.println("Output:\t" + cups.fillCups(new int[]{5, 0, 0}));
    }

    public int fillCups(int[] amount) {
        Arrays.sort(amount);
        if (amount[0] + amount[1] <= amount[2]) return amount[2];
        return (amount[0] + amount[1] + amount[2] + 1) / 2;
    }
}

//https://leetcode.com/problems/h-index/description/
package algorithms.medium;

import java.util.Arrays;

public class HIndex {
    public static void main(String[] args) {
        HIndex index = new HIndex();
        System.out.println("Output:\t" + index.hIndexWithSorting(new int[]{3, 0, 6, 1, 5}));
        System.out.println("Output:\t" + index.hIndexWithCounting(new int[]{1, 3, 1}));
        System.out.println("Output:\t" + index.hIndexWithCounting(new int[]{3, 0, 6, 1, 5}));
    }

    public int hIndexWithSorting(int[] citations) {
        Arrays.sort(citations);
        int h = 0;
        while (h < citations.length && citations[citations.length - 1 - h] > h) h++;
        return h;
    }

    public int hIndexWithCounting(int[] citations) {
        int size = citations.length;
        int[] dp = new int[size + 1];

        for (int c : citations)
            dp[Math.min(size, c)]++;

        int h = size;
        for (int i = dp[size]; h > i; i += dp[h])
            h--;

        return h;
    }
}

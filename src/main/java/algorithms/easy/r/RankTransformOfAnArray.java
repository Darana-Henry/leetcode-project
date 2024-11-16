//https://leetcode.com/problems/rank-transform-of-an-array/
package algorithms.easy.r;

import java.util.Arrays;

public class RankTransformOfAnArray {
    public static void main(String[] args) {
        RankTransformOfAnArray ranks = new RankTransformOfAnArray();
        System.out.println("Output:\t" + ranks.arrayRankTransform(new int[]{40, 10, 20, 30}));
        System.out.println("Output:\t" + ranks.arrayRankTransform(new int[]{100, 100, 100}));
        System.out.println("Output:\t" + ranks.arrayRankTransform(new int[]{37, 12, 28, 9, 100, 56, 80, 5, 12}));
    }

    public int[] arrayRankTransform(int[] arr) {
        int n = arr.length;
        int uniques = 0;
        int[] ranks = new int[n];
        int[] sorted = arr.clone();
        Arrays.sort(sorted);

        for (int i = 0; i < n; i++)
            if (i == 0 || sorted[i - 1] != sorted[i]) sorted[uniques++] = sorted[i];

        for (int i = 0; i < n; i++)
            ranks[i] = Arrays.binarySearch(sorted, 0, uniques, arr[i]) + 1;

        return ranks;

    }
}

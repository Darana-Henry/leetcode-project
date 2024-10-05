//https://leetcode.com/problems/height-checker/description/
package algorithms.easy.h;

import java.util.Arrays;

public class HeightChecker {
    public static void main(String[] args) {
        HeightChecker heightChecker = new HeightChecker();
        System.out.println("Output:\t" + heightChecker.heightCheckerWithSorting(new int[]{1, 1, 4, 2, 1, 3}));
        System.out.println(
                "Output:\t" + heightChecker.heightCheckerWithoutSorting(new int[]{5, 1, 2, 3, 4}));
        System.out.println(
                "Output:\t" + heightChecker.heightCheckerWithSorting(new int[]{1, 2, 3, 4, 5}));
    }

    public int heightCheckerWithSorting(int[] heights) {
        int[] sortedHeights = heights.clone();
        Arrays.sort(sortedHeights);
        int result = 0;

        for (int i = 0; i < heights.length; i++) {
            if (sortedHeights[i] != heights[i])
                result++;
        }
        return result;
    }

    public int heightCheckerWithoutSorting(int[] heights) {
        int[] heightToFreq = new int[101];

        for (int height : heights) {
            heightToFreq[height]++;
        }

        int result = 0;
        int curHeight = 0;

        for (int i = 0; i < heights.length; i++) {
            while (heightToFreq[curHeight] == 0) {
                curHeight++;
            }

            if (curHeight != heights[i]) {
                result++;
            }
            heightToFreq[curHeight]--;
        }

        return result;
    }
}

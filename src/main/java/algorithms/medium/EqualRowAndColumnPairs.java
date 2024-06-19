//https://leetcode.com/problems/equal-row-and-column-pairs/description/
package algorithms.medium;

import java.util.HashMap;
import java.util.Map;

public class EqualRowAndColumnPairs {
    public static void main(String[] args) {
        EqualRowAndColumnPairs equalPair = new EqualRowAndColumnPairs();
        System.out.println("Output:\t" + equalPair.equalPairsBruteForce(
                new int[][]{new int[]{3, 2, 1}, new int[]{1, 7, 6}, new int[]{2, 7, 7}}));
        System.out.println("Output:\t" + equalPair.equalPairsViaMaps(
                new int[][]{new int[]{3, 1, 2, 2}, new int[]{1, 4, 4, 5}, new int[]{2, 4, 2, 2}, new int[]{2, 4, 2, 2}}));
        System.out.println("Output:\t" + equalPair.equalPairsViaMapsDeux(
                new int[][]{new int[]{3, 1, 2, 2}, new int[]{1, 4, 4, 5}, new int[]{2, 4, 2, 2}, new int[]{2, 4, 2, 2}}));
    }

    public int equalPairsBruteForce(int[][] grid) {
        if (grid.length == 1) return 1;

        int pairs = 0;
        int width = grid[1].length;

        for (int row = 0; row < width; row++) {
            for (int col = 0; col < width; col++) {

                boolean isAMatch = true;
                for (int i = 0; i < width; i++) {
                    if (!(grid[row][i] == grid[i][col])) {
                        isAMatch = false;
                        break;
                    }
                }
                if (isAMatch) pairs++;
            }
        }
        return pairs;
    }

    public int equalPairsViaMaps(int[][] grid) {
        Map<String, Integer> mp = new HashMap<>();
        for (int[] g : grid) {
            String temp = "";
            for (int r : g) {
                temp += "+" + r;
            }
            mp.put(temp, mp.getOrDefault(temp, 0) + 1);
        }
        int res = 0;

        for (int i = 0; i < grid.length; i++) {
            String temp = "";
            for (int j = 0; j < grid[0].length; j++) {
                temp += "+" + grid[j][i];
            }
            res += mp.getOrDefault(temp, 0);
        }
        return res;
    }

    public int equalPairsViaMapsDeux(int[][] grid) {
        int pairs = 0;
        int temp = 0;
        int row = 0;

        while (temp <= grid.length - 1) {
            Map<Integer, Integer> map = new HashMap<>();

            for (int j = 0; j < grid.length; j++)
                map.put(j, grid[row][j]);

            for (int i = 0; i < grid.length; i++) {
                int curr = 0;
                for (int k = 0; k < grid.length; k++) {
                    if (map.get(k) != grid[k][i]) {
                        curr = 0;
                        break;
                    } else
                        curr = 1;
                }
                pairs += curr;
            }
            row++;
            temp++;
        }
        return pairs;
    }
}


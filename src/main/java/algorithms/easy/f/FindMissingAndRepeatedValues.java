//https://leetcode.com/problems/find-missing-and-repeated-values/
package algorithms.easy.f;

public class FindMissingAndRepeatedValues {
    public static void main(String[] args) {
        FindMissingAndRepeatedValues missing = new FindMissingAndRepeatedValues();
        System.out.println("Output:\t" + missing.findMissingAndRepeatedValues(new int[][]{{1, 3}, {2, 2}}));
        System.out.println(
                "Output:\t" + missing.findMissingAndRepeatedValues(new int[][]{{9, 1, 7}, {8, 9, 2}, {3, 4, 6}}));
    }

    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int a = 0, b = 0;
        int n = grid.length;
        int[] count = new int[n * n + 1];

        for (int[] row : grid) {
            for (int i = 0; i < n; i++)
                count[row[i]]++;
        }

        for (int i = 1; i < count.length; i++) {
            if (count[i] == 2) a = i;
            if (count[i] == 0) b = i;
        }

        return new int[]{a, b};
    }
}

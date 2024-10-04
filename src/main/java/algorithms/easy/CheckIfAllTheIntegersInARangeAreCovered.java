//https://leetcode.com/problems/check-if-all-the-integers-in-a-range-are-covered/
package algorithms.easy;

public class CheckIfAllTheIntegersInARangeAreCovered {
    public static void main(String[] args) {
        CheckIfAllTheIntegersInARangeAreCovered covered = new CheckIfAllTheIntegersInARangeAreCovered();
        System.out.println("Output:\t" + covered.isCovered(new int[][]{{1, 2}, {3, 4}, {5, 6}}, 2, 5));
        System.out.println("Output:\t" + covered.isCovered(new int[][]{{1, 10}, {10, 20}}, 21, 21));
    }

    public boolean isCovered(int[][] ranges, int left, int right) {
        int[] delta = new int[52];

        for (int[] range : ranges) {
            delta[range[0]]++;
            delta[range[1] + 1]--;
        }

        int coverage = 0;
        for (int i = 0; i < delta.length; i++) {
            coverage += delta[i];
            if (i >= left && i <= right && coverage == 0) return false;
        }
        return true;
    }
}

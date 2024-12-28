//https://leetcode.com/problems/best-sightseeing-pair/
package algorithms.medium.b;

public class BestSightseeingPair {
    public static void main(String[] args) {
        BestSightseeingPair obj = new BestSightseeingPair();
        System.out.println("Output:\t" + obj.maxScoreSightseeingPair(new int[]{8, 1, 5, 2, 6}));
        System.out.println("Output:\t" + obj.maxScoreSightseeingPair(new int[]{1, 2}));
    }

    public int maxScoreSightseeingPair(int[] values) {
        int max = 0, maxValue = values[0];

        for (int i = 1; i < values.length; i++) {
            max = Math.max(max, maxValue + values[i] - i);
            maxValue = Math.max(maxValue, values[i] + i);
        }
        return max;
    }
}

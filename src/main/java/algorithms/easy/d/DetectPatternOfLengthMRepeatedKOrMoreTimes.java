//https://leetcode.com/problems/detect-pattern-of-length-m-repeated-k-or-more-times/
package algorithms.easy.d;

public class DetectPatternOfLengthMRepeatedKOrMoreTimes {
    public static void main(String[] args) {
        DetectPatternOfLengthMRepeatedKOrMoreTimes detect = new DetectPatternOfLengthMRepeatedKOrMoreTimes();
        System.out.println("Output:\t" + detect.containsPattern(new int[]{1, 2, 4, 4, 4, 4}, 1, 3));
        System.out.println("Output:\t" + detect.containsPattern(new int[]{1, 2, 1, 2, 1, 1, 1, 3}, 2, 2));
        System.out.println("Output:\t" + detect.containsPattern(new int[]{1, 2, 1, 2, 1, 3}, 2, 3));
    }

    public boolean containsPattern(int[] arr, int m, int k) {
        int n = arr.length;

        for (int i = 0; i <= n - m * k; i++) {
            int j = 0;

            for (; j < m * k; j++)
                if (arr[i + j] != arr[i + (j % m)]) break;

            if (j == m * k) return true;
        }

        return false;
    }
}

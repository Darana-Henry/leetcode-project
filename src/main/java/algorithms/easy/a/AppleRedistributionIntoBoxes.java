//https://leetcode.com/problems/apple-redistribution-into-boxes/
package algorithms.easy.a;

import java.util.Arrays;

public class AppleRedistributionIntoBoxes {
    public static void main(String[] args) {
        AppleRedistributionIntoBoxes apple = new AppleRedistributionIntoBoxes();
        System.out.println("Output:\t" + apple.minimumBoxes(new int[]{1, 3, 2}, new int[]{4, 3, 1, 5, 2}));
        System.out.println("Output:\t" + apple.minimumBoxes(new int[]{5, 5, 5}, new int[]{2, 4, 2, 7}));
    }

    public int minimumBoxes(int[] apple, int[] capacity) {
        int total = 0;
        Arrays.sort(capacity);

        for (int app : apple)
            total += app;

        for (int i = 1, n = capacity.length; ; i++) {
            total -= capacity[n - i];
            if (total <= 0) return i;
        }
    }
}

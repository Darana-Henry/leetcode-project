//https://leetcode.com/problems/mean-of-array-after-removing-some-elements/
package algorithms.easy.m;

import java.util.Arrays;

public class MeanOfArrayAfterRemovingSomeElements {
    public static void main(String[] args) {
        MeanOfArrayAfterRemovingSomeElements mean = new MeanOfArrayAfterRemovingSomeElements();
        System.out.println(
                "Output:\t" + mean.trimMean(new int[]{1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3}));
        System.out.println(
                "Output:\t" + mean.trimMean(new int[]{6, 2, 7, 5, 1, 2, 0, 3, 10, 2, 5, 0, 5, 5, 0, 8, 7, 6, 8, 0}));
        System.out.println("Output:\t" + mean.trimMean(
                new int[]{6, 0, 7, 0, 7, 5, 7, 8, 3, 4, 0, 7, 8, 1, 6, 8, 1, 1, 2, 4, 8, 1, 9, 5, 4, 3, 8, 5, 10, 8, 6, 6, 1, 0, 6, 10, 8, 2, 3, 4}));
    }

    public double trimMean(int[] arr) {
        int sum = 0;
        Arrays.sort(arr);
        int n = arr.length;
        int trim = (int) (n * 0.05);

        for (int i = trim; i < n - trim; i++)
            sum += arr[i];

        return sum / (n * 0.9);
    }
}

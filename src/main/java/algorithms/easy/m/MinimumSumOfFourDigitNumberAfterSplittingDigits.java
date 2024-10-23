//https://leetcode.com/problems/minimum-sum-of-four-digit-number-after-splitting-digits/
package algorithms.easy.m;

import java.util.Arrays;

public class MinimumSumOfFourDigitNumberAfterSplittingDigits {
    public static void main(String[] args) {
        MinimumSumOfFourDigitNumberAfterSplittingDigits splitting = new MinimumSumOfFourDigitNumberAfterSplittingDigits();
        System.out.println("Output:\t" + splitting.minimumSum(2932));
        System.out.println("Output:\t" + splitting.minimumSum(4009));
    }

    public int minimumSum(int num) {
        int[] digits = new int[4];

        for (int i = 0; num != 0; i++) {
            digits[i] = num % 10;
            num /= 10;
        }

        Arrays.sort(digits);
        return 10 * (digits[0] + digits[1]) + digits[2] + digits[3];
    }
}

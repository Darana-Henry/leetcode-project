//https://leetcode.com/problems/check-if-number-has-equal-digit-count-and-digit-value/
package algorithms.easy.c;

public class CheckIfNumberHasEqualDigitCountAndDigitValue {
    public static void main(String[] args) {
        CheckIfNumberHasEqualDigitCountAndDigitValue value = new CheckIfNumberHasEqualDigitCountAndDigitValue();
        System.out.println("Output:\t" + value.digitCount("1210"));
        System.out.println("Output:\t" + value.digitCount("030"));
    }

    public boolean digitCount(String num) {
        int[] digits = new int[10];
        int n = num.length();

        for (int i = 0; i < n; i++)
            digits[num.charAt(i) - '0']++;

        for (int i = 0; i < n; i++)
            if (digits[i] != num.charAt(i) - '0') return false;

        return true;
    }
}

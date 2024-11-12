//https://leetcode.com/problems/check-if-the-number-is-fascinating/
package algorithms.easy.c;

public class CheckIfTheNumberIsFascinating {
    public static void main(String[] args) {
        CheckIfTheNumberIsFascinating fascinating = new CheckIfTheNumberIsFascinating();
        System.out.println("Output:\t" + fascinating.isFascinating(192));
        System.out.println("Output:\t" + fascinating.isFascinating(100));
    }

    public boolean isFascinating(int n) {
        int[] digits = new int[10];
        String str = "" + n + (2 * n) + (3 * n);

        for (char ch : str.toCharArray())
            if (++digits[ch - '0'] > 1) return false;

        return digits[0] == 0 && str.length() == 9;
    }}

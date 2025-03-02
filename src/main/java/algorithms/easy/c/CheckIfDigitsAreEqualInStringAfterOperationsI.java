//https://leetcode.com/problems/check-if-digits-are-equal-in-string-after-operations-i/
package algorithms.easy.c;

public class CheckIfDigitsAreEqualInStringAfterOperationsI {
    public static void main(String[] args) {
        CheckIfDigitsAreEqualInStringAfterOperationsI obj = new CheckIfDigitsAreEqualInStringAfterOperationsI();
        System.out.println("Output:\t" + obj.hasSameDigits("3902"));
        System.out.println("Output:\t" + obj.hasSameDigits("34789"));
    }

    public boolean hasSameDigits(String s) {
        while (s.length() > 2) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < s.length() - 1; i++) {
                int left = s.charAt(i) - '0';
                int right = s.charAt(i + 1) - '0';
                int digit = (left + right) % 10;
                sb.append(digit);
            }
            s = sb.toString();
        }
        return s.charAt(0) == s.charAt(1);
    }
}

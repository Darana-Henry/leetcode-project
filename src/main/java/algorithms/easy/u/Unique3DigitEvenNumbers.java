//https://leetcode.com/problems/unique-3-digit-even-numbers/
package algorithms.easy.u;

import java.util.HashSet;
import java.util.Set;

public class Unique3DigitEvenNumbers {
    public static void main(String[] args) {
        Unique3DigitEvenNumbers obj = new Unique3DigitEvenNumbers();
        System.out.println("Output:\t" + obj.totalNumbers(new int[]{1, 2, 3, 4}));
        System.out.println("Output:\t" + obj.totalNumbers(new int[]{0, 2, 2}));
        System.out.println("Output:\t" + obj.totalNumbers(new int[]{6, 6, 6}));
        System.out.println("Output:\t" + obj.totalNumbers(new int[]{1, 3, 5}));
    }

    public int totalNumbers(int[] digits) {
        int n = digits.length;
        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < n; i++) {
            if (digits[i] == 0) continue;
            for (int j = 0; j < n; j++) {
                if (j == i) continue;
                for (int k = 0; k < n; k++) {
                    if (k == i || k == j) continue;
                    if (digits[k] % 2 == 0) set.add(digits[i] * 100 + digits[j] * 10 + digits[k]);

                }
            }
        }

        return set.size();
    }
}


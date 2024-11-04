//https://leetcode.com/problems/finding-3-digit-even-numbers/
package algorithms.easy.f;

import java.util.ArrayList;
import java.util.List;

public class Finding3DigitEvenNumbers {
    public static void main(String[] args) {
        Finding3DigitEvenNumbers digits = new Finding3DigitEvenNumbers();
        System.out.println("Output:\t" + digits.findEvenNumbers(new int[]{2, 1, 3, 0}));
        System.out.println("Output:\t" + digits.findEvenNumbers(new int[]{2, 2, 8, 8, 2}));
        System.out.println("Output:\t" + digits.findEvenNumbers(new int[]{3, 7, 5}));
    }

    public int[] findEvenNumbers(int[] digits) {
        int[] available = new int[10];
        List<Integer> answer = new ArrayList<>();

        for (int digit : digits)
            available[digit]++;

        for (int i = 100; i < 1000; i += 2) {
            int[] required = new int[10];

            for (int num = i; num > 0; num /= 10)
                required[num % 10]++;

            if (canWork(available, required)) answer.add(i);
        }
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }

    public boolean canWork(int[] available, int[] required) {
        for (int i = 0; i < 10; i++)
            if (available[i] < required[i]) return false;
        return true;
    }
}

//https://leetcode.com/problems/split-with-minimum-sum/
package algorithms.easy.s;

public class SplitWithMinimumSum {
    public static void main(String[] args) {
        SplitWithMinimumSum split = new SplitWithMinimumSum();
        System.out.println("Output:\t" + split.splitNum(4325));
        System.out.println("Output:\t" + split.splitNum(687));
    }

    public int splitNum(int num) {
        int n = 0;
        int[] digits = new int[10];
        int[] parts = new int[2];

        while (num != 0) {
            digits[num % 10]++;
            num /= 10;
            n++;
        }

        for (int i = 0, index = 0; i < n; i++) {
            while (digits[index] == 0) index++;

            digits[index]--;
            parts[i % 2] = parts[i % 2] * 10 + index;
        }

        return parts[0] + parts[1];
    }
}

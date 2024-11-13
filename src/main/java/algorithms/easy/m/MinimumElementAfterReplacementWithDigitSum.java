//https://leetcode.com/problems/minimum-element-after-replacement-with-digit-sum/
package algorithms.easy.m;

public class MinimumElementAfterReplacementWithDigitSum {
    public static void main(String[] args) {
        MinimumElementAfterReplacementWithDigitSum replacement = new MinimumElementAfterReplacementWithDigitSum();
        System.out.println("Output:\t" + replacement.minElement(new int[]{10, 12, 13, 14}));
        System.out.println("Output:\t" + replacement.minElement(new int[]{1, 2, 3, 4}));
        System.out.println("Output:\t" + replacement.minElement(new int[]{999, 19, 199}));
    }

    public int minElement(int[] nums) {
        int answer = Integer.MAX_VALUE;

        for (int num : nums) {
            int sum = 0;
            while (num > 0) {
                sum += num % 10;
                num /= 10;
            }
            answer = Math.min(answer, sum);
        }

        return answer;
    }
}

//https://leetcode.com/problems/difference-between-element-sum-and-digit-sum-of-an-array/
package algorithms.easy.d;

public class DifferenceBetweenElementSumAndDigitSumOfAnArray {
    public static void main(String[] args) {
        DifferenceBetweenElementSumAndDigitSumOfAnArray diff = new DifferenceBetweenElementSumAndDigitSumOfAnArray();
        System.out.println("Output:\t" + diff.differenceOfSum(new int[]{1, 15, 6, 3}));
        System.out.println("Output:\t" + diff.differenceOfSum(new int[]{1, 2, 3, 4}));
    }

    public int differenceOfSum(int[] nums) {
        int elementSum = 0, digitSum = 0;

        for (int num : nums) {
            elementSum += num;

            while (num > 0) {
                digitSum += num % 10;
                num /= 10;
            }
        }
        return Math.abs(elementSum - digitSum);
    }
}

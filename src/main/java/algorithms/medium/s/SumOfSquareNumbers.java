//https://leetcode.com/problems/sum-of-square-numbers/
package algorithms.medium.s;

public class SumOfSquareNumbers {
    public static void main(String[] args) {
        SumOfSquareNumbers sumOfSquared = new SumOfSquareNumbers();
        System.out.println("Output:\t" + sumOfSquared.judgeSquareSum(5));
        System.out.println("Output:\t" + sumOfSquared.judgeSquareSum(3));
    }

    public boolean judgeSquareSum(int c) {

        long left = 0;
        long right = (int) Math.sqrt(c);

        while (left <= right) {
            long total = left * left + right * right;

            if (total == c)
                return true;
            else if (total < c)
                left++;
            else
                right--;
        }
        return false;
    }
}

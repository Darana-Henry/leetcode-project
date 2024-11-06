//https://leetcode.com/problems/sum-of-squares-of-special-elements/
package algorithms.easy.s;

public class SumOfSquaresOfSpecialElements {
    public static void main(String[] args) {
        SumOfSquaresOfSpecialElements special = new SumOfSquaresOfSpecialElements();
        System.out.println("Output:\t" + special.sumOfSquares(new int[]{1, 2, 3, 4}));
        System.out.println("Output:\t" + special.sumOfSquares(new int[]{2, 7, 1, 19, 18, 3}));
    }

    public int sumOfSquares(int[] nums) {
        int n = nums.length;
        int answer = 0;

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) answer += nums[i - 1] * nums[i - 1];
        }

        return answer;
    }
}

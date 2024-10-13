//https://leetcode.com/problems/check-if-bitwise-or-has-trailing-zeros/
package algorithms.easy.c;

public class CheckIfBitwiseORHasTrailingZeros {
    public static void main(String[] args) {
        CheckIfBitwiseORHasTrailingZeros trailing = new CheckIfBitwiseORHasTrailingZeros();
        System.out.println("Output:\t" + trailing.hasTrailingZeros(new int[]{1, 2, 3, 4, 5}));
        System.out.println("Output:\t" + trailing.hasTrailingZeros(new int[]{2, 4, 8, 16}));
        System.out.println("Output:\t" + trailing.hasTrailingZeros(new int[]{1, 3, 5, 7, 9}));
    }

    public boolean hasTrailingZeros(int[] nums) {
        int answer = 0;
        for (int num : nums)
            answer += (num & 1) ^ 1;
        return answer >= 2;
    }
}

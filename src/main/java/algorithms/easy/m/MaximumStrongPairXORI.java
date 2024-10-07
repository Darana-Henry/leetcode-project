//https://leetcode.com/problems/maximum-strong-pair-xor-i/
package algorithms.easy.m;

public class MaximumStrongPairXORI {
    public static void main(String[] args) {
        MaximumStrongPairXORI pair = new MaximumStrongPairXORI();
        System.out.println("Output:\t" + pair.maximumStrongPairXor(new int[]{1, 2, 3, 4, 5}));
        System.out.println("Output:\t" + pair.maximumStrongPairXor(new int[]{10, 100}));
        System.out.println("Output:\t" + pair.maximumStrongPairXor(new int[]{5, 6, 25, 30}));
    }

    public int maximumStrongPairXor(int[] nums) {
        int answer = 0;

        for (int x : nums)
            for (int y : nums)
                if (Math.abs(x - y) <= Math.min(x, y)) answer = Math.max(answer, x ^ y);

        return answer;
    }
}

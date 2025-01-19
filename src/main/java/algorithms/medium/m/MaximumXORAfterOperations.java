//https://leetcode.com/problems/maximum-xor-after-operations/
package algorithms.medium.m;

public class MaximumXORAfterOperations {
    public static void main(String[] args) {
        MaximumXORAfterOperations obj = new MaximumXORAfterOperations();
        System.out.println("Output:\t" + obj.maximumXOR(new int[]{3, 2, 4, 6}));
        System.out.println("Output:\t" + obj.maximumXOR(new int[]{1, 2, 3, 9, 2}));
    }

    public int maximumXOR(int[] nums) {
        int answer = 0;

        for (int num : nums)
            answer |= num;

        return answer;
    }
}

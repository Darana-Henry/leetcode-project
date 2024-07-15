//https://leetcode.com/problems/counting-bits/description/
package algorithms.easy;

public class CountingBits {
    public static void main(String[] args) {
        CountingBits cBits = new CountingBits();
        System.out.println("Output:\t" + cBits.countBits(2));
        System.out.println("Output:\t" + cBits.countBits(5));
    }

    public int[] countBits(int n) {
        int[] output = new int[n + 1];
        for (int i = 1; i < output.length; i++) {
            output[i] = output[i >> 1] + i % 2;
        }
        return output;
    }
}

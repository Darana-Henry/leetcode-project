//https://leetcode.com/problems/minimum-number-of-k-consecutive-bit-flips/
package algorithms.hard;

public class MinimumNumberOfKConsecutiveBitFlips {
    public static void main(String[] args) {
        MinimumNumberOfKConsecutiveBitFlips bitFlips = new MinimumNumberOfKConsecutiveBitFlips();
        System.out.println("Output:\t" + bitFlips.minKBitFlips(new int[]{0, 1, 0}, 1));
        System.out.println("Output:\t" + bitFlips.minKBitFlips(new int[]{1, 1, 0}, 2));
        System.out.println("Output:\t" + bitFlips.minKBitFlips(new int[]{0, 0, 0, 1, 0, 1, 1, 0}, 3));
    }

    public int minKBitFlips(int[] nums, int k) {
        int out = 0;
        int count = 0;
        boolean[] checkFlip = new boolean[nums.length];

        for (int i = 0; i < nums.length; i++) {
            if ((nums[i] == 0 && count % 2 == 0) || (nums[i] == 1 && count % 2 != 0)) {
                count++;
                out++;

                if (i + k - 1 >= nums.length)
                    return -1;
                else
                    checkFlip[i + k - 1] = true;
            }

            if (checkFlip[i])
                count--;
        }
        return out;
    }
}

//https://leetcode.com/problems/max-consecutive-ones-iii/description/
package algorithms.medium;

public class MaxConsecutiveOnesIII {
    public static void main(String[] args) {
        MaxConsecutiveOnesIII maxConsecutiveOnes = new MaxConsecutiveOnesIII();
        System.out.println("Output:\t" + maxConsecutiveOnes.longestOnes(new int[]{1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 0}, 2));
        System.out.println("Output:\t" + maxConsecutiveOnes.longestOnes(
                new int[]{0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 0, 0, 0, 1, 1, 1, 1}, 3));
    }

    public int longestOnes(int[] nums, int k) {
        int i = 0;
        int j = 0;
        while (i < nums.length) {
            if (nums[i] == 0)
                k--;
            if (k < 0) {
                if (nums[j] == 0)
                    k++;
                j++;
            }
            i++;

        }
        return i - j;
    }
}

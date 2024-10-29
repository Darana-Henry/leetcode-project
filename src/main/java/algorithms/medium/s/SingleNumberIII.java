//https://leetcode.com/problems/single-number-iii/description/
package algorithms.medium.s;

public class SingleNumberIII {

    public static void main(String[] args) {

        SingleNumberIII singleNumberIII = new SingleNumberIII();

        System.out.println("Output:\t" + singleNumberIII.singleNumber(new int[]{1, 2, 1, 3, 2, 5}));
        System.out.println("Output:\t" + singleNumberIII.singleNumber(new int[]{-1, 0}));
        System.out.println("Output:\t" + singleNumberIII.singleNumber(new int[]{0, 1}));
    }

    public int[] singleNumber(int[] nums) {
        int remainingNumbers = 0;
        int[] result = new int[2];

        for (int n : nums) {
            remainingNumbers ^= n;
        }

        remainingNumbers &= -remainingNumbers;

        for (int n : nums) {
            if ((remainingNumbers & n) == 0)
                result[0] ^= n;
            else
                result[1] ^= n;
        }
        return result;
    }
}

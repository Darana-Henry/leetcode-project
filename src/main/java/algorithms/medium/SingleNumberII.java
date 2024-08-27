///https://leetcode.com/problems/single-number-ii/
package algorithms.medium;

public class SingleNumberII {
    public static void main(String[] args) {
        SingleNumberII sn = new SingleNumberII();
        System.out.println("Output:\t" + sn.singleNumber(new int[]{2, 2, 3, 2}));
        System.out.println("Output:\t" + sn.singleNumber(new int[]{0, 1, 0, 1, 0, 1, 99}));
    }

    public int singleNumber(int[] nums) {
        int bit1 = 0;
        int bit2 = 0;

        for (int num : nums) {
            int newBit1 = (~bit1 & bit2 & num) | (bit1 & ~bit2 & ~num);
            int newBit2 = ~bit1 & (bit2 ^ num);
            bit1 = newBit1;
            bit2 = newBit2;
        }
        return bit2;
    }
}

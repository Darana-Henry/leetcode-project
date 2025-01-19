//https://leetcode.com/problems/bitwise-xor-of-all-pairings/
package algorithms.medium.b;

public class BitwiseXOROfAllPairings {
    public static void main(String[] args) {
        BitwiseXOROfAllPairings obj = new BitwiseXOROfAllPairings();
        System.out.println("Output:\t" + obj.xorAllNums(new int[]{2, 1, 3}, new int[]{10, 2, 5, 0}));
        System.out.println("Output:\t" + obj.xorAllNums(new int[]{1, 2}, new int[]{3, 4}));
    }

    public int xorAllNums(int[] nums1, int[] nums2) {
        int xor1 = 0, xor2 = 0;

        if (nums2.length % 2 != 0) for (int num : nums1)
            xor1 ^= num;

        if (nums1.length % 2 != 0) for (int num : nums2)
            xor2 ^= num;

        return xor1 ^ xor2;
    }
}

//https://leetcode.com/problems/neighboring-bitwise-xor/
package algorithms.medium.n;

public class NeighboringBitwiseXOR {
    public static void main(String[] args) {
        NeighboringBitwiseXOR obj = new NeighboringBitwiseXOR();
        System.out.println("Output:\t" + obj.doesValidArrayExist(new int[]{1, 1, 0}));
        System.out.println("Output:\t" + obj.doesValidArrayExist(new int[]{1, 1}));
        System.out.println("Output:\t" + obj.doesValidArrayExist(new int[]{1, 0}));
    }

    public boolean doesValidArrayExist(int[] derived) {
        int xor = 0;

        for (int num : derived)
            xor ^= num;

        return xor == 0;
    }
}

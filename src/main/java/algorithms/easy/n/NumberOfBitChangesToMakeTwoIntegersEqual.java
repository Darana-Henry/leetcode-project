//https://leetcode.com/problems/number-of-bit-changes-to-make-two-integers-equal/
package algorithms.easy.n;

public class NumberOfBitChangesToMakeTwoIntegersEqual {
    public static void main(String[] args) {
        NumberOfBitChangesToMakeTwoIntegersEqual bits = new NumberOfBitChangesToMakeTwoIntegersEqual();
        System.out.println("Output:\t" + bits.minChanges(13, 4));
        System.out.println("Output:\t" + bits.minChanges(21, 21));
        System.out.println("Output:\t" + bits.minChanges(14, 13));
    }

    public int minChanges(int n, int k) {
        k ^= n;
        int xorC = Integer.bitCount(k);
        k &= n;
        int andC = Integer.bitCount(k);
        return xorC == andC ? xorC : -1;
    }
}

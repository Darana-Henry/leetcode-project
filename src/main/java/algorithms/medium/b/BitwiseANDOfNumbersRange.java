//https://leetcode.com/problems/bitwise-and-of-numbers-range/
package algorithms.medium.b;

public class BitwiseANDOfNumbersRange {
    public static void main(String[] args) {
        BitwiseANDOfNumbersRange range = new BitwiseANDOfNumbersRange();
        System.out.println("Output:\t" + range.rangeBitwiseAnd(5, 7));
        System.out.println("Output:\t" + range.rangeBitwiseAnd(0, 0));
        System.out.println("Output:\t" + range.rangeBitwiseAndOptimized(1, 2147483647));
    }

    public int rangeBitwiseAndOptimized(int left, int right) {
        while (left < right) {
            right &= (right - 1);
        }
        return right;
    }

    public int rangeBitwiseAnd(int left, int right) {
        int shifts = 0;
        while (left != right) {
            left >>= 1;
            right >>= 1;
            shifts++;
        }
        return left << shifts;
    }
}
